/*
 * Teste da classe Author
 * Dupla: Gustavo Cerqueira Murai e Igor Cerqueira Murai
 *
 * Objetivo: testar construtor, getters, setter e toString.
 */

public class TestAuthor {
    public static void main(String[] args) {
        System.out.println("=== TestAuthor ===");
        // Testar construtor e toString
        Author a = new Author("Wellington Tuler", "tulermoraes@yahoo.com", 'm');
        System.out.println("toString: " + a.toString());

        // Testar getters
        System.out.println("getName: " + a.getName());
        System.out.println("getEmail: " + a.getEmail());
        System.out.println("getGender: " + a.getGender());

        // Testar setEmail
        a.setEmail("tuler@ifsp.edu.br");
        System.out.println("Após setEmail: " + a.toString());

        System.out.println("=== Fim TestAuthor ===");
    }
}
