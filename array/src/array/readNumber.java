package array;

import java.util.Scanner;

public class readNumber {
    public static int readNumber(Scanner input, String message) {
        System.out.println(message);
        while (true) {
            if (input.hasNextInt()) {
                int result = input.nextInt();
                if ( result > 1 && result <11){
                    return result;
                }
            }
            else {
                System.out.println("Wrong number");
                break;
            }
            System.out.println("Wrong number");
            return 0;

        }
        return 0;
    }
}
