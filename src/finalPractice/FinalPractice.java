package finalPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FinalPractice {
    
    public static void throwException(int val) throws RuntimeException {
            if (val == 0) {
                throw new NullPointerException ("Error------");
            }
            System.out.println("Val: "+val);
        }

    public static void main(String[] args) {
//    int m, n, count = 0, totalPrime = 0;
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter initial number: ");
//    m = input.nextInt();
//    System.out.print("Enter initial number: ");
//    n = input.nextInt();
//        for (int i = m; i <= n; i++) {
//            for (int j = 2; j < i - 1; j++) {
//                if (i % j == 0) {
//                    count++;
//                    break;
//                }
//            } if (count == 0) {
//                System.out.println(i);
//                totalPrime++;
//            } count = 0;
//        } System.out.println("Total prime number: "+totalPrime);

//        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        int fact = 1;
//        for (int i = 1; i <= num; i++) {
//            fact *= i;
//        } System.out.println("Factorial of "+num+" is "+fact);
//        


//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Enter 1st number: ");
//        int num1 = input.nextInt();
//        
//        System.out.print("Enter 2nd number: ");
//        int num2 = input.nextInt();
//        
//        System.out.print("Enter 3rd number: ");
//        int num3 = input.nextInt();
//        
//        if((num1 > num2) && (num1 > num3)) {
//            System.out.println("Highest number: "+num1);
//        } else if ((num2 > num1) && (num2 > num3)) {
//            System.out.println("Highest number: "+num2);
//        } else if ((num3 > num1) && (num3 > num2)) {
//            System.out.println("Highest number: "+num3);
//        }
//        
//        if((num1 < num2) && (num1 < num3)) {
//            System.out.println("Lowest number: "+num1);
//        } else if ((num2 < num1) && (num2 < num3)) {
//            System.out.println("Lowest number: "+num2);
//        } else if ((num3 < num1) && (num3 < num2)) {
//            System.out.println("Lowest number: "+num3);
//        } else {
//            System.out.println("Invalid number");
//        }


//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter 1st number: ");
//        int grade = input.nextInt();
//
//        if (grade >= 90) {
//            System.out.println("A");
//        } else if (grade >= 80) {
//            System.out.println("B");
//        } else if (grade >= 70) {
//            System.out.println("C");
//        } else {
//            System.out.println("Fail");
//        }
        
        
//        int[] num = {5,7,6,7,8,4,2,1};
//        int sum = 0;
//        for (int x : num) {
//            sum = sum + x;
//        } System.out.println("Sum of "+Arrays.toString(num));
//        System.out.println(sum);
        
        

//        Integer[][] arrays = {
//            {5,4,6,7},
//            {4,7,2,40},
//            {54,4,7,21}
//        };
//        int totalSum = 0;
//        int sum = 0;
//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j <arrays[i].length; j++) {
//                sum += arrays[i][j];
//            }
//            totalSum +=sum;
//            System.out.println("Sum of " +i+ " array: "+sum);    
//        }
//        System.out.println("Total Sum: "+totalSum);



        // Array List...........:
        ArrayList<String> intArr = new ArrayList<>();
        intArr.add("abc@gmail.com");
        intArr.add("xyzgmail.com");
        intArr.add("fdc@gmailcom");
        intArr.add("iuy@gmail.com");
        intArr.add("lsk@gmail.com");
        intArr.add("wdf@gmail.com");
        
//        for (int i = 0; i < intArr.size(); i++) {
//            System.out.println(intArr.get(i));
            
//        for (int i = 0; i < intArr.size(); i++) {
//            if (intArr.get(i).contains("@") && intArr.get(i).contains(".") ) {
//                System.out.println("True " + intArr.get(i));
//            } else {
//            System.out.println("False " + intArr.get(i));
//        }
//    }
        
        
        
//        for (String x : intArr) {
//            if (x.contains("@") && x.contains(".") ) {
//                System.out.println("True " + x);
//            } else {
//            System.out.println("False " + x);
//        }    
//        }
        
        
        
//        intArr.forEach((val2) -> {
//            boolean v1 = false;  //true
//            boolean v2 = false;  //true
//            for (int i = 0; i < val2.length(); i++) {
//                if ((val2.charAt(i)=='@')) {
//                    v1 = true;
//                } else if (val2.charAt(i) =='.') {
//                    v2 = true;
//                }
//            }
//            if (v1 && v2) {
//                System.out.println("True " + val2);
//            } else {
//                System.out.println("False " + val2);
//            }
//        }
//        );
        
//        

//            intArr.forEach((val) -> {
//            if (val.contains("@") && val.contains(".") ) {
//                System.out.println("True " + val);
//            } else {
//            System.out.println("False " + val);
//        }    
//        }
//        );
    

        // Random number:
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (;;) {
//            int randomnumber = ((int) (Math.random() * 100));
//            if (arr.contains(randomnumber) == false) {
//                arr.add(randomnumber);
//            }
//            if(arr.size() == 10) {
//                break;
//            }
//        }
//        System.out.println(arr);
        
        
        Set<Integer> arr = new HashSet<>();
        for (;;) {
            int randomnumber = ((int) (Math.random() * 100));
                arr.add(randomnumber);
                
            if(arr.size() == 10) {
                break;
            }
        }
        System.out.println(arr);
        
        
        System.out.println("-----1--------");
        throwException(0);
        System.out.println("-----2--------");
        
        
        System.out.println("-----1--------");
        try {
            throwException(0);
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        }
        System.out.println("-----1--------");
    }
    
}
