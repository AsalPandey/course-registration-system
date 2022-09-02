
/**
 * Write a description of class Course here.
 *
 * @author (Asal Pandey)
 * @version (2021-05-22)
 */
public class Course
{
    //variable for Course class
    private int duration;
    private String courseID;
    private String courseLeader;
    private String courseName;

    //creating constructor to initialize the value of duration,courseID,course Leader and coursename
    public Course(String courseID, String courseName,int duration)
    {
        this.courseID=courseID;
        this.courseName=courseName;
        this.courseLeader="";
        this.duration=duration;
    }

    //creating get and set method which is used to read and set the values of variables


    public String getCourseID()
   {
    return courseID;
    }
    public String getcourseName(){
     return courseName;
   }
   public String getcourseLeader(){
       return courseLeader;
   }
   public int getduration(){
       return duration;
   }
   public void setcourseLeader(String nameofthenewcoureLeader)
   {
   this.courseLeader=nameofthenewcoureLeader;
   }

   //creating method for displaying the information

   public void display()
   {
    System.out.println("the ID of the course is " + courseID);
    System.out.println("Name of the course is " + courseName);
    System.out.println("Duration of the course is " + duration);
    if (this.courseLeader==(""))
    {
     System.out.print("empty shell");
    }
    else
    {
        System.out.print("the leader of the course is "+courseLeader);
} 
}
}