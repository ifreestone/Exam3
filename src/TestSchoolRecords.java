import java.util.ArrayList;
import java.util.List;

public class TestSchoolRecords {
    public static void main(String[] args) {
        Student student1 = new Student("Bill", "111 Bill St.", "970-444-4444", "bill@student.com",
                "sophomore");
        Student student2 = new Student("Ted", "Ted Drive", "970-555-5555", "ted@student.com",
                "junior");
        Faculty faculty1 = new Faculty("Greg", "Greg Ave.", "101-101-1010", "greg@faculty.com",
                "Business Relations" , 1.0, "October 1st", "10AM - 3PM", "CEO");
        Faculty faculty2 = new Faculty("Miranda", "Miranda Way", "707-707-7070", "miranda@faculty.com",
                "Advertising" , 2.5, "November 20th", "9AM - 4PM", "Executive");
        Staff staff1 = new Staff("Josie", "Jose Ln.", "999-333-6666", "josie@staff.com",
                "Infrastructure" , 9999.9, "april 11th", "Lead Janitor");
        Staff staff2 = new Staff("Goku", "Planet Vegeta", "970-420-6969", "goku@staff.com",
                "Saiyan" , 17.0, "December 25th", "Super Saiyan");


        List<Person> Persons = new ArrayList<>();
        Persons.add(student1);
        Persons.add(student2);
        Persons.add(faculty1);
        Persons.add(faculty2);
        Persons.add(staff1);
        Persons.add(staff2);

        for (Person p : Persons) {
            System.out.println(p.toString());
        }
    }

    public static List<Person> returnEmployees(List<Person> Persons) {
        List<Person> Employees = new ArrayList<>();
        for (int i = 0; i < Persons.size(); i++) {
            if (Persons.get(i) instanceof Faculty || Persons.get(i) instanceof Staff) {
                Employees.add(Persons.get(i));
            }
        }
        return Employees;
    }
}
