# 📝 ToDo API - Spring Boot

API REST para gerenciamento de tarefas (To-Do List).

## 🚀 Tecnologias
- Java 17
- Spring Boot
- Spring Data JPA
- H2 / PostgreSQL
- Maven

## 📌 Funcionalidades
- Criar tarefa
- Listar tarefas
- Atualizar tarefa
- Excluir tarefa

## 🔗 Endpoints
| Método | Endpoint | Descrição |
|------|---------|----------|
| POST | /tasks | Criar tarefa |
| GET | /tasks | Listar tarefas |
| PUT | /tasks/{id} | Atualizar |
| DELETE | /tasks/{id} | Remover |

## ▶️ Como rodar
```bash
mvn spring-boot:run
