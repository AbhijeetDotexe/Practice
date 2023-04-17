public class Student {
    public int studentId;
    public String studentname;
    public String studentphone;
    public String studentcity;
    
    
    public Student(int studentId , String studentname , String studentphone , String studentcity){
        super();
        this.studentId=studentId;
        this.studentname=studentname;
        this.studentcity=studentcity;
        this.studentphone=studentphone;
    }
     public Student( String studentname , String studentphone , String studentcity){
        super();
         this.studentname=studentname;
        this.studentcity=studentcity;
        this.studentphone=studentphone;
    }
      public Student(){
        super();
    }
      @Override
      public String toString(){
          return "student [student id =  "+studentId+" ,student name"+studentname+"student city "
                  +studentcity+"studentphone"+studentphone+"]"; 
}
}