package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entities.Person;
import one.digitalinnovation.personapi.utils.person.PersonCreator;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    public static PersonDTO createRandomPersonDTO() {
        String firstName = PersonCreator.getFirstName();
        String lastName = PersonCreator.getLastName();
        String cpf = PersonCreator.getCpf();
        String birthDate = PersonCreator.getBirthDate();


        return PersonDTO.builder()
                .firstName(firstName)
                .lastName(lastName)
                .cpf(cpf)
                .birthDate(birthDate)
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createRandomPerson(long id) {
        String firstName = PersonCreator.getFirstName();
        String lastName = PersonCreator.getLastName();
        String cpf = PersonCreator.getCpf();
        String birthDate = PersonCreator.getBirthDate();


        return Person.builder()
                .id(id)
                .firstName(firstName)
                .lastName(lastName)
                .cpf(cpf)
                .birthDate(LocalDate.parse(birthDate))
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }

    public static Person createPersonEntityFromDTO(PersonDTO person, long id) {
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        String cpf = person.getCpf();
        String birthDate = person.getBirthDate();

        return Person.builder()
                .id(id)
                .firstName(firstName)
                .lastName(lastName)
                .cpf(cpf)
                .birthDate(LocalDate.parse(birthDate))
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }

    public static PersonDTO createPersonDTOFromEntity(Person person) {
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        String cpf = person.getCpf();
        LocalDate birthDate = person.getBirthDate();

        return PersonDTO.builder()
                .firstName(firstName)
                .lastName(lastName)
                .cpf(cpf)
                .birthDate(birthDate.toString())
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

}
