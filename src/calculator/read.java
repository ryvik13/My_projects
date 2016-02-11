package calculator;

import java.util.Scanner;

/**
 * Created by HillelNote on 10.02.2016.
 */
public class read {
    public static int readNumber(Scanner input, String message) {
        System.out.println(message);
        while( true ) {
            if (!input.hasNextInt()) {
                System.out.println("Wrong number");
                input.next();
                continue;
            }
            return input.nextInt();
        }
    }
}

