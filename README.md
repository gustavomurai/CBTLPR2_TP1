# 📘 CBTLPR2 — Trabalho Prático 01 (Java)

**Disciplina:** Linguagem de Programação 2 (Java)  
**Professor:** Wellington Tuler Moraes  
**Instituição:** IFSP — Campus Cubatão  
**Dupla:** Gustavo Cerqueira Murai e Igor Cerqueira Murai  

---

## 📝 Enunciado Resumido

### Exercício 1 — Author
- Criar a classe `Author` com:
  - `name` (String, imutável), `email` (String), `gender` (char 'm' ou 'f').
  - Construtor obrigatório (sem construtor default).
  - Métodos `getName()`, `getEmail()`, `setEmail()`, `getGender()`.
  - `toString()` retornando `Author[name=?,email=?,gender=?]`.
- Criar classe `TestAuthor` para validar construtor, getters, setter e toString.

### Exercício 2 — Book
- Criar a classe `Book` com:
  - `name` (String), `authors` (array de `Author`), `price` (double), `qty` (int).
  - Construtor recebendo um array de autores (imutável).
  - Métodos getters/setters para `price` e `qty`.
  - `toString()` retornando no formato:
    ```
    Book[name=?,authors={Author[...]},price=?,qty=?]
    ```
- Criar classe `TestBook` para validar construtor, getters, setters e imutabilidade.

### Exercício 3 — Person, Student, Staff
- Criar hierarquia de classes:
  - `Person`: atributos `name`, `address`.
  - `Student extends Person`: atributos `program`, `year`, `fee`.
  - `Staff extends Person`: atributos `school`, `pay`.
  - Métodos getters/setters para todos.
  - `toString()` formatado para cada classe.
- Criar `TestPersonStudentStaff` para validar todos os métodos.

---

## 📂 Estrutura do Projeto

CBTLPR2_TP_01_JAVA/
├─ src/
│ ├─ Author.java
│ ├─ TestAuthor.java
│ ├─ Book.java
│ ├─ TestBook.java
│ ├─ Person.java
│ ├─ Student.java
│ ├─ Staff.java
│ └─ TestPersonStudentStaff.java
└─ bin/ # arquivos .class gerados após compilação

