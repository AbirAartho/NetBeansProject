
package firstjavaapp;

public class CourseInherit extends StudentInherit {
    String qualification;
    
    void displayInformation2(){
        displayInformation1();
        System.out.println("Qualificaiton: "+qualification);
    }
}
