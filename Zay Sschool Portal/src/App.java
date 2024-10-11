import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  Servicee service = new Servicee();
  


        while (true) { 
            System.out.println("****Welcome To Zay's School Portal*******");
        System.out.println("1. Teacher" +
                            "\n2. Student" + 
                            "\nEnter Choice: ");
        int option = scan.nextInt();

        switch (option) {
            case 1:
             //log-in teacher:
            System.out.println("welcome teacher...");
            service.loginTeacher();
           
            //give the teacher other options
            System.out.println("Select From The Options Below: ");
            System.out.println("1. Register New Student" + "\n2.Show All Students" + 
                                "\n3.Update Student Data" + "\n4. Delete Student Data" );
            int tOption = scan.nextInt();

            if(tOption == 1){
               service.registerStudent();
            }

            if(tOption == 2){
                service.showAllStudents();
            }
            if(tOption ==3){
                service.updateStudentData();
            }

            if(tOption ==4){
                service.deleteStudentData();
            }
 
         break;

         case 2:
         service.studentCheckResult();

        default:{
            System.out.println("Please Enter A Valid Choice: ");
        }
                
        }
            
        

    
     
    }

        
    }
}
