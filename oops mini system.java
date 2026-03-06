class User {
    protected int id;
    protected String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void login() {
        System.out.println(name + " logged in.");
    }

    public String getAccessLevel() {
        return "General User";
    }
}

class Employee extends User {
    private double salary;
    private String role;

    public Employee(int id, String name, double salary, String role) {
        super(id, name);
        this.salary = salary;
        this.role = role;
    }

    public double calculateSalary() {
        return salary;
    }

    @Override
    public String getAccessLevel() {
        return "Employee Access";
    }
}

class Student extends User {
    private String course;

    public Student(int id, String name, String course) {
        super(id, name);
        this.course = course;
    }

    public void enroll() {
        System.out.println(name + " enrolled in " + course);
    }

    @Override
    public String getAccessLevel() {
        return "Student Access";
    }
}

class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String u, String p) {
        return username.equals(u) && password.equals(p);
    }
}
class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(1, "Ravi", 50000, "Manager");
        Student stu = new Student(2, "Priya", "Java");

        emp.login();
        System.out.println("Salary: " + emp.calculateSalary());
        System.out.println(emp.getAccessLevel());

        stu.login();
        stu.enroll();
        System.out.println(stu.getAccessLevel());
    }
}






