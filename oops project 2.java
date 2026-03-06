interface Billable {
    double generateBill();
}

class Person {
    protected int id;
    protected String name;
    protected int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class Doctor extends Person {
    private String specialization;

    public Doctor(int id, String name, int age, String specialization) {
        super(id, name, age);
        this.specialization = specialization;
    }

    public void diagnose() {
        System.out.println("Doctor " + name + " diagnosing patients.");
    }
}

class Patient extends Person implements Billable {
    private String illness;
    private double fees;

    public Patient(int id, String name, int age, String illness, double fees) {
        super(id, name, age);
        this.illness = illness;
        this.fees = fees;
    }

    public void admit() {
        System.out.println("Patient " + name + " admitted for " + illness);
    }

    @Override
    public double generateBill() {
        return fees;
    }
}
class Main {
    public static void main(String[] args) {

        Doctor doc = new Doctor(1, "Dr.Raj", 45, "Cardiology");
        Patient pat = new Patient(2, "Meena", 30, "Fever", 1500);

        doc.diagnose();
        pat.admit();
        System.out.println("Bill Amount: " + pat.generateBill());
    }
}
