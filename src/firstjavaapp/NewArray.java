package firstjavaapp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NewArray {

//    public static void printArray() {
//        int[] khachi = new int[10];
//        khachi[0] = 1;
//        khachi[1] = 10;
//        khachi[2] = 20;
//        khachi[3] = 30;
//        khachi[4] = 40;
//        khachi[5] = 50;
//        khachi[8] = 60;
//
//        for (int i = 0; i < khachi.length; i++) {
//            System.out.println("Arr-" + khachi[i]);
//        }
//
//        int[] khachi2 = {2, 5, 3};
//        khachi2[2] = 10;
//        for (int i = 0; i < khachi2.length; i++) {
//            System.out.println("Arr-" + khachi2[i]);
//        }
//    }
//
//    public static void printArray2(int val) {
//        System.out.println("arr--" + val);
//    }
//
//    public static int myM(int[] xyz) {
//        for (int i = 0; i < xyz.length; i++) {
//            System.out.println("Val-" + xyz[i]);
//        }
//        return xyz.length;
//    }
//
//    public static void oddValue(int[] abc) {
//        for (int i = 0; i < abc.length; i++) {
//            if (abc[i] % 2 != 0) {
//                System.out.println("OddVal: " + abc[i]);
//            } else {
//                System.out.println("EvenVal: " + abc[i]);
//            }
//        }
//    }
//
//    public static void fruit(String[] hh) {
//        for (int i = 0; i < hh.length; i++) {
//            if (hh[i].equals("Begun Morobba")) {
//                System.out.println("Fruit: " + hh[i]);
//            }
//        }
////        for (String bb : hh) {
////            if (bb.equals("Begun Morobba")) {
////                System.out.println("Fruit: " + bb);
////            }
////        }
//    }
//
//    int[] arr = new int[10];
//
//    public void addVal(String val) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Insert int val: ");
//        for (int i = 0; i < 10; i++) {
//            arr[i] = input.nextInt();
//        }
//    }
//
//    public void printVal(String val) {
//        System.out.print("Val; ");
//        for (int i : arr) {
//            System.out.println(i + ", ");
//        }
//    }
//
//    public static void minVal(double[] myList) {       
//        double min = myList[0];
//        for (int i = 1; i < myList.length; i++) {
//            if (min > myList[i]) {
//                min = myList[i];
//            }
//        }
//        System.out.println("Min Val- "+min);
//    ---------------- 10/26/2023: -------------------
//    public static void fun(int[] series) {
//        int secLarge = series[0];
//        for (int i = 1; i < series.length; i++) {
//            if (secLarge < series[i]) {
//                secLarge = series[i];
//            }
//        }
//        System.out.println("SecLarge value: " + secLarge);
//    }
//    public static void sum() {
//        Scanner scan = new Scanner(System.in);
//        int sum = 0;
//        for (int i = 0;; i++) {
//            System.out.println("Enter Number: ");
//            int x = scan.nextInt();
//            if (x > 0) {
//                sum += x;
//            } else {
//                break;
//            }
//        }
//        System.out.println(sum);
//    }
//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        int sum = 1;
//        for (int i = 1; i <= n; i++) {
//            sum *= 1;
//        }
//        return sum;
//    }
//    public static int factorial2(int n) {
//        int sum = 1;
//        if (n != 0) {
//            for (int i = 1; i <= n; i++) {
//                sum *= i;
//            }
//        }
//        return sum;
//    }
//    public static void minMaxVal2(int[] arr) {
//        int max = arr[0];
//        int min = arr[0];
//        
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("Max val: "+max);
//        System.out.println("Min val: "+min);
//    }
//    ------------- Sorting:
//    public static void Asrt(){
//        Integer[] arr = {10,5,3,40,8,2,-9,4,75,-54};
//        System.out.println("Original Array: "+ Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println("Ascending Array: "+ Arrays.toString(arr));
//    }
//    
//    public static void Dsrt(){
//        Integer[] arr = {10,5,3,40,8,2,-9,4,75,-54};
//        System.out.println("Original Array: "+ Arrays.toString(arr));
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println("Descending Array: "+ Arrays.toString(arr));
//    }
//        public static int oe(int num) {
//        if (num % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//        return 0;
//        }
    public static int[][] getArray() {
        int[][] m = new int[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                m[row][column] = input.nextInt();
            }
        }
        return m;
    }

    public static int getSum(int[][] arrays) {
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                sum += arrays[i][j];
            }
        }
        return sum;
    }

    public static void eValidation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String abc = input.next();

        if (abc.contains("@") && abc.contains(".")) {
            System.out.println("Email-" + abc + " " + true);
        } else {
            System.out.println("Email-" + abc + " " + false);
        }
    }

