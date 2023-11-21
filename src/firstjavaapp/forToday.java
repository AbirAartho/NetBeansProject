package firstjavaapp;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class forToday {

    public static void main(String[] args) throws IOException {
//        try {
//            Formatter formatter = new Formatter("C:\\Users\\HP\\Documents\\NetBeansProjects\\FirstJavaApp\\person\\student.txt");
//            formatter.format("%s %s\r\n","101","Anisul");
//            formatter.format("%s %s\r\n","102","Suparna");
//            formatter.format("%s %s\r\n","103","Pinky");
//            formatter.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        }

//        String id, name;
//        try {
//            Formatter formatter = new Formatter("C:\\Users\\B-22\\Desktop\\xyz.txt");
//            Scanner input = new Scanner(System.in);
//            System.out.print("How many Students: ");
//            int num = input.nextInt();
//
//            for (int i = 1; i <= num; i++) {
//                System.out.print("Enter student id and name: ");
//                id = input.next();
//                name = input.next();
//                formatter.format("%s %s\r\n", id, name);
//            }
//            formatter.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        }




        try {
//            Formatter formatter = new Formatter("C:\\Users\\B-22\\Desktop\\xyz.txt");

            String[] name = {"Volvo", "BMW", "Ford", "Mazda"};

            BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Users\\B-22\\Desktop\\xyz.txt", true));

            for (String nam : name) {
                bfw.write( nam + "!!\n");
            }
            bfw.close();
//
//            for (int i = 0; i <= name.length; i++) {
//                System.out.println(name.length);
//                formatter.format("Car Name: " + name.length);
//            }
//            formatter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
