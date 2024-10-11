import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Servicee {
    Scanner scan = new Scanner(System.in);

    public void loginTeacher(){
        //String teachersName;
        int teachersPAssword = 0000;

        System.out.println("Enter Teacher's Name: ");
        String tName = scan.next();

        System.out.println("Enter Teacher's Password: ");
        int tpassword = scan.nextInt();

        if(tpassword == teachersPAssword){
            System.out.println("Welcome " + tName);
            System.out.println();
        }
        else{
            System.out.println("Enter A Valid Password: ");
        }
    }
public void studentCheckResult(){
    String name;
    System.out.println("Enter Your Name: ");
    String namey = scan.next();
    
    System.out.println("Welcome " + namey);
    System.out.println("Enter Your Student-ID Number To Check Result: ");
    int studIDNo = scan.nextInt();

    try {
        Connection con = DBConnect.DBConnection();
        String query = "select * from zay_student_details where student_ID =" + studIDNo;
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            System.out.println("Student ID: " + rs.getInt(1) +
            "\nStudent Name: " + rs.getString(2) + 
            "\nCourse: " + rs.getNString(3) +
            "\nStudent Class: " + rs.getInt(4) +
            "\nScore: " + rs.getInt(5));
            System.out.println("-------------");
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }

    //if(studIDNo != studIDNo){
        //System.out.println("Error... Enter A Valid Student-ID: ");
    //}
}

    public void registerStudent() {
        boolean flash= false;

        System.out.println("Enter Student Name: ");
        String sName = scan.next();
        

        System.out.println("Enter Student Course: ");
        String sCourse = scan.next();
        

        System.out.println("Enter Student Class: ");
        int sClass = scan.nextInt();
        

        System.out.println("Enter Student Score: ");
        int sScore = scan.nextInt();

        StudentDetails studentDetail = new StudentDetails(sName, sCourse, sClass, sScore);
        


        try {
            
            Connection con = DBConnect.DBConnection();
            String query = "insert into zay_student_details(student_name, course, student_class, score) value (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, studentDetail.getStudentName());
            pst.setString(2, studentDetail.getCourse());
            pst.setInt(3, studentDetail.getStudentClass());
            pst.setInt(4, studentDetail.getScore());
/* 
       
            pst.setString(1, sd.getStudentName());
            pst.setString(2, sd.getCourse());
            pst.setInt(3, sd.getStudentClass());
            pst.setInt(4, sd.getScore());
 */
            int row = pst.executeUpdate();

            if(row > 0){
                System.out.println("Student Successfully Added");
            }
            else{
                System.out.println("Error... Try again....");
            }


            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAllStudents(){
        try {
            Connection con = DBConnect.DBConnection();
            String query = "select * from zay_student_details";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                System.out.println("Student ID: " + rs.getInt(1) +
                "\nStudent Name: " + rs.getString(2) + 
                "\nCourse: " + rs.getNString(3) +
                "\nStudent Class: " + rs.getInt(4) +
                "\nScore: " + rs.getInt(5));
                System.out.println("-------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void updateStudentData(){
        System.out.println("Enter Student ID: ");
        int studID = scan.nextInt();

        //System.out.println("Enter New Course: ");
       //  String newCourse = scan.next();

        System.out.println("Enter New Score: ");
        int newScore = scan.nextInt();

       
        StudentDetails studentDetail01 = new StudentDetails(newScore);

        try {
            Connection con = DBConnect.DBConnection();
            String query = "update zay_student_details set score =? where student_id =?";
            PreparedStatement ps = con.prepareStatement(query);
           ps.setInt(1, newScore);
            ps.setInt(2, studID);

    
            int rows = ps.executeUpdate();

            if(rows > 0){
                System.out.println("Student Data Updated Successfully...");
            }
            else{
                System.out.println("Error... Try again....");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void deleteStudentData(){
        System.out.println("Enter Student Roll Number: ");
        int delStud = scan.nextInt();

        try {
            Connection con = DBConnect.DBConnection();
            String query = "delete from zay_student_details where student_id = " + delStud;
            PreparedStatement ps =con.prepareStatement(query);

            int rowe = ps.executeUpdate();
            if(rowe > 0){
                System.out.println("Student Data Successfully Deleted...");
            }
            else{
                System.out.println("Error... Try again....");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}

