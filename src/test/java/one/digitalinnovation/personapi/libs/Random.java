package one.digitalinnovation.personapi.libs;

import java.util.concurrent.ThreadLocalRandom;

public class Random {

    public static int number_int(int min, int max){

        int randNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        return randNum;

    }

}
