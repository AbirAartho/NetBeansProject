
package firstjavaapp;

public class TestInherit {
    public static void main(String[] args) {
//        StudentInherit s1=new StudentInherit();
//        
//        s1.setName("SickMan");
//        s1.setId(101);
//        s1.setEducation("MSc");
//        
//        System.out.println(s1.getName());
//        System.out.println(s1.getId());
//        System.out.println(s1.getEducation());


        CourseInherit s1 = new CourseInherit();
        s1.id = 420;
        s1.name = "Shuvo";
        s1.qualification = "Failed in MBA";
        
        s1.displayInformation2();
    }
    
}
