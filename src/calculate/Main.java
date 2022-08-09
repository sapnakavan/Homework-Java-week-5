package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        char c;

        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the first number  :");
            int a = s.nextInt();
            System.out.println("Enter the symbol(+,-,/,*) :");
            char symbol = s.next().charAt(0);
            System.out.println("Enter the second number   :");
            int b = s.nextInt();
            System.out.print("Total   :");

            Main x = new Main();
            //Calculator x = new Calculator();
            x.calculateResult(a, b, symbol);

            System.out.println("Do you still want more?   : y or n:  ");
            c = s.next().charAt(0);


        }
        while (c == 'Y' || c == 'y');
    }
}