public class Student extends Person {
    private String status;

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }
    @Override
    public String toString() {
        String printableString = super.toString() + ", " + status;
        return printableString;
    }
}
