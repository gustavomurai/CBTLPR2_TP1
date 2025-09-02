/*
 * Staff extends Person
 * Dupla: Gustavo Cerqueira Murai e Igor Cerqueira Murai
 */

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school == null ? "" : school;
        if (pay < 0) throw new IllegalArgumentException("pay inválido");
        this.pay = pay;
    }

    public String getSchool() { return school; }
    public void setSchool(String school) { this.school = school == null ? "" : school; }

    public double getPay() { return pay; }
    public void setPay(double pay) { if (pay < 0) throw new IllegalArgumentException("pay inválido"); this.pay = pay; }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}
