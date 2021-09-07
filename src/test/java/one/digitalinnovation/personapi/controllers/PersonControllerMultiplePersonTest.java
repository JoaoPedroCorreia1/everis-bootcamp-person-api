package one.digitalinnovation.personapi.controllers;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.utils.PersonUtils;
import one.digitalinnovation.personapi.utils.RestUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class PersonControllerMultiplePersonTest {

    private final int PERSON_QUANTITY = 5;

    long[] personIds = new long[PERSON_QUANTITY];
    PersonDTO[] persons = new PersonDTO[PERSON_QUANTITY];

    @Test (priority = 1)
    public void AddMultiplePersons() throws IOException, InterruptedException {

        // add tests
        for (int p = 0; p < PERSON_QUANTITY; p++) {
            // create
            persons[p] = PersonUtils.createRandomPersonDTO();

            // add
            personIds[p] = RestUtils.PostPerson(
                    persons[p]
            );

        }
    }

    
    @Test (priority = 2)
    public void GetMultiplePersonsById() throws IOException, InterruptedException {

        // get tests
        for (int p = 0; p < PERSON_QUANTITY; p++) {

            // get
            RestUtils.GetPersonById(
                    persons[p],
                    personIds[p]
            );
        }

    }

    @Test (priority = 3)
    public void GetAllMultiplePersons() throws IOException, InterruptedException {

        RestUtils.GetAllPersons();

    }
    

    @Test (priority = 4)
    public void RemoveMultiplePersons() throws IOException, InterruptedException {

        for(int p = 0; p < PERSON_QUANTITY; p++){

            // remove
            RestUtils.RemovePersonById(
                    personIds[p]
            );
        }

    }

}
