## Introduction

This demo project implements a technology stack containing the following.

* **Spring Boot** - Application and API hosting
* **React** - Web components
* **Tailwind** - CSS utilities
* **Parcel** - Building the frontend
* **Maven** - Building the entire application

## Prerequisites

* JDK 13
* Maven - The Spring Boot project was created using the Spring Boot Intializr, which includes local Maven executables for Linux and Windows (mvnw). The commands in this documentation uses them. If you rather use your own install of Maven, replace "mvnw" with "mvn" in the commands below.
* Node and NPM is automatically installed locally to the project. If you want to run NPM in the section "Enable hot reloading for Parcel" below, either reference the local NPM installation or install it on your OS.

## Running for development


Run the following command in the root of the project.

```sh
mvnw spring-boot:run -Dspring-boot.run.profiles=development
```

## Enable hot reloading

**Java**

This project uses spring-boot-devtools which auto-configures hot reloading of java. However, this requires auto-building from a java IDE.

**HTML, CSS, Javascript**

To enable hot reloading of frontend content, run the following command in **{project_root}/src/main/frontend**

```sh
npm run watch
```

## Building for production

Run the following command in the root of the project:

```sh
mvnw clean install
```

## Running for production

Run the following command in the root of the project:

```sh
java -jar target/demo.jar
```

## Accessing the application

**Home Page**

Enter "**http://localhost:8080**" in a web browser.

**API**

Submit a GET request to "**http://localhost:8080/api/v1/status**". 