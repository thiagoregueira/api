# API completa de produtos

## Descrição

Esta é uma aplicação Spring Boot projetada para fornecer uma API RESTful para um sistema de gerenciamento de produtos. Ela permite criar, recuperar, atualizar e excluir informações de produtos em um banco de dados.

## Funcionalidades

- **Operações CRUD**: Criar, Ler, Atualizar e Excluir produtos.
- **Persistência de Dados**: Integração com um banco de dados PostgreSQL para armazenar dados de produtos.
- **HATEOAS**: Implementação de Hypermedia as the Engine of Application State para navegação dinâmica.
- **Validação de Dados**: Utilização do framework de validação do Spring para garantir a integridade dos dados.
- **Serviços RESTful**: Desenvolvimento de API REST seguindo as melhores práticas.

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- Spring HATEOAS
- Spring Web MVC
- Driver PostgreSQL
- Java 17

## Primeiros Passos

### Pré-requisitos

- JDK 17
- Maven
- PostgreSQL

### Executando a Aplicação

1. Clone o repositório:
git clone https://github.com/thiagoregueira/com.crud_products.api.git

2. Navegue até o diretório do projeto:
cd com.crud_products.api

3. Configure o arquivo `application.properties` com suas credenciais do PostgreSQL e detalhes do banco de dados.

4. Construa e execute a aplicação usando Maven:
mvn spring-boot:run


## Endpoints da API

Os seguintes endpoints estão disponíveis na API:

- `POST /products`: Cria um novo produto.
- `GET /products`: Recupera uma lista de todos os produtos.
- `GET /products/{id}`: Recupera um produto pelo seu ID.
- `PUT /products/{id}`: Atualiza as informações de um produto.
- `DELETE /products/{id}`: Exclui um produto.


## Licença

Este projeto está licenciado sob a Licença MIT 
