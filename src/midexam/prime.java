
package midexam;

import java.util.Scanner;

public class prime {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int count = 0;
        if (!(num < 2)) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
        } else {
            count++;
        }
        if (count == 0) {
            System.out.println("The number " + num + " is a prime number");
        } else {
            System.out.println("The number " + num + " is not a prime number");
        }
    }
}
