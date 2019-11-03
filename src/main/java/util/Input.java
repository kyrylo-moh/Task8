package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);
    private Validator validator = new Validator();
    private Output output = new Output();

    public int getInt() {
        int num;
        output.printDefault();
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (!validator.isPositiveNumber(num)) {
                output.printNumBiggerZero();
                scanner.next();
                num = getInt();
            }
        } else {
            //output.printDefault();
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public int getLength() {
            return getInt();
    }

    public String getAnswer() {
        return scanner.next();
    }

}
