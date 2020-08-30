# Course - Kubernetes for Full Stack Development

This is the middle tier API build using nest.js and typescript as core coding language. Swagger API are added for better information for consumer of these application.

## Docker Image

`docker pull faheemfactor/course-kubernetes-full-stack-development:middle-tier-java-api`

# Ubuntu 20 environment setup instructions

e

### Java 14

```
$ sudo apt update
$ sudo apt upgrade
$ sudo apt install openjdk-14-jdk
$ java -version
```

[installing Java 14 on Ubuntu 20](https://linuxhint.com/install_jdk_14_ubuntu/)

### Maven 3.3

```
$ sudo apt update
$ sudo apt install maven
$ mvn -version
```

[installing Maven on Ubuntu 20](https://linuxize.com/post/how-to-install-apache-maven-on-ubuntu-20-04/)

### Docker and Docker-Compose

```
$ sudo apt update
$ sudo apt install docker.io
$ sudo systemctl enable --now docker
$ docker --version
$ docker run hello-world # to verify installation

$ sudo apt install docker-compose
$ docker-compose version
```

[installing Docker and Docker Compose on Ubuntu 20](https://www.techiediaries.com/ubuntu/install-docker-19-docker-compose-ubuntu-20-04/)

### Compiling API

```
$ cd nameapi
$ mvn clean install
$ cd ..
$ cd deployment
$ touch .env
```

add following content in .env file

DB_URL=postgresdb:5432
DB_HOST=postgresdb
DB_PORT=5432
DB_USER=root
DB_PASS=abc123

```
$ sudo docker-compose up --build
```

browser http://localhost:3001/swagger-ui.html

Swagger API should be running

In order to stop the docker-compose api

```
$ sudo docker-compose down
```

### Postgre SQL Adminer

browser http://localhost:9001

you can use following credentials to login to view database

```
system: PostgreSQL
Server: postgresdb
Username: root
Password: abc123
Database: namedb
```

## Docker Image - Push to your repository

```
$ docker login
$ docker images
$ docker tag 6f5f8a640bbf faheemfactor/course-kubernetes-full-stack-development:middle-tier-java-api
$ docker push faheemfactor/course-kubernetes-full-stack-development:middle-tier-java-api
```
