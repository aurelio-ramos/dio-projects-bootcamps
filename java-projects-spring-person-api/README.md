# API REST de gerenciamento de pessoas
###  Este projeto utiliza Java 11 e [Spring Boot 2.6.2](https://github.com/spring-projects/spring-boot/releases/tag/v2.6.2) criado com [Spring initializr](https://start.spring.io/)

<p align="center">
 <a href="#-sobre-o-projeto">Sobre</a> •
 <a href="#-roadmap">Roadmap</a> •
 <a href="#-como-executar-o-projeto">Como executar</a> • 
 <a href="#-tecnologias">Tecnologias</a> •  
 <a href="#user-content--licença">Licença</a>
</p>

## 💻 Sobre o projeto

Sistema para o gerenciamento de pessoas de uma empresa através de uma API REST, criada com o Spring Boot.

---

## ⚙️ Roadmap

- [ ] Durante a sessão, serão desenvolvidos e abordados os seguintes tópicos:
  - [X] Setup inicial de projeto com o Spring Boot Initialzr
  - [X] Criação de modelo de dados para o mapeamento de entidades em bancos de dados
  - [ ] Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
    - [X] Cadastro de pessoas
    - [X] Buscar todas pessoas cadastradas
    - [X] Buscar pessoa por id
    - [X] Remover pessoa por id
  - [ ] Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
  - [ ] Desenvolvimento de testes unitários para validação das funcionalidades

---
## 🚀 Como executar o projeto

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas: [Git](https://git-scm.com), [Java 11](https://jdk.java.net/java-se-ri/11).

Além disto é bom ter um editor para trabalhar com o código como [VSCode](https://code.visualstudio.com/)

### 🎲 Rodando o Projeto 

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

[http://localhost:8080/api/v1/people](http://localhost:8080/api/v1/people)

Para visualizar o h2-console, lembrando que o dsn estará no log do servidor:
[http://localhost:8080/h2-console/](http://localhost:8080/h2-console/)

---
## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Java 11 ou versões superiores](https://laravel.com/docs)
- [Maven 3.6.3 ou versões superiores](https://nodejs.org/en/)

As seguintes dependências foram incluidas no projeto:
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.devtools)
- [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)
- [Spring Web](https://docs.spring.io/spring-boot/docs/current/reference/html/web.html#web)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [H2 Database](https://www.h2database.com/html/main.html)
- [Lombok](https://projectlombok.org/)
---
## 💪 Como contribuir para o projeto

1. Faça um **fork** do projeto.
2. Crie uma nova branch com as suas alterações: `git checkout -b my-feature`
3. Salve as alterações e crie uma mensagem de commit contando o que você fez: `git commit -m "feature: My new feature"`
4. Envie as suas alterações: `git push origin my-feature`

## 📝 Licença

Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](../LICENSE) para mais detalhes.

## Créditos e Referências

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)
* [Repositório Rodrigo Peleias](https://github.com/rpeleias-v1/personapi_digital_innovation_one)
* [slides apresentados como o roteiro utilizado para o desenvolvimento do projeto](https://drive.google.com/file/d/1crVPOVl6ok2HeYjh3fjQuGQn2lDZVHrn/view?usp=sharing)