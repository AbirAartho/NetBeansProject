package midexam;

import java.util.Scanner;

public class HLnumber {

//    public static void abc() {
//        Scanner input = new Scanner(System.in);
//        
//        int x = input.nextInt();
//        int y = input.nextInt();
//        int z = input.nextInt();
//        
//        if ((x > y) && (x > z)) {
//            System.out.println("Largest valur is: "+x);
//        } else if ((x > y) && (y > z)) {
//            System.out.println("Largest valur is: "+y);
//        } else {
//            System.out.println("Largest valur is: "+z);
//        }
//    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int x = input.nextInt();
        System.out.print("Enter a value: ");
        int y = input.nextInt();
        System.out.print("Enter a value: ");
        int z = input.nextInt();

        if ((x > y) && (x > z)) {
            System.out.println("Highest number is: " + x);
        } else if ((y > x) && (y > z)) {
            System.out.println("Highest number is: " + y);
        } else if ((z > x) && (z > y)) {
            System.out.println("Highest number is: " + z);
        } else { 
            System.out.println("Invalid number");
        }
        
        if ((x < y) && (x < z)) {
            System.out.println("Lowest number is: " + x);
        } else if ((y < x) && (y < z)) {
            System.out.println("Lowest number is: " + y);
        } else if ((z < x) && (z < y)) {
            System.out.println("Lowest number is: " + z);
        } else { 
            System.out.println("Invalid number");
        }
    }
}
