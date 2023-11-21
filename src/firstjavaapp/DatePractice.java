package firstjavaapp;

import java.util.Date;

public class DatePractice {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("The elapsed time since Jan 1, 1970 is "
                + (date.getTime() / 1000 / 60) + " milliseconds");
        System.out.println(date.toString());
        System.out.println((date.getTime() / 1000) / 60);
        System.out.println(((date.getTime() / 1000) / 60) / 60);
        System.out.println((((date.getTime() / 1000) / 60) / 60) / 24);
        System.out.println(((((date.getTime() / 1000) / 60) / 60) / 24) / 365);

        String str = "Bangladesh";
//        System.out.println(reverse(a));
        char[] strArr = str.toCharArray();
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
        
        int[] ar = new int[] {100, 700, 505, 903, 402, 6, 77, 80};
        System.out.println("Array elements after sorting: ");
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                int tmp = 0;
                if (ar[i] > ar[j]) {
                    tmp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = tmp;
                }
            }
            System.out.print(ar[i]);
        }
    }
}
