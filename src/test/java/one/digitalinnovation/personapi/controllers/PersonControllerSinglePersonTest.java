package one.digitalinnovation.personapi.controllers;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.utils.PersonUtils;
import one.digitalinnovation.personapi.utils.RestUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/*
Single Person Test:
 - Add, Get, GetAll and Remove Tests
 - Uses Random Persons
Tests:
  1 - Post Person
  2 - Get Person
  3 - Get All Persons
  4 - Remove Person
 */

public class PersonControllerSinglePersonTest {


    // Attributes
    private final int WAIT_TIME_SEC = 6;
    PersonDTO pessoa = PersonUtils.createRandomPersonDTO();
    long id;

    // Tests
    @Test(priority = 1)
    public void PostPerson()
            throws IOException{

        id = RestUtils.PostPerson(pessoa);

    }

    @Test(priority = 2)
    public void GetPersonById()
            throws IOException {

        RestUtils.GetPersonById(pessoa, id);

    }

    @Test(priority = 3)
    public void GetAllPersons()
            throws IOException {

        RestUtils.GetAllPersons();

    }

    @Test(priority = 4)
    public void RemovePersonById()
            throws IOException {

        RestUtils.RemovePersonById(id);

    }

}
