package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String... args) {

        List<String> inputs = new ArrayList();

        Scanner s1 = new Scanner(System.in);
        try {
            int noOfLines = s1.nextInt();

            for (int i = 0; i <noOfLines; i++) {
                inputs.add(s1.next());
            }
            s1.close();
        } catch (Exception e) {
            System.out.println("The index you have entered is invalid");
        }

        for (String input : inputs) {
            int inputStrLength = input.length();
            if (inputStrLength<=10) {
                System.out.println(input);
            }else {
                System.out.println(input.charAt(0)+""+(inputStrLength-2)+""+input.charAt(inputStrLength-1));
            }
        }

    }


}

