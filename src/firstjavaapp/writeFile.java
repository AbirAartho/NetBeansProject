package firstjavaapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    
    public static void main(String[] args) {
        try {
            writeFile();
            readFile();
        } catch (IOException e) {
            System.out.println("IP Ex");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void writeFile() throws IOException {
        String[] names = {"Hohn", "Carl", "Jerry"};
        BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Users\\B-22\\Desktop\\file10\\abc.txt", true));
        bfw.write("Hello Bangladesh !!");
        bfw.write("\nHello World !!");
        bfw.write("\nHello Round 56 !!");
        
        for (String name : names) {
            bfw.write("Oh! God!! " + name + "!!\n");
        }
        bfw.close();
    }
    
    
    public static void readFile() throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("D:\\Sir's_Folder\\ExamLink.txt"));
//        String line = bfr.readLine();
//            System.out.println(line);

        String line;
        while ((line = bfr.readLine()) != null) {
            System.out.println(line);
        }
        bfr.close();
    }
}
