### Table of Contents
[Everis Bootcamp Project](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#rest-api-developed-with-spring-boot-maven-and-java)  
- [Introduction](#introduction)
  - [Database](#database)  
  - [Branchs](#branchs)
  - [HTTP Methods](#http-methods)
- [Tests](#tests)
  - [Rest Assured](#)
    - [HTTP Methods Test](#)
      - [Single Person Test](#)
      - [Multiple Person Test](#)

##REST API developed with Spring Boot, Maven and Java
- Registers, Stores and Manages a database of Persons.

## Introduction
### Database 

- Person: (id, firstName, lastName, cpf, birthDate, phones)

- Phone: (id, type, number)


### Branchs

-Bootcamp:
* Master: Main branch, connected on cloud with Heroku (created with bootcamp teacher)

-My Additions:
* Tests: API Automated Tests (created automated tests with REST-assured, more info on Test section)

to run with the terminal, execute:

```shell script
mvn spring-boot:run 
```

### HTTP Methods
```
Get all Persons
(GET)
http://localhost:8080/api/v1/people
```
```
Add Person
(Post)
http://localhost:8080/api/v1/people
```
```
Get Person by Id
(Get)
http://localhost:8080/api/v1/people/{id}
```
```
Update Person by Id
(Put)
http://localhost:8080/api/v1/people/{id}
```
```
Remove Person by Id
(Remove)
http://localhost:8080/api/v1/people/{id}
```

### Requirements

* Java 11.
* Maven 3.6.3.

## Tests

### HTTP Methods Test

- Used Rest Assured API
- Gherkin Sintax
- Methods in test/.../utils/RestUtils.java

### Random Person Creation

- check if cpf is unique with a local database
- check if phone is unique with a local database
- names and other attributes stored on PersonsDb / PhonesDb

### Single Person Test

- HTTP Test

### Multiple Person Test

- Load Test
- Quantity can be defined in PERSON_QUANTITY
