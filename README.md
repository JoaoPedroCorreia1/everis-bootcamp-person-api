### Table of Contents
[Everis Bootcamp Project](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#rest-api-developed-with-spring-boot-maven-and-java)  
- [Introduction](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#introduction)
  - [Database](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#database)  
  - [Branchs](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#branchs)
  - [HTTP Methods](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#http-methods)
  - [Heroku](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#heroku)
  - [Requirements](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#requirements)
- [Rest Assured API Tests](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#rest-assured-api-tests)
    - [HTTP Methods Test](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#http-methods-test)
      - [Random Person Creator](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#--random-person-creator)
      - [Single Person Test](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#--single-person-test)
      - [Multiple Person Test](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#--multiple-person-test)

## REST API developed with Spring Boot, Maven and Java
- Registers, Stores and Manages a database of Persons.

## Introduction
### Database 

- Person: (id, firstName, lastName, cpf, birthDate, phones)

- Phone: (id, type, number)


### Branchs

-Bootcamp:
* Master: Main branch, connected on cloud with Heroku (created with bootcamp teacher)

-My Additions:
* Tests: API Automated Tests (Automated tests with REST-assured, more info on [Rest Assured API Tests](https://github.com/JoaoPedroCorreia1/2021-2-dio-everis-person-api#rest-assured-api-tests) section)

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

### Heroku
- url: https://person-api-dio-bootcamp-sre-21.herokuapp.com

```
Get all Persons
(GET)
https://person-api-dio-bootcamp-sre-21.herokuapp.com/api/v1/people
```

### Requirements

* Java 11.
* Maven 3.6.3.

## Rest Assured API Tests
### HTTP Methods Test

- Gherkin Sintax
- Methods in test/.../utils/RestUtils.java

### - Random Person Creator

- check if cpf is unique with a local database
- check if phone is unique with a local database
- names and other attributes stored on PersonsDb / PhonesDb

### - Single Person Test

- HTTP Test

![SinglePersonSuccessfulTest](https://drive.google.com/uc?export=view&id=1m6XBo0pZRC_Pa56H7WH65lE7rFFZV_aH)

### - Multiple Person Test

- Load Test
- Quantity can be defined in PERSON_QUANTITY (default = 5)

![MultiplePersonsSuccessfulTest](https://drive.google.com/uc?export=view&id=1T3q51wNWJ7Z0vc7DyrOZbuoxhh3JMjHK)
