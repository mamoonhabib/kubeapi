# Course - Kubernetes for Full Stack Development

This is the middle tier API build using Java as core coding language and Postgre for Database. Swagger API are added for better information for consumer of these API.

## Environment setup

Install following:

- JDK 14
- Maven 3.3
- Docker
- Docker compose

[Ubuntu installation instructions](README-Ubuntu.md)

## Deployment instructions

- clone repository `git clone https://github.com/mamoonhabib/kubeapi.git`
- cd kubeapi/nameapi
- build jar by running `mvn clean install`
- cd kubeapi/deployment
- copy sample.env to .env file
- set db_user and db_pass in the .env file
- run `docker-compose up -d`

## User API

API docs `http://localhost:3000/swagger-ui.html`

- GET /users
- POST /users
- GET /users/{id}
- PUT /users/{id}
- DELETE /user/{id}

### User model

example

```
{"id":1, "fullname":"your name"}
```
