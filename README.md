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

executar cada exercício

Exercício 1 (Author):

java -cp bin TestAuthor


Exercício 2 (Book):

java -cp bin TestBook


Exercício 3 (Person / Student / Staff):

java -cp bin TestPersonStudentStaff

✅ Exemplos de Saída
Exercício 1
=== TestAuthor ===
toString: Author[name=Wellington Tuler,email=tulermoraes@yahoo.com,gender=m]
getName: Wellington Tuler
getEmail: tulermoraes@yahoo.com
getGender: m
Após setEmail: Author[name=Wellington Tuler,email=tuler@ifsp.edu.br,gender=m]
=== Fim TestAuthor ===

Exercício 2
=== TestBook ===
toString: Book[name=Java for Dummy,authors={Author[name=Autor 01,email=autor01@somewhere.com.br,gender=m],Author[name=Autor 02,email=autor02@nowhere.com.br,gender=m]},price=19.99,qty=99]
name: Java for Dummy
price: 19.99
qty: 99
Após setPrice e setQty: Book[name=Java for Dummy,authors={Author[name=Autor 01,email=autor01@somewhere.com.br,gender=m],Author[name=Autor 02,email=autor02@nowhere.com.br,gender=m]},price=29.9,qty=120]
Após modificar array copiado: Book[name=Java for Dummy,authors={Author[name=Autor 01,email=autor01@somewhere.com.br,gender=m],Author[name=Autor 02,email=autor02@nowhere.com.br,gender=m]},price=29.9,qty=120]
=== Fim TestBook ===

Exercício 3
=== TestPersonStudentStaff ===
Person: Person[name=Maria,address=Av. Brasil, 100]
Após setAddress: Person[name=Maria,address=Rua das Flores, 55]
Student: Student[Person[name=João,address=Rua A, 10],program=ADS,year=2025,fee=1500.0]
Após updates (Student): Student[Person[name=João,address=Rua B, 22],program=Sistemas para Internet,year=2026,fee=1800.5]
Getters Student -> program=Sistemas para Internet, year=2026, fee=1800.5
Staff: Staff[Person[name=Ana,address=Av. Central, 200],school=IFSP Cubatão,pay=8000.0]
Após updates (Staff): Staff[Person[name=Ana,address=Av. Central, 210],school=IFSP Praia Grande,pay=9000.0]
Getters Staff -> school=IFSP Praia Grande, pay=9000.0
=== Fim TestPersonStudentStaff ===
