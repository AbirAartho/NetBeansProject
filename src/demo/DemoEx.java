//package demo;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class DemoEx {
//
//    public static int factorial2(int n) {
//        int sum = 1;
//        if (n != 0) {
//            for (int i = 1; i <= n; i++) {
//                sum *= i;
//            }
//        }
//        return sum;
//    }
//
////    -------- Factorial 2nd:
//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }
//
////        ----------- Odd/Even:  
//    public static int oe(int num) {
//        if (num % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//        return 0;
//    }
//
////        ------------ Sorting:
//    public static void ascending() {
//        Integer[] arr = {10, 20, 50, 3, 42, 21, 0, 4};
//        System.out.println("Original Array: " + Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println("Ascending Array: " + Arrays.toString(arr));
//    }
//
//    public static void descending() {
//        Integer[] arr = {10, 20, 50, 3, 42, 21, 0, 4};
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println("Descending Array: " + Arrays.toString(arr));
//    }
////    
//
//    public static void twoDArr() {
//        Integer[][] arrays = {
//            {9, 5, 14, 3},
//            {8, 4, 19, 10},
//            {6, 7, 2, 18}
//        };
//
//        System.out.println("Assending arrays: ");
//        for (Integer[] val : arrays) {
//            Arrays.sort(val);
//            System.out.println(Arrays.toString(val));
//        }
//
//        System.out.println("Dccending arrays: ");
//        for (Integer[] val : arrays) {
//            Arrays.sort(val, Collections.reverseOrder());
//            System.out.println(Arrays.toString(val));
//        }
//    }
//
////     ----------- Random:
//    public static class RandomNumber {
//
//        int dup[] = new int[10];
//        int count = 0, dupcount = 0;
//
//        private void generateDuplicate() {
//            int randomvalue = 0;
//            for (;;) {
//                randomvalue = (int) (Math.random() * 100);
//                if (duplicateCheck(randomvalue) == 1) {
//                    dup[count] = randomvalue;
//                    System.out.print(dup[count] + " ");
//                    count++;
//                }
//                if (count == 10) {
//                    break;
//                }
//            }
//            System.out.println("");
//        }
//
//        int duplicateCheck(int x) {
//            for (int i = 0; i < 10; i++) {
//                if (dup[i] == x) {
//                    dupcount++;
//                    return 0;
//                }
//            }
//            return 1;
//        }
//    }
//
//    
//    
//    
//    
//    
//    public static void main(String[] args) {
//
//        twoDArr();
//
//        RandomNumber rn = new RandomNumber();
//        rn.generateDuplicate();
//
////         -------- Factorial:
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter any positive interger: ");
//        int num = input.nextInt(), fact = 1;
//        for (int i = num; i >= 1; i--) {
//            fact = fact * i;
//        }
//        System.out.println("Factorial of " + num + " = " + fact);
////        
//
////        -------- Factorial 2nd (Call):
//        System.out.println(factorial(5));
////        
////        ---------- Conditional Sum:
//        Scanner scan = new Scanner(System.in);
//        int sum = 0;
//        for (int i = 0;; i++) {
//            System.out.print("Enter Number: ");
//            int x = scan.nextInt();
//            if (x == -1) {
//                break;
//            }
//               sum += x; 
//            }
//        System.out.println(sum);
//        }
//        
////        
//
////        ---------- Max Min:       
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the value of length: ");
//        int length = scan.nextInt();
//        int a[] = new int[length];
//        int max = 0;
//        int min = 0;
//        for (int i = 0; i < length; i++) {
//            System.out.print("Enter the value: ");
//            a[i] = scan.nextInt();
//            // System.out.println(a[i]);
//            if (i == 0) {
//                max = a[i];
//                min = a[i];
//            } else if (a[i] > max) {
//                max = a[i];
//            } else if (a[i] < min) {
//                min = a[i];
//            } else {
//                continue;
//            }
//        }
//        System.out.println("Maximum number is: " + max);
//        System.out.println("Minimum number is: " + min);
//
////        
////        ----------- Prime:
////        int b = 59;
////        for (int i = 2; i <= b; i++) {
////            if (i == b) {
////                System.out.println(b + " is a prime number");
////            } else {
////                if (b % i == 0) {
////                    System.out.println(b + " is not a prime number");
////                    break;
////                }
////            }
////        }
////        ------- Prime 2nd:
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        int count = 0;
//        if (!(num < 2)) {
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                    count++;
//                    break;
//                }
//            }
//        } else {
//            count++;
//        }
//        if (count == 0) {
//            System.out.println("The number " + num + " is a prime number");
//        } else {
//            System.out.println("The number " + num + " is not a prime number");
//        }
//
////        ------------- Sorting (call):
//        ascending();
//        descending();
//
//// 	------------ Power Test:
//        System.out.println(Math.pow(2, 2));
//
//        
////        ------------ Array Sum:
//        int[] array = {2, 4, 6, 8, 10};
//        int sum = 0;
//
//        System.out.print("The array : " + Arrays.toString(array));
//
//        for (int n : array) {
//            sum += n;
//        }
//        System.out.println("\nSum: " + sum);
//        
//        
////        ------- Odd/Even 2nd:
//    Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        if (number % 2 == 0) {
//            System.out.println(number + " is an even number.");
//        } else {
//            System.out.println(number + " is an odd number.");
//        }
//
//    }
//}
