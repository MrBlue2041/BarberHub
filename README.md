# 💈 BarberHub

**Plataforma SaaS para gerenciamento e presença digital de barbearias.**

🚧 **Status do projeto: Em desenvolvimento**

O BarberHub é um projeto em desenvolvimento que tem como objetivo oferecer uma plataforma para barbearias gerenciarem seus negócios e construírem sua presença digital em um único lugar.

A proposta é permitir que proprietários administrem suas barbearias de forma organizada, com possibilidade de personalização e expansão conforme as necessidades de cada negócio.

## 🎯 Objetivo

Desenvolver uma aplicação web escalável, utilizando uma arquitetura que permita atender diferentes clientes e suas respectivas barbearias, mantendo os dados organizados e separados.

O projeto também tem como objetivo aprofundar conhecimentos em desenvolvimento backend, construção de APIs REST e desenvolvimento de aplicações com Java e Spring Boot.

## ✨ Funcionalidades planejadas

- [x] Cadastro e gerenciamento de contas.
- [x] Estrutura inicial para cadastro de barbearias.
- [ ] Atualização e exclusão de barbearias.
- [ ] Associação de múltiplas barbearias a uma mesma conta.
- [ ] Gerenciamento de barbeiros.
- [ ] Páginas personalizadas para cada barbearia.
- [ ] URLs personalizadas por barbearia.
- [ ] Personalização visual com logotipo e cores.
- [ ] Implementação de planos e funcionalidades SaaS.
- [ ] Autenticação e autorização de usuários.

> **Nota:** O projeto está em desenvolvimento ativo. A lista acima representa o progresso atual e as funcionalidades planejadas, que poderão ser ajustadas durante a evolução da aplicação.

## 🛠️ Tecnologias utilizadas

- **Java** — linguagem principal.
- **Spring Boot** — desenvolvimento da API backend.
- **Spring Data JPA / Hibernate** — persistência e mapeamento de entidades.
- **PostgreSQL** — banco de dados relacional.
- **Flyway** — versionamento e gerenciamento de migrações do banco de dados.
- **Maven** — gerenciamento de dependências e build.
- **Git e GitHub** — versionamento e acompanhamento do desenvolvimento.

## 🏗️ Arquitetura

A aplicação está sendo estruturada com separação de responsabilidades entre as camadas:

- **Controller:** recebe e processa as requisições HTTP.
- **Service:** concentra as regras de negócio.
- **Repository:** realiza as operações de persistência.
- **Entity:** representa as entidades e o mapeamento com o banco de dados.
- **Exception:** centraliza o tratamento de erros da aplicação.

A estrutura inicial já contempla o gerenciamento de contas e a modelagem de barbearias relacionadas aos seus proprietários.

## 🗺️ Próximas etapas

O desenvolvimento seguirá uma abordagem incremental, priorizando:

1. Concluir as operações CRUD das entidades existentes.
2. Implementar validações e tratamento consistente de erros.
3. Desenvolver autenticação e controle de acesso.
4. Expandir o gerenciamento de barbearias e barbeiros.
5. Desenvolver as funcionalidades de personalização e os recursos SaaS.
6. Implementar testes automatizados e preparar a aplicação para implantação.

## 📌 Status atual

O BarberHub encontra-se na fase inicial de desenvolvimento do backend. A estrutura do projeto, o gerenciamento de contas e a modelagem inicial das barbearias estão sendo implementados e testados.

Novas funcionalidades serão adicionadas progressivamente, conforme a evolução do projeto.

## 👨‍💻 Desenvolvedor

Projeto pessoal desenvolvido por **Juliano Ferreira(MrBlue2041)**, com foco em Java, Spring Boot, desenvolvimento backend e arquitetura de aplicações SaaS.

---

*Este projeto está em desenvolvimento e seu escopo pode sofrer alterações durante o processo de implementação.*
