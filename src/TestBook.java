/*
 * Teste da classe Book
 * Dupla: Gustavo Cerqueira Murai e Igor Cerqueira Murai
 *
 * Objetivo: testar construtor, getters, setters e imutabilidade do array de autores.
 */

public class TestBook {
    public static void main(String[] args) {
        System.out.println("=== TestBook ===");

        // Criando autores (dica do enunciado)
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');

        // Criando o livro
        Book b = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println("toString: " + b);

        // Testar getters
        System.out.println("name: " + b.getName());
        System.out.println("price: " + b.getPrice());
        System.out.println("qty: " + b.getQty());

        // Testar setters
        b.setPrice(29.90);
        b.setQty(120);
        System.out.println("Após setPrice e setQty: " + b);

        // Verificar imutabilidade estrutural (alterando array copiado)
        Author[] copia = b.getAuthors();
        copia[0] = new Author("Hacker", "hack@evil.com", 'm'); // não deve afetar o Book
        System.out.println("Após modificar array copiado: " + b);

        System.out.println("=== Fim TestBook ===");
    }
}
