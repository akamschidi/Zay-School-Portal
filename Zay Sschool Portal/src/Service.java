import java.util.Scanner;
public class Service {}
/* 
    Scanner scan = new Scanner(System.in);

    @Override
        
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
    

    @Override
    public void loginStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loginStudent'");
    }

    @Override
    public boolean registerStudent(StudentDetails sd) {
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
        return flash = true;
        
    
        boolean add = false; 
        try {
            
            Connection con = DBConnect.DBConnection();
            String query = "insert into zay_student_details(student_name, course, student_class, score) value (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, sd.getStudentName());
            pst.setString(2, sd.getCourse());
            pst.setInt(3, sd.getStudentClass());
            pst.setInt(4, sd.getScore());

       
            pst.setString(1, sd.getStudentName());
            pst.setString(2, sd.getCourse());
            pst.setInt(3, sd.getStudentClass());
            pst.setInt(4, sd.getScore());
 
            int row = pst.executeUpdate();
            add = true;

            if(row > 0){
                System.out.println("Student Successfully Added");
            }
            else{
                System.out.println("Error... Try again....");
            }


            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        return add;   

        
         

    }




    @Override
    public void checkStudentData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkStudentData'");
    }

    @Override
    public void updateStudentData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateStudentData'");
    }

    @Override
    public void checkResult() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkResult'");
    }}








/* 

    
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

    public void registerStudent(){
        
    }
    */

