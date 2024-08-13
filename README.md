# Workshop Spring Boot 3 e JPA

Este projeto faz parte de um workshop do professor Dr. Nelio Alves de Spring Boot 3 e JPA para criar aplicações Java.

## Objetivos

- Configurar um projeto Spring Boot com JPA
- Realizar operações de CRUD (Create, Read, Update, Delete)
- Configurar e utilizar o banco de dados H2 em memória para testes
- Implementar relacionamentos entre entidades JPA (Many-to-Many, One-to-Many, etc.)
- Utilizar o Spring Data JPA para simplificar o acessor ao banco de dados

## Tecnologias Utilizadas

- **Java 17**: Verção LTS do Java.
- **Spring Boot 3**: Framework para criação de aplicações.
- **Spring Data JPA**: Abstração sobre a JPA para simplificar o acesso a banco de dados.
- **H2 Database**: Banco de dados em memória para testes em desenvolvimento.
- **Maven**: Ferramenta de automação de build e gerenciamento de dependências.


## Como Executar

1. **Clonar o repositório**:

   ```bash
   git clone https://github.com/Pilatii/workshop-springboot3-jpa.git

2. **Navegar até o diretório do projeto**:

    ```bash
   cd workshop-springboot3-jpa

3. **Construir o projeto usando Maven**:

    ```bash
   ./mvnw clean install

4. **Executar o projeto**:

   ```bash
   ./mvnw spring-boot:run

5. **A aplicação estará disponível em http://localhost:8080**.

## Endpoints da API

Alguns endpoints disponíveis na aplicação:

- `GET /users`: Retorna todos os usuários no banco.
- `GET /users/{id}`: Busca um usuário por ID.
- `POST /users`: Cria um novo usuário.
- `PUT /users/{id}`: Atualiza um usuário existente.
- `DELETE /users/{id}`: Deleta um usuário pelo ID.
