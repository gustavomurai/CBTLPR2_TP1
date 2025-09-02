/*
 * IFSP - Campus Cubatão
 * Matéria: CBTLPR (Java)
 * Dupla: Gustavo Cerqueira Murai e Igor Cerqueira Murai
 *
 * ENUNCIADO — Exercício 01:
 * Uma classe chamada Author é desenhada para servir de modelo para autores de livros:
 * - 3 atributos privados name (String), email (String), e gender (char contendo 'm' ou 'f');
 * - Um construtor para inicializar os atributos com base nos 3 parâmetros.
 * - Não existe um construtor default para Author [Author()].
 * - Criar métodos públicos: getName(), getEmail(), setEmail(), e getGender().
 * - Não existe setter para name e gender; estes atributos não podem ser alterados.
 * - Um método toString() que retorna "Author[name=?,email=?,gender=?]".
 * - Escreva a classe Author e desenvolva uma classe de teste para:
 *   * Testar construtor;
 *   * Verificar o método toString();
 *   * Testar o Setter;
 *   * Testar os Getters.
 */

public class Author {
    // Atributos privados (name e gender imutáveis após criação)
    private final String name;
    private String email;
    private final char gender; // aceita 'm' ou 'f'

    // Construtor obrigatório (sem construtor default)
    public Author(String name, String email, char gender) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name não pode ser vazio");
        if (email == null || email.isEmpty()) throw new IllegalArgumentException("email não pode ser vazio");
        if (gender != 'm' && gender != 'f') throw new IllegalArgumentException("gender deve ser 'm' ou 'f'");
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public char getGender() { return gender; }

    // Setter apenas para email
    public void setEmail(String email) {
        if (email == null || email.isEmpty()) throw new IllegalArgumentException("email não pode ser vazio");
        this.email = email;
    }

    // toString no formato exigido
    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}
