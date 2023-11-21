
package firstjavaapp;

public class SecondLargest {
    
    public static int FindSecondLargest(int[] arr){
        if (arr.length < 2){
            System.out.println("The array should have at least two elements.");
            return -1;
        }
        int firstLargest = Integer.MIN_VALUE; // -214748364 //10, //20, //30 , //40, //50
        int secondLargest = Integer.MIN_VALUE; //-214748364 //10, //20, //30 , //40
        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
    
//    public static int minArray(int[][] mav) {       
//        double min = mav[5][i];
//        for (int i = 1; i < mav.length; i++) {
//            if (min > mav[i]) {
//                min = mav[i];
//            }
//        }
//        System.out.println("Min Val- "+min);
    
    
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,45};
        int secondLargest = FindSecondLargest(numbers);
        if (secondLargest != -1) {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
    
    double[][] distances = {
 {0, 983, 787, 714, 1375, 967, 1087},
 {983, 0, 214, 1102, 1763, 1723, 1842},
 {787, 214, 0, 888, 1549, 1548, 1627},
 {714, 1102, 888, 0, 661, 781, 810},
 {1375, 1763, 1549, 661, 0, 1426, 1187},
 {967, 1723, 1548, 781, 1426, 0, 239},
 {1087, 1842, 1627, 810, 1187, 239, 0},
 };
//        SecondLargest.minArray(myList);
}