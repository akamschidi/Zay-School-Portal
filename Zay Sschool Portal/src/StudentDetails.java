public class StudentDetails {
    private int studentID;
    private String studentName;
    private String course;
    private int studentClass;
    private int score;


    public StudentDetails() {
    }

    


    public StudentDetails(int score) {
        this.score = score;
    }




    public StudentDetails(String studentName, String course, int studentClass, int score) {
        this.studentName = studentName;
        this.course = course;
        this.studentClass = studentClass;
        this.score = score;
    }


    public StudentDetails(int studentID, String studentName, String course, int studentClass, int score) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.course = course;
        this.studentClass = studentClass;
        this.score = score;
    }


    public int getStudentID() {
        return studentID;
    }


    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    public String getStudentName() {
        return studentName;
    }


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public String getCourse() {
        return course;
    }


    public void setCourse(String course) {
        this.course = course;
    }


    public int getStudentClass() {
        return studentClass;
    }


    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }


    public int getScore() {
        return score;
    }


    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "StudentDetails [studentID=" + studentID + ", studentName=" + studentName + ", course=" + course
                + ", studentClass=" + studentClass + ", score=" + score + "]";
    }

    

    
    
}
