public class Doctor extends HospitalEmployee {
    private String specialty;

    public Doctor(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void work() {
        super.work();
        System.out.println(name + " is a(n) " + specialty + " doctor.");
    }

    @Override
    public String toString() {
        return super.toString() + " " + specialty;
    }
}
