/*
 * IFSP - Campus Cubatão
 * Matéria: CBTLPR (Java)
 * Dupla: Gustavo Cerqueira Murai e Igor Cerqueira Murai
 *
 * ENUNCIADO — Exercício 02:
 * Um livro pode ser escrito por um ou muitos autores, por esta razão a classe Book deve ter um array de autores.
 * - O construtor deve receber um array de autores;
 * - Uma vez que o livro é instanciado, seu(s) autor(es) não podem ser adicionados/removidos;
 * - toString() deve retornar:
 *   "Book[name=?,authors={Author[name=?,email=?,gender=?],...},price=?,qty=?]".
 */

import java.util.Arrays;

public class Book {
    private final String name;
    private final Author[] authors; // array imutável estruturalmente (cópia defensiva)
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price, int qty) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name não pode ser vazio");
        if (authors == null || authors.length == 0) throw new IllegalArgumentException("authors não pode ser vazio");
        for (Author a : authors) if (a == null) throw new IllegalArgumentException("author não pode ser null");
        if (price < 0) throw new IllegalArgumentException("price não pode ser negativo");
        if (qty < 0) throw new IllegalArgumentException("qty não pode ser negativo");

        this.name = name;
        this.authors = Arrays.copyOf(authors, authors.length); // cópia defensiva
        this.price = price;
        this.qty = qty;
    }

    public String getName() { return name; }
    public Author[] getAuthors() { return Arrays.copyOf(authors, authors.length); } // retorna cópia
    public double getPrice() { return price; }
    public int getQty() { return qty; }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("price não pode ser negativo");
        this.price = price;
    }
    public void setQty(int qty) {
        if (qty < 0) throw new IllegalArgumentException("qty não pode ser negativo");
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book[name=").append(name).append(",authors={");
        for (int i = 0; i < authors.length; i++) {
            sb.append(authors[i].toString());
            if (i < authors.length - 1) sb.append(",");
        }
        sb.append("},price=").append(price).append(",qty=").append(qty).append("]");
        return sb.toString();
    }
}
