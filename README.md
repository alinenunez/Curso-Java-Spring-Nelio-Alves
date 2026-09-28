# 🚀 Curso Java Spring Professional - DevSuperior

Este repositório contém os projetos, exercícios e anotações desenvolvidos durante o curso **Java Spring Professional** da [DevSuperior](https://devsuperior.com.br/), ministrado pelo professor Nélio Alves.

O objetivo deste repositório é documentar a evolução na criação de APIs RESTful profissionais, modelagem de dados complexa e boas práticas de arquitetura utilizando o ecossistema Spring.

---

## 💻 Tecnologias e Ferramentas

Os projetos deste repositório foram construídos utilizando as seguintes tecnologias padrão da indústria:

*   **Linguagem:** Java (17 / 21)
*   **Framework Principal:** Spring Boot (Web, Data JPA)
*   **Gerenciador de Dependências:** Maven
*   **Banco de Dados:** H2 Database (Testes/Memória) e PostgreSQL / SQL Server
*   **ORM:** Hibernate / JPA
*   **IDE Recomendada:** IntelliJ IDEA

---

## 📂 Estrutura de Projetos

*   **`desafio01` (Fundamentos):** Projeto introdutório focado em entender as engrenagens do Spring Boot. Aborda Injeção de Dependência, Inversão de Controle e a utilização de anotações essenciais como `@Component`, `@Service` e `@RestController`.
*   **`dscommerce` (Projeto Principal):** Construção de uma API REST completa para um sistema de e-commerce. Aborda:
    *   Modelagem de domínio e relacionamentos de banco de dados (`@OneToMany`, `@ManyToOne`, `@ManyToMany`).
    *   Seed de banco de dados com arquivos `import.sql`.
    *   Padrão DTO (Data Transfer Object).
    *   Tratamento de exceções e validações.
    *   Consultas customizadas com JPQL.
