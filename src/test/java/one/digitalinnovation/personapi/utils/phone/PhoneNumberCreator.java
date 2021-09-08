package one.digitalinnovation.personapi.utils.phone;

import one.digitalinnovation.personapi.libs.Random;

public class PhoneNumberCreator {

    static int dddBrazil = 55;
    static int dddSaoPaulo = 11;

    public static String getRandomPhoneNumber(){
        String phoneNumber = "";

        phoneNumber += String.valueOf(dddBrazil);
        phoneNumber += String.valueOf(dddSaoPaulo);

        for(int n = 0; n < 9; n++) {
            int randomNumber = Random.number_int(0, 9);

            phoneNumber += randomNumber;

        }

        return phoneNumber;

    }

}
