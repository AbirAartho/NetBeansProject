package firstjavaapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExamPractice {

//    public static void ArithmeticException() {
//        try {
//            int a = 5;
//            int b = 0;
//            int result = a / b;
//            System.out.println("Result = ");
//        } catch (ArithmeticException e) {
//            System.out.println("Exception: " + e);
//        } catch (Exception e1) {
//            System.out.println("Exception: " + e1);
//        } finally {
//            System.out.println("Rest of the programme");
//        }
//    }

//    public static void NullPointerException() {
//        try {
//            String name = null;
//            System.out.println(name.charAt(3));
//        } catch (NullPointerException e) {
//            System.out.println("Exception: " + e);
//        } catch (Exception e1) {
//            System.out.println("Exception: " + e1);
//        } finally {
//            System.out.println("Rest of the programme");
//        }
//    }

//    public static void ArrayException() {
//        try {
//            int[] a = new int[4];
//            a[4] = 10;
//            System.out.println("Result = ");
//        } catch (ArrayIndexOutOfBoundsException e1) {
//            System.out.println("Exception: " + e1);
//        } catch (Exception e2) {
//            System.out.println("Exception: " + e2);
//        } finally {
//            System.out.println("Rest of the programme");
//        }
//    }

//    public static void TwoDArraySort() {
//        int[][] array = {
//            {2, 4}, {9, 7}, {6, 10}
//        };
//        for (int k = 0; k < array.length; k++) {
//            for (int i = 0; i < array[k].length; i++) {
//                for (int j = i + 1; j < array[k].length; j++) {
//                    int tmp = 0;
//                    if (array[k][i] > array[k][j]) {
//                        tmp = array[k][i];
//                        array[k][i] = array[k][j];
//                        array[k][j] = tmp;
//                    }
//                }
//                System.out.print(array[k][i] + ", ");
//            }
//            System.out.println("");
//        }
//    }
    
    public static void writeFile() throws IOException {
        String[] names = {"John", "Carl", "Jerry"};
        String val = "Bangladesh";
        BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Users\\B-22\\Desktop\\nmn.txt", true));
        for (String name : names) {
            bfw.write("Hello " + name + " !! " + val + "\n");    
        }
        bfw.write("Hello " + val + " !! \n");
        bfw.close();
    }
    
    public static void readFile() throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\B-22\\Desktop\\nmn.txt"));
        String line;
        while ((line = bfr.readLine()) != null) {
            System.out.println(line);
        }
        bfr.close();
    }
    
//    public static readWrite() {
//        
//    }
    
    public static void read() {
        
    }
    
    public static void write() {
        Path targetFile = Paths.get("C:\\Users\\B-22\\Desktop\\nmn.txt");
        String question = "To be or not to be?";
        Charset charset = Charset.forName("ISO-8895-1");
        try {
            Files.write(targetFile, question.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.out.println(e);           
        }
    }

    public static void main(String[] args) throws IOException {

//        ExamPractice.ArithmeticException();
//        ExamPractice.NullPointerException();
//        ExamPractice.ArrayException();
        
        
//        ExamPractice.TwoDArraySort();

        ExamPractice.writeFile();

        
//        try {
////            int a = 5;
////            int b = 0;
////            int result = a / b;
//
////            String name = null;
////            System.out.println(name.charAt(3));
////
////
//            int[] a = new int[4];
//            a[4] = 10;
//            System.out.println("Result = ");
//
//        } catch (ArithmeticException e) {
//            System.out.println("Exception: " + e); 
//        } catch (NullPointerException e) {
//            System.out.println("Exception: " + e); 
//        } catch (ArrayIndexOutOfBoundsException e1) {
//            System.out.println("Exception: " + e1); 
//        } catch (Exception e) {
//            System.out.println("Exception: " + e);
//        } finally {
//            System.out.println("Rest of the programme");
//        }


        
    }
}
