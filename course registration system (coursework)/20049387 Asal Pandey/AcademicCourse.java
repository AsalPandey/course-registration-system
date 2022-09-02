
/**
 * Write a description of class AcademicCourse here.
 *
 * @author (Asal Pandey)
 * @version (2021-05-22)
 */
public class AcademicCourse extends Course

{
    //defining variables
  private int NumberOfAssesment;
  private String Lecturername; //empty
  private String Level;
  private int Credit;
  private String StartingDate; //empty
  private String CompletionDate; //empty
  private boolean isRegistered; //false
  //creating constructor for Academic course
    
    public AcademicCourse(int duration, String courseID, String courseName, String  level, int credit,int NumberOfAssesment){
    //super keyword is used for calling super class from the main class
       super(courseID,courseName,duration);
       this.NumberOfAssesment=NumberOfAssesment;
       this.Level=Level;
       this.Credit=Credit;
       this.Lecturername = "";
       this.StartingDate = "";
       this.CompletionDate = "";
       isRegistered = false;
    
}

 //creating get and set method which is used to read and set the values of variables
 public String getLecturername(){
       return Lecturername;
  }
  public void setLecturername(String newLecturername){
      this.Lecturername=newLecturername;
  }
 public int getNumberOfAssesment(){
       return NumberOfAssesment;
  }
  public void setNumberOfAssesment(int newNumberOfAssesment){
      this.NumberOfAssesment=newNumberOfAssesment;
  }
  public String getLevel(){
       return Level;
  }
   public int getCredit(){
       return Credit;
  }
  public String getStartingDate(){
       return StartingDate;
  }
  public String getCompletionDate(){
       return CompletionDate;

  }
  public boolean getisRegistered(){
       return isRegistered;
    }
  
public void register(String Lecturername,String  StartingDate,String CompletionDate,String courseLeader){
      if(isRegistered==true) 
          System.out.println(Lecturername+" has already started at"+StartingDate+" and ends on"+CompletionDate);
        else{
          super.setcourseLeader(courseLeader);
          this.Lecturername=Lecturername;
          this.StartingDate=StartingDate;
          this.CompletionDate=CompletionDate;
          isRegistered=true;
        
        }
    }
    public void display(){
        super.display();
        if(isRegistered==true){
        
            System.out.println("the name of the lecturer is="+Lecturername+".");
            System.out.println("the level of the course is="+Level+".");
            System.out.println("total credit of the course is="+Credit+".");
            System.out.println("total no of assessment in this course is="+NumberOfAssesment+".");
            System.out.println("starting date="+StartingDate+".");
            System.out.println("starting date="+CompletionDate+".");
 }
  }  
}
