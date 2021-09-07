package one.digitalinnovation.personapi.utils.phone;

import one.digitalinnovation.personapi.enums.PhoneType;
import one.digitalinnovation.personapi.libs.Random;
import one.digitalinnovation.personapi.utils.phone.db.PhonesDb;

import java.util.ArrayList;
import java.util.List;

public class PhoneCreator {

    // Attributes
    static List<String> addedNumbers = new ArrayList<>();

    // Public Methods
    public static String getPhoneNumber(){
        String phone = PhoneNumberCreator.getRandomPhoneNumber();

        // check if it's not duplicated
        if(addedNumbers.contains(phone) == false){

            addedNumbers.add(phone);
            return phone;

        }
        else {
            return getPhoneNumber();
        }

    }

    public static PhoneType getType(){
        int type = Random.number_int(0, 2);

        return PhonesDb.phoneTypes[type];
    }

}
