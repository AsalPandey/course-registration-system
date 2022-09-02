
/**
 * Write a description of class nonAcademicCourse here.
 *
 * @author (Asal Pandey)
 * @version (2021-05-22)
 */
public class nonAcademicCourse extends Course
{
    //defining variables
    private String Lecturername;
    private int duration;
    private String StartingDate;
    private String CompletionDate;
    private String ExamDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    //creating constructor for nonAcademicCourse.
    
    public nonAcademicCourse(int duration,String courseID,String courseName,String prerequisite)
    {
        //super keyword is used for calling super class from the main class
        super(courseID,courseName,duration);
        this.prerequisite=prerequisite;
        this.StartingDate="";
        this.CompletionDate="";
        this.ExamDate="";
        isRegistered=false;
        isRemoved=false;
        
    }
     //creating get and set method which is used to read and set the values of variables
     public String getLecturername(){
       return Lecturername;
  }
  public int getduration()
  {
      return duration;
  }
  public String getStartingDate(){
       return StartingDate;
  }
  public String getCompletionDate(){
       return CompletionDate;

  }
  public String getExamDate(){
       return ExamDate;

  }
   public String getprerequisite(){
       return prerequisite;
  }
  public boolean getisRegistered(){
       return isRegistered;
    }
    public boolean getisRemoved(){
       return isRemoved;
    }
    
     public void setLecturername(String newLecturername){
     if(isRegistered==false)
     {
         this.Lecturername=newLecturername;
         System.out.println("lecturer name is changed");
     }
     else
     {
         System.out.println("lecturer is already registered");
        
         
     }
  }
  public void register(String Lecturername,String  StartingDate,String CompletionDate,String courseLeader, String ExamDate){
      if(isRegistered==false)
      {
          setLecturername(Lecturername);
          isRegistered=true;
      }
      else
      {
          System.out.println("this course is already registered");
      }
    }
  public void remove()
  {
      if(isRemoved==true)
       System.out.println("this course is already been removed");
       else
       {
           super.setcourseLeader("");
           this.Lecturername="";
           this.StartingDate="";
           this.CompletionDate="";
           this.ExamDate="";
           isRegistered=false;
           isRemoved=true;
       }
  }
  public void display(){
        super.display();
        if(isRegistered==true){
         System.out.println("lecturer name is" +Lecturername);
         System.out.println("starting date is" +StartingDate);
         System.out.println("complition date is" +CompletionDate);
         System.out.println("exam date is" +ExamDate);
        }
    }
}
