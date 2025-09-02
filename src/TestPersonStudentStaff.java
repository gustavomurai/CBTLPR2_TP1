/*
 * Teste das classes Person, Student e Staff
 * Dupla: Gustavo Cerqueira Murai e Igor Cerqueira Murai
 */

public class TestPersonStudentStaff {
    public static void main(String[] args) {
        System.out.println("=== TestPersonStudentStaff ===");

        // Person
        Person p = new Person("Maria", "Av. Brasil, 100");
        System.out.println("Person: " + p);
        p.setAddress("Rua das Flores, 55");
        System.out.println("Após setAddress: " + p);

        // Student
        Student s = new Student("João", "Rua A, 10", "ADS", 2025, 1500.00);
        System.out.println("Student: " + s);
        s.setProgram("Sistemas para Internet");
        s.setYear(2026);
        s.setFee(1800.50);
        s.setAddress("Rua B, 22");
        System.out.println("Após updates (Student): " + s);
        System.out.println("Getters Student -> program=" + s.getProgram() + ", year=" + s.getYear() + ", fee=" + s.getFee());

        // Staff
        Staff t = new Staff("Ana", "Av. Central, 200", "IFSP Cubatão", 8000.00);
        System.out.println("Staff: " + t);
        t.setSchool("IFSP Praia Grande");
        t.setPay(9000.00);
        t.setAddress("Av. Central, 210");
        System.out.println("Após updates (Staff): " + t);
        System.out.println("Getters Staff -> school=" + t.getSchool() + ", pay=" + t.getPay());

        System.out.println("=== Fim TestPersonStudentStaff ===");
    }
}