//    boolean a = false;
//    boolean b = false;
//
//    public void eValidation2() {
//        
//        for (int i = 0; i < abc.length(); i++) {
//            if (abc.charAt(i) == '@') {
//                a = true;
//            }
//            if (abc.charAt(i) == '.') {
//                b = true;
//            }
//        }
//        System.out.println((a == true bb == true ? true : false) + " " + abc);
//        }
        




    public static void main(String[] args) {

        int[][] arr = getArray();
        System.out.println("Sum of ARR: " + getSum(arr));

//        oe(10);
//        
//        NewArray.printArray();
//        NewArray.printArray2(5);
//
//        int[] ar = {1, 2, 3, 4, 5, 6};
//        NewArray.myM(ar);
//
//        int[] at = {100, 700, 505, 903, 402, 6};
//        NewArray.oddValue(at);
////        
////      String[] recipies2 = new String[10];
////      recipies2[5] = "han";
//        String[] recipies = new String[]{"Azmula", "Farmula", "Mula Gril", "Begun Morobba", "Mula Kabab"};
//        NewArray.fruit(recipies);
////      String[] chefNames = {"Azme Sr", "Farjana Sr"};
//
//        NewArray arrpc = new NewArray();
////        NewArray.addVal();
//
//        double[] myList = {7.2, 9.3, 2.9, 1.9, 3.4, 3.5, 0.2};
//        minVal(myList);
//        ---------------- 10/26/2023: -------------------
//        int[] sl = {5, 9, 6, 7, 4, 2};
//        NewArray.fun(sl);
//        ----------------- 10/30/2023: ----------------------
//        Integer[] arr = {5,-2,23,7,87,-42,509};
//        System.out.println("The original array is: ");
//        for (int num : arr) {
//            System.out.println(num + " ");
//        }
//        Arrays.sort(arr);
//        System.out.println("\nThe sorted array is: ");
//        for (int num : arr) {        
//            System.out.println(num + " ");
//        }
//        System.out.println("");
//        
//        Arrays.sort(arr, Collections.reverseOrder());
//        
//        System.out.println("Modified arr[] : "+Arrays.toString(arr));
//        int[] arr = new int[]{12, 5, 56, -2, 32, -26, 9, 43, 94, -78};
//        System.out.println("Array elements after sorting: ");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int tmp = 0;
//                if (arr[i] > arr[j]) {
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//            System.out.println(arr[i]);
//        }
//
////        int[] arr = new int []{12,5,56,-2,32,-26,9,43,94,-78};
//        System.out.println("Array elements after sorting: ");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int tmp = 0;
//                if (arr[i] < arr[j]) {
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//            System.out.println(arr[i]);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter any positive interger: ");
//        int num = input.nextInt(), fact = 1;
//        for (int n = num; n >= 1; n--) {
//            fact = fact * n;
//        }
//        System.out.println("Factorial of " + num + " = " + fact);
//        System.out.println("Factorial value: "+factorial2(6));
//        
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Insert value: ");
//        int length = scan.nextInt();
//        int a[] = new int[length];
//        
//        for (int i = 0; i < length; i++) {
//            System.out.println("Insert the " + i + " no. val: ");
//            a[i] = scan.nextInt();
//        }
//        System.out.println(Arrays.toString(a));
//        minMaxVal2(a);
//        ------------ Prime Number:
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter any positive integer: ");
//        int count = 0, num = input.nextInt();
//        if (num == 0 || num == 1) {
//            System.out.println("Not prime");
//        } else {
//            for (int i = 2; i <= num/2; i++) {
//                if (num % i == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0) {
//                System.out.println("Prime number");
//            } else {
//                System.out.println("Not prime");
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//
//        System.out.println("Enter numbers to calculate the conditional sum: ");
//
//        while (true) {
//            int input = scanner.nextInt();
//
//            if (input <= 0) {
//                break;
//            }
//
//            sum += input;
//        }
//
//        System.out.println("Conditional sum: " + sum);
//        Asrt();
//        Dsrt();
//        getMax(9,3);
//        getMax(getMax(9,3),3);
//        Integer[][] arrays = {
//            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}
//        };
//        int sum = 0;
//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays[i].length; j++) {
//                sum += arrays[i][j];
//            }
//        }
//        System.out.println("Sum = " + sum);
//
//        int[][] matrix = new int[2][2];
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter "+ matrix.length + " rows and " + matrix[0].length + " columns: ");
//            for (int row = 0; row < matrix.length; row++) {
//                for (int column = 0; column < matrix[row].length; column++) {
//                    matrix[row][column] = input.nextInt();
//                }
//            }
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = (int) (Math.random() * 100);
//            }
//        }
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                System.out.print(matrix[row][column] + " ");
//            }
//            System.out.println();
//        }
        int[][] number = new int[10][];
        int k = 1;

        number[0] = new int[1];
        number[1] = new int[2];
        number[2] = new int[3];
        number[3] = new int[4];
        number[4] = new int[5];
        number[5] = new int[6];
        number[6] = new int[7];
        number[7] = new int[8];
        number[8] = new int[9];
        number[9] = new int[10];

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                number[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
