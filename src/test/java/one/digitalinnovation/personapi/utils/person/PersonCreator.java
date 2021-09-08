package one.digitalinnovation.personapi.utils.person;

import one.digitalinnovation.personapi.libs.Random;
import one.digitalinnovation.personapi.utils.person.db.PersonsDb;

import java.util.ArrayList;
import java.util.List;

public class PersonCreator {

    static List<String> addedCpfs =  new ArrayList<>();

    // Private
    public static String numberToDateString(int n){

        if(n > 9){
            return String.valueOf(n);
        }
        else{
            return '0' + String.valueOf(n);
        }

    }

    // Public
    public static String getFirstName(){

        int lastIndex = PersonsDb.FIRST_NAME.length - 1;
        int randIndex = Random.number_int(0, lastIndex);

        String randomFirstName = PersonsDb.FIRST_NAME[randIndex];

        return randomFirstName;
    }

    public static String getLastName(){

        int lastIndex = PersonsDb.LAST_NAME.length - 1;
        int randIndex = Random.number_int(0, lastIndex);

        String randomLastName = PersonsDb.LAST_NAME[randIndex];

        return randomLastName;
    }

    public static String getCpf(){

        String randomCpf = CpfCreator.randomCpf();

        if (addedCpfs.contains(randomCpf) == false){

            addedCpfs.add(randomCpf);
            return randomCpf;

        }
        else{
            return getCpf();
        }

    }

    public static String getBirthDate(){

        int day = Random.number_int(1, 30);
        int month = Random.number_int(1, 12);
        int year = Random.number_int(1970, 2021);

        String randomBirthDate =
                        numberToDateString(day)
                + "-" + numberToDateString(month)
                + "-" + String.valueOf(year);

        return randomBirthDate;

    }

}
