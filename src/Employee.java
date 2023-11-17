abstract class Employee extends Person{
    private String department;
    private double monthlySalary;
    private String dateHired;
    public Employee(String name, String address, String phoneNumber, String emailAddress, String department,
                    double monthlySalary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        String printableString = super.toString() + ", " + department + ", $" + monthlySalary + ", " + dateHired;
        return printableString;
    }
}
