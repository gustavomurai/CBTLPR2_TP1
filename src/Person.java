/*
 * IFSP - Campus Cubatão
 * Matéria: CBTLPR (Java)
 * Dupla: Gustavo Cerqueira Murai e Igor Cerqueira Murai
 *
 * ENUNCIADO — Exercício 03:
 * Implementar Person -> Student e Staff conforme o diagrama/descrição.
 */

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name não pode ser vazio");
        this.name = name;
        this.address = address == null ? "" : address;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address == null ? "" : address; }

    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}

