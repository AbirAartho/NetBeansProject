
package midexam;

import java.util.Scanner;

public class GradeNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Grade: ");
        
        int a = input.nextInt();
        
        if (a >= 60 && a <= 69) {
            System.out.println("Grade B");
        } else if (a >= 70 && a <= 89) {
            System.out.println("Grade A");
        } else if (a >= 90 && a <= 100) {
            System.out.println("Grade A+");
        } else {
            System.out.println("Failed");
        }
        
//        String grade;
//        if (percentage >= 90) {
//            grade "A+";
//        } else if (percentage >= 80) {
//            grade "B";
//        } else if (percentage >= 70) {
//            grade "C";
//        } else {
//            System.out.println("Fail");
//        }
    }
}
