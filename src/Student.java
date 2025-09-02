/*
 * Student extends Person
 * Dupla: Gustavo Cerqueira Murai e Igor Cerqueira Murai
 */

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program == null ? "" : program;
        if (year < 0) throw new IllegalArgumentException("year inválido");
        if (fee < 0) throw new IllegalArgumentException("fee inválido");
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program == null ? "" : program; }

    public int getYear() { return year; }
    public void setYear(int year) { if (year < 0) throw new IllegalArgumentException("year inválido"); this.year = year; }

    public double getFee() { return fee; }
    public void setFee(double fee) { if (fee < 0) throw new IllegalArgumentException("fee inválido"); this.fee = fee; }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}
