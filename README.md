# 🎮 DSLIST 

Este projeto foi de grande contribuição para meu aprendizado em Spring-boot, aprendi vários conceitos novos e revisei outros que já conhecia, este projeto tem somente o intuito de me aprofundar mais no 
desenvolvimento backend e desenvolvimento WEB utilizando spring.

## 🎓 O que aprendi com esse projeto? 

- Cliente/servidor, HTTP, JSON
- Padrão Rest para API WEB
- Estruturação de projeto Spring Rest
- Entidades e ORM
- Database seeding
- Padrão camadas
- Controller, service, repository
- Padrão DTO
- Classe de associação, embedded id
- Consultas SQL no Spring Data JPA
- Projections
- Ambiente local com Docker
- Processo de deploy com CI/CD
- Implementação de endpoint
- Verbo HTTP e idempotência

---

## 📖 Sobre o Projeto

Este projeto é um sistema de gerenciamento de jogos em listas de jogos. Ele permite pegar uma lista por ID, pegar todas as listas, pegar todos os jogos de uma determinada lista e alterar a posição dos jogos
em uma determinada lista. Este projeto foi desenvolvido para que eu conhecer o framework Spring-boot e juntamente a ele o desenvolvimento o WEB com a utilização de um banco de dados relacional como o 
Postgres
---

## 🛠 Tecnologias Utilizadas  
  
Liste as tecnologias e ferramentas usadas no projeto.  

- **Java**
- **Spring Boot**  
- **H2 Database**    
- **PostgreSQL**  
- **Maven**  

---

## ⚙️ Requisitos  
  
Liste os requisitos necessários para rodar o projeto:  

- Java 21  
- Maven 3.8+  
- PostgreSQL 
- Docker  

---

## 🚀 Configuração  
### Configuração do application-test.properties
  ```
# H2 Connection
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# H2 Client
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Show SQL
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### Configuração do application-dev.properties
  ```
#spring.jpa.properties.jakarta.persistence.schema-generation.create-source=metadata
#spring.jpa.properties.jakarta.persistence.schema-generation.scripts.action=create
#spring.jpa.properties.jakarta.persistence.schema-generation.scripts.create-target=create.sql
#spring.jpa.properties.hibernate.hbm2ddl.delimiter=;

spring.datasource.url=jdbc:postgresql://localhost:5433/dslist
spring.datasource.username=postgres
spring.datasource.password=1234567

spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.hibernate.ddl-auto=none
```

### Configuração do application.properties
  ```
spring.profiles.active=${APP_PROFILE:test}
spring.jpa.open-in-view=false
```  
## 📂 Estrutura do Projeto  
  
src/  
├── main/  
│   ├── java/  
│   │   └── com.exemplo.projeto/  
│   │       ├── controller/  
│   │       ├── service/  
│   │       ├── repository/  
│   │       └── model/  
│   └── resources/  
│       ├── application.properties  
│       └── data.sql  

---

## 📝 Como Usar  

### GET 

Retorna todos os games.  
http://localhost:8080/games  

Retorna todas as listas.  
http://localhost:8080/lists  

### POST

Altera a posição do game em uma determinada lista.  
http://localhost:8080/lists/2/replacement  

Body (JSON):
```json
{
	"sourceIndex": 3,
    "destinationIndex": 1 
}
```

