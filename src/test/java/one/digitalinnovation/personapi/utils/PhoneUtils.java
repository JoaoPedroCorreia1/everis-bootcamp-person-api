package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entities.Phone;
import one.digitalinnovation.personapi.enums.PhoneType;
import one.digitalinnovation.personapi.utils.phone.PhoneCreator;

public class PhoneUtils {

    public static PhoneDTO createFakeDTO() {
        String phoneNumber = PhoneCreator.getPhoneNumber();
        PhoneType phoneType = PhoneCreator.getType();

        return PhoneDTO.builder()
                .number(phoneNumber)
                .type(phoneType)
                .build();
    }

    public static Phone createFakeEntity() {
        String phoneNumber = PhoneCreator.getPhoneNumber();
        PhoneType phoneType = PhoneCreator.getType();

        return Phone.builder()
                .id(1L)
                .number(phoneNumber)
                .type(phoneType)
                .build();
    }
}
