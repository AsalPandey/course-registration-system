import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;


public class INGcollege implements ActionListener
{
   //declaring instance variable
   
   //for window
   //JFrame
   private JFrame frame;
   
   //JPanel
   private JPanel panel;
   private JPanel left_panel;
   private JPanel left_a1;
   private JPanel left_a2;
   private JPanel left_a3;
   private JPanel right_panel;
   private JPanel right_p1;
   private JPanel right_p2;
   private JPanel right_p3;
   
   //---For UI Component----
   //JLabel
    private JLabel title;
    private JLabel title1;
    //for academic
    private JLabel labelAcademic; 
    private JLabel alblID,alblName,alblDuration,alblLevel,alblCredit,alblAssessment;
    private JLabel alblLeader,alblLecturer,alblStart,alblCompletion;
    //nonacademic 
    private JLabel labelNonAcademic;
    private JLabel nlblID,nlblName,nlblDuration,nlblPrerequisites;
    private JLabel nlblLeader,nlblInstructor,nlblStart,nlblCompletion,nlblexam;
   
   //TextFields
   //for academic course
    private JTextField atextID;
    private JTextField atextName;
    private JTextField atextLeader;
    private JTextField atextDuration;
    private JTextField atextLecturer;
    private JTextField atextLevel;
    private JTextField atextCredit;
    private JTextField atextStart;
    private JTextField atextCompletion;
    private JTextField atextAssessment;
    
    //for frame of non academic
    private JTextField ntextID;
    private JTextField ntextName;
    private JTextField ntextDuration;
    private JTextField ntextLeader;
    private JTextField ntextInstructor;
    private JTextField ntextStart;
    private JTextField ntextCompletion;
    private JTextField ntextExam;
    private JTextField ntextPrerequisites;
    
   //JButton
    private JButton bttnAddAca;
    private JButton bttnAddNonAca;
    private JButton bttnRegisterAca;
    private JButton bttnRegisterNonAca;
    private JButton bttnRemoveNonAca;
    private JButton bttnDisplayAca;
    private JButton bttnDisplayNonAca;
    private JButton bttnClearAca;
    private JButton bttnClearNonAca;
   //JOptionPane
    private JOptionPane pane;
   
   //Declaring ArrayList this use Course parent class as datatype
   public ArrayList<Course> courselist;
   AcademicCourse ac;
   nonAcademicCourse nac;
   
    //constructor
   public void INGCollege(){
       //---for window------
       //JFrame
       frame = new JFrame("course registration");
       
       //intializing ArrayList
       courselist = new ArrayList<Course>();
       
       //Font
       Font f1 = new Font("Times New Roman",Font.PLAIN,25);
       Font f2 = new Font("Times New Roman",Font.PLAIN,15);
       Font f3 = new Font("Times New Roman",Font.BOLD,18);
       
    
       
       //Border
       Border b1 = BorderFactory.createEmptyBorder();
       
       
       //Panel
       panel = new JPanel();
       panel.setBounds(0,0,1400,700);
       //setting gridlayout
       panel.setLayout(new GridLayout(1,2,5,5));
       //left_panel
       left_panel = new JPanel();
       
       left_panel.setLayout(null); //setting layout manager
       //right_panel
       right_panel = new JPanel();
       
       right_panel.setLayout(null); //setting layout manager
       //adding in panel
       panel.add(left_panel);
       panel.add(right_panel);
       
       
       //------Different component for left panel------
       left_a1 = new JPanel();
       left_a2 = new JPanel();
       left_a3 = new JPanel();
       
       
       
       //setting bounds for panels in left_panel
       left_a1.setBounds(100,80,570,330);
       left_a2.setBounds(100,450,320,300);
       left_a3.setBounds(450,530,220,220);
       
       //setting layout manager
       left_a1.setLayout(null);
       left_a2.setLayout(null);
       left_a3.setLayout(null);
       
       //adding in the panel in left_panel
       left_panel.add(left_a1);
       left_panel.add(left_a2);
       left_panel.add(left_a3);
       
       
       //-----UI component for left_panel----
       labelAcademic = new JLabel("Academic Course");
       labelAcademic.setBounds(250,20,250,30); //setting bounds
       labelAcademic.setFont(f1);  //setting font
       
       left_panel.add(labelAcademic); //adding in the left_panel
       //-----End of UI Component for right_panel---------
       
       
       
       //-----UI Component for left_a1-------
       //JLabel
       title = new JLabel("add Academic Course");
       alblID = new JLabel("Course ID"); ;
       alblName = new JLabel("Course Name");
       alblDuration = new JLabel("Duration");;
       alblAssessment = new JLabel("Number of Assessment");
       alblLevel = new JLabel("Level");
       alblCredit = new JLabel("Credit");
       
       //setting bounds for JLabel
       title.setBounds(10,10,300,15);
       alblID.setBounds(10,40,150,20);
       alblName.setBounds(300,40,150,20);
       alblDuration.setBounds(10,110,150,20);
       alblAssessment.setBounds(300,110,150,20);
       alblCredit.setBounds(10,180,150,20);
       alblLevel.setBounds(300,180,150,20);
       
       
       
       //adding font
       title.setFont(f2);
       
       //adding label in panel left_a1
       left_a1.add(title);
       left_a1.add(alblID);
       left_a1.add(alblName);
       left_a1.add(alblDuration);
       left_a1.add(alblAssessment);
       left_a1.add(alblCredit);
       left_a1.add(alblLevel);
       
       //JTextField
       atextID = new JTextField();
       atextName = new JTextField();
       atextDuration = new JTextField();
       atextAssessment = new JTextField();
       atextCredit = new JTextField();
       atextLevel = new JTextField();
       
       //setting border;
       atextID.setBorder(b1);
       atextName.setBorder(b1);
       atextDuration.setBorder(b1);
       atextAssessment.setBorder(b1);
       atextCredit.setBorder(b1);
       atextLevel.setBorder(b1);
       
       //setting bounds
       atextID.setBounds(10,65,220,30);
       atextName.setBounds(300,65,240,30);
       atextDuration.setBounds(10,135,220,30);
       atextAssessment.setBounds(300,135,240,30);
       atextCredit.setBounds(10,205,220,30);
       atextLevel.setBounds(300,205,240,30);
       
       //adding JTextField 
       left_a1.add(atextID);
       left_a1.add(atextName);
       left_a1.add(atextDuration);
       left_a1.add(atextAssessment);
       left_a1.add(atextCredit);
       left_a1.add(atextLevel);
       
       //JButton
       bttnAddAca = new JButton("Add Academic Course");
       //setting bounds
       bttnAddAca.setBounds(50,260,470,40);
       
       
       //setting font
       bttnAddAca.setFont(f3);
       //adding button to left_a1
       left_a1.add(bttnAddAca);
       //----UI Component for left_a1 ends here
       
       
       
       //------UI Component for left_a2 start------
       //JLabel
       title1 = new JLabel("register Academic Course");
       alblLeader= new JLabel("Course Leader:");
       alblLecturer = new JLabel("Lecturer Name:");
       alblStart = new JLabel("Starting Date:");
       alblCompletion = new JLabel("Completion Date:");
       
       //setting bounds
       title1.setBounds(10,10,300,15);
       alblLeader.setBounds(10,40,150,25);
       alblLecturer.setBounds(10,90,150,25);
       alblStart.setBounds(10,140,150,25);
       alblCompletion.setBounds(10,190,150,25);
       
       
       //adding font
       title1.setFont(f2);
       
       //adding label in the left_a2 panel
       left_a2.add(title1);
       left_a2.add(alblLeader);
       left_a2.add(alblLecturer);
       left_a2.add(alblStart);
       left_a2.add(alblCompletion);
       
       //JTextField
       atextLeader = new JTextField();
       atextLecturer = new JTextField();
       atextStart = new JTextField();
       atextCompletion = new JTextField();
       
       
       //setting border;
       atextLeader.setBorder(b1);
       atextLecturer.setBorder(b1);
       atextStart.setBorder(b1);
       atextCompletion.setBorder(b1);
       
       //setting bounds
       atextLeader.setBounds(120,40,190,30);
       atextLecturer.setBounds(120,90,190,30);
       atextStart.setBounds(120,140,190,30);
       atextCompletion.setBounds(120,190,190,30);
       
       //adding JTextField in left_a2
       left_a2.add(atextLeader);
       left_a2.add(atextLecturer);
       left_a2.add(atextStart);
       left_a2.add(atextCompletion);
       
       //JButton
       bttnRegisterAca = new JButton("Register Academic Course");
       //setting bounds
       bttnRegisterAca.setBounds(10,230,300,40);
       
       
       
       //setting font
       bttnRegisterAca.setFont(f3);
       //adding button to left_a2
       left_a2.add(bttnRegisterAca);
       //-------End of UI component for left_a2 panel------
       
       
       //-------UI Component for left_a3 panel----
       //JButton
       bttnDisplayAca = new JButton("display");
       bttnClearAca = new JButton("clear");
       
       //setting bounds
       bttnDisplayAca.setBounds(10,20,100,20);
       bttnClearAca.setBounds(10,80,100,20);
       
       
       //setting font
       bttnDisplayAca.setFont(f3);
       bttnClearAca.setFont(f3);
       //adding JButton in left_a3
       left_a3.add(bttnDisplayAca);
       left_a3.add(bttnClearAca);
       //----------end for left_a3 panel-------
       
       
       
       //-------------Different UI component for right_p1 panel-----
       right_p1 = new JPanel();
       right_p2 = new JPanel();
       right_p3 = new JPanel();
       
      
       
       //setting bounds for panels in right_panel
       right_p1.setBounds(90,80,600,250);
       right_p2.setBounds(50,350,360,400);
       right_p3.setBounds(450,380,250,280);
       
       //setting layout manager
       right_p1.setLayout(null);
       right_p2.setLayout(null);
       right_p3.setLayout(null);
       
       //adding in the panel in right_panel
       right_panel.add(right_p1);
       right_panel.add(right_p2);
       right_panel.add(right_p3);
       
       
       //-----UI component for right_panel----
       labelNonAcademic = new JLabel("Non Academic Course");
       labelNonAcademic.setBounds(230,20,300,30); //setting bounds
       labelNonAcademic.setFont(f1);  //setting font
       right_panel.add(labelNonAcademic); //adding in the right_panel
       //-----End of UI Component for right_panel---------
       
       
       //-----UI Component for right_p1-------
       
       //JLabel
       title = new JLabel("add non-Academic Course");
       nlblID = new JLabel("Course ID"); ;
       nlblName = new JLabel("Course Name");
       nlblDuration = new JLabel("duration");;
       nlblPrerequisites = new JLabel("Prerequisites");
       
       //setting bounds for JLabel
       title.setBounds(10,10,300,15);
       nlblID.setBounds(10,40,150,20);
       nlblName.setBounds(330,40,150,20);
       nlblDuration.setBounds(10,110,150,20);
       nlblPrerequisites.setBounds(330,110,150,20);
       
       
       //adding font
       title.setFont(f2);
       
       //adding in panel right_p1
       right_p1.add(title);
       right_p1.add(nlblID);
       right_p1.add(nlblName);
       right_p1.add(nlblDuration);
       right_p1.add(nlblPrerequisites);
       
       //JTextField
       ntextID = new JTextField();
       ntextName = new JTextField();
       ntextDuration = new JTextField();
       ntextPrerequisites = new JTextField();
       
       //setting border;
       ntextID.setBorder(b1);
       ntextName.setBorder(b1);
       ntextDuration.setBorder(b1);
       ntextPrerequisites.setBorder(b1);
       
       //setting bounds
       ntextID.setBounds(10,65,220,30);
       ntextName.setBounds(330,65,240,30);
       ntextDuration.setBounds(10,135,220,30);
       ntextPrerequisites.setBounds(330,135,240,30);
       
       //adding JTextField 
       right_p1.add(ntextID);
       right_p1.add(ntextName);
       right_p1.add(ntextDuration);
       right_p1.add(ntextPrerequisites);
       
       //JButton
       bttnAddNonAca = new JButton("Add non-Academic Course");
       //setting bounds
       bttnAddNonAca.setBounds(40,200,500,40);
       
       
       //setting font
       bttnAddNonAca.setFont(f3);
       //adding button to right_p1
       right_p1.add( bttnAddNonAca);
       
       
       //---UI component for right_p2;
       //JLabel
       title1 = new JLabel("register Non-Academic Course");
       nlblLeader= new JLabel("Course Leader:");
       nlblInstructor = new JLabel("Instructor Name:");
       nlblStart = new JLabel("Starting Date:");
       nlblCompletion = new JLabel("Completion Date:");
       nlblexam = new JLabel("Exam Date");
      
       //setting bounds
       title1.setBounds(10,10,300,15);
       nlblLeader.setBounds(10,40,150,25);
       nlblInstructor.setBounds(10,90,150,25);
       nlblStart.setBounds(10,140,150,25);
       nlblCompletion.setBounds(10,190,150,25);
       nlblexam.setBounds(10,240,150,25);
       
       
       //adding font
       title1.setFont(f2);
       
       //adding labels in the right_p2 panel
       right_p2.add(title1);
       right_p2.add(nlblLeader);
       right_p2.add(nlblInstructor);
       right_p2.add(nlblStart);
       right_p2.add(nlblCompletion);
       right_p2.add(nlblexam);
       
       //JTextFields
       ntextLeader = new JTextField();
       ntextInstructor = new JTextField();
       ntextStart = new JTextField();
       ntextCompletion = new JTextField();
       ntextExam = new JTextField();
       
       //setting border;
       ntextLeader.setBorder(b1);
       ntextInstructor.setBorder(b1);
       ntextStart.setBorder(b1);
       ntextCompletion.setBorder(b1);
       ntextExam.setBorder(b1);
       
       //setting bounds
       ntextLeader.setBounds(120,40,210,30);
       ntextInstructor .setBounds(120,90,210,30);
       ntextStart.setBounds(120,140,210,30);
       ntextCompletion.setBounds(120,190,210,30);
       ntextExam.setBounds(120,240,210,30);
       
       //adding JTextFields in right_p2
       right_p2.add(ntextLeader);
       right_p2.add(ntextInstructor );
       right_p2.add(ntextStart);
       right_p2.add(ntextCompletion);
       right_p2.add(ntextExam);
       
       //JButton
       bttnRegisterNonAca = new JButton("Register Non-Academic Course");
       //setting bounds
       bttnRegisterNonAca.setBounds(5,300,320,40);
       //setting font
       bttnRegisterNonAca.setFont(f3);
       //adding button to right_p2
       right_p2.add(bttnRegisterNonAca);
       //-------End of UI component for right_p2 panel------
       
       //-------UI Component for right_p3 panel----
       //JButton
       bttnDisplayNonAca = new JButton("display");
       bttnClearNonAca = new JButton("clear");
       bttnRemoveNonAca = new JButton("remove");
       //setting bounds
       
       bttnRemoveNonAca.setBounds(8,80,100,20);
       bttnDisplayNonAca.setBounds(8,150,100,20);
       bttnClearNonAca.setBounds(8,220,100,20);
       
       //setting font
       bttnDisplayNonAca.setFont(f3);
       bttnClearNonAca.setFont(f3);
       bttnRemoveNonAca.setFont(f3);
       
       //adding JButton in right_p3
       right_p3.add(bttnDisplayNonAca);
       right_p3.add(bttnClearNonAca);
       right_p3.add(bttnRemoveNonAca);
       
       
       
       
       //---creating listener-----------
       bttnAddAca.addActionListener(this);
       bttnAddNonAca.addActionListener(this);
       bttnRegisterAca.addActionListener(this);
       bttnRegisterNonAca.addActionListener(this);
       bttnDisplayAca.addActionListener(this);
       bttnDisplayNonAca.addActionListener(this);
       bttnClearNonAca.addActionListener(this);
       bttnClearAca.addActionListener(this);
       bttnRemoveNonAca.addActionListener(this);
       //----End of creating listener---------
       
       
       
       
       //to make frame visible
       frame.add(panel); //adding panel in the frame
       frame.setSize(1300,800); //set size of the frame
       frame.setLocationRelativeTo(null); //set location of the frame to center
       frame.setVisible(true); //make frame visible 
       //closing frame on clicking cross
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
   
   //method actionPerformed for implement in ActionListener
   public void actionPerformed(ActionEvent e){
       //using getText to get text from JTextField
       
       //from Academic
           String acourseID = atextID.getText();
           String acourseName = atextName.getText();
           String aDuration = ntextDuration.getText();
           String alevel = atextLevel.getText();
           String acredit = atextCredit.getText();
           String anumberofassessment = atextAssessment.getText();
           String aleader = atextLeader.getText();
           String alecturer = atextLeader.getText();
           String astart = atextStart.getText();
           String acompletion = atextCompletion.getText();
       
       //for Non-Academic
           String ncourseID = ntextID.getText();
           String ncourseName = ntextName.getText();
           String nDuration = ntextDuration.getText();
           String nprerequisites = ntextPrerequisites.getText();
           String nleader = ntextLeader.getText();
           String ninstructor = ntextInstructor.getText();
           String nstart = ntextStart.getText();
           String ncompletion = ntextCompletion.getText();
           String nexam = ntextExam.getText();
           
           //declaring variables for loop
           int duration,assessment,credit = 0;
           //setting isUnique variable in order to check courseID is unique or not
           boolean isUnique = false;
           
           
           
           
       //functions for button
       /*for bttnAddAca 
        *create new object of AcademicCourse
        *add to an ArrayList of course class
       */
       
       if (e.getSource().equals(bttnAddAca)){
           
           //exceptional handling
            try{
               
               duration = (int)Double.parseDouble(aDuration); 
               assessment = (int)Double.parseDouble(anumberofassessment);
               credit = (int)Double.parseDouble(acredit);
            }catch(NumberFormatException ex){
                pane = new JOptionPane();
                pane.showMessageDialog(new JFrame(),"Please enter data in required feilds");
                return; 
            }
           
            /*checking if arraylist is empty or not using If isEmpty()method
             * inside if loop which return boolean and new object is created 
             * else if course is already exist or not
            */
          
            if(courselist.isEmpty()){
               
                ac = new AcademicCourse(duration,acourseID,acourseName,alevel,credit,assessment);
                courselist.add(ac);
                pane = new JOptionPane();
                pane.showMessageDialog(new JFrame(),"Academic Course addition sucessful!");
            }else{
            
                for(Course c:courselist){
                    /*to check the course already exist or not 
                    *using instanceOf 
                    *for AcademicCourse child class
                    */
                   
                    if(c instanceof AcademicCourse){
                        
                        if(c.getCourseID().equals(acourseID)){
                           
                            pane = new JOptionPane();
                            pane.showMessageDialog(new JFrame(),"Course ID already exist.Please give unique course ID");
                            return;
                        }else{
                            isUnique = true;
                        }
                    }
                }
                
                if(isUnique == true){
                    ac = new AcademicCourse(duration,acourseID,acourseName,alevel,credit,assessment);
                    courselist.add(ac); 
                    isUnique = false;
                        
                 }
                 
            }
            pane = new JOptionPane();
            pane.showMessageDialog(new JFrame(),"Course has been successfully added");
                
            
        }
        
       /*for bttnAddNonAca 
        *create new object of Non-AcademicCourse
        *adding to an ArrayList of course class
       */
       
        if (e.getSource().equals(bttnAddNonAca)){
           
           //exceptional handling
           try{
               
               duration = (int)Double.parseDouble(nDuration);
            }catch(NumberFormatException ex){
                    pane = new JOptionPane();
                    pane.showMessageDialog(new JFrame(),"Please enter data in required feild!");
                    return; 
            }
           
            /*checking if arraylist is empty or not using If isEmpty()method
             * inside if loop which return boolean and new object is created 
             * find else if course is already exist or not
            */
            if(courselist.isEmpty()){
                nac = new nonAcademicCourse(duration,ncourseID,ncourseName,nprerequisites);
                courselist.add(nac);
                pane = new JOptionPane();
                pane.showMessageDialog(new JFrame(),"Non-Academic Couse has been successfully added");
            }else{
                for(Course c:courselist){
                    /*to check the course already exist or not 
                    * using instanceOf 
                    *for Non-AcademicCourse child class
                    */
                    if(c instanceof nonAcademicCourse){
                        if(c.getCourseID().equals(ncourseID)){
                            pane = new JOptionPane();
                            pane.showMessageDialog(new JFrame(),"Course ID already exist.Please give another course ID!");
                            return;
                        }else{
                            isUnique=true;
                        }
                    }
                }
            }
            
            if(isUnique == true){
                    nac = new nonAcademicCourse(duration,ncourseID,ncourseName,nprerequisites);
                    courselist.add(nac); 
                    isUnique = false;
                    
             }
            pane = new JOptionPane();
            pane.showMessageDialog(new JFrame(),"Course has been added sucessfully");
                
         }
           
            //bttnRegisterAca
           /*compared the courseID 
            *if courseID is valid then will be register to list 
           */ 
        if(e.getSource().equals(bttnRegisterAca)){
            
            if(courselist.isEmpty()){
                   
                   pane = new JOptionPane();
                   pane.showMessageDialog(new JFrame(),"Course list is empty");
                   
                }else{
                    
                            for(Course c:courselist){
                            /*to check the course already exist or not 
                            *downcast is done using instanceOf so it is
                            *of AcademicCourse child class
                            */
                                if(c.getCourseID().equals(acourseID)){
                            
                                    if(c instanceof AcademicCourse){
                                       ac = (AcademicCourse)c; //downcasting to call register method
                                       
                                        if(ac.getisRegistered()==false){
                                            ac.register(acourseName,alecturer,astart,acompletion);
                                            pane = new JOptionPane();
                                            pane.showMessageDialog(new JFrame(),"Academic Course is registered");
                                            return;
                                       }else{
                                           pane = new JOptionPane();
                                           pane.showMessageDialog(new JFrame(),"Academic Course is already registered");
                                           
                                        }
                                
                               }else{
                                    pane = new JOptionPane();
                                    pane.showMessageDialog(new JFrame(),"CourseID has been used for NonAcademicCourse");
                                }
                               
                        }else{
                             pane = new JOptionPane();
                             pane.showMessageDialog(new JFrame(),"Course ID is doesnt exist in the list");
                        }
                    }
                    
                    
             }
        
        }
        
          //bttnRegisterNonAca
           /*compared the courseID 
            *if courseID is valid then will be register to list 
           */ 
        if(e.getSource().equals(bttnRegisterNonAca)){
            
            if(courselist.isEmpty()){
                   
                       pane = new JOptionPane();
                       pane.showMessageDialog(new JFrame(),"Course list is empty");
                   
                }else{
                    
                       for(Course c:courselist){
                            /*to check the course whether it already exist or not 
                            *downcast is done using instanceOf so it is
                            *of Non-AcademicCourse child class   
                            */
                            if(c.getCourseID().equals(ncourseID)){
                            
                                if(c instanceof nonAcademicCourse){
                                        nac = (nonAcademicCourse)c; //downcasting to call register method
                                        if(nac.getisRegistered()==false){
                                            nac.register(ncourseName,ninstructor,nstart,ncompletion,nexam);
                                            pane = new JOptionPane();
                                            pane.showMessageDialog(new JFrame(),"Non-Academic Course is registered successfully!");
                                            return;
                                       }else{
                                           pane = new JOptionPane();
                                           pane.showMessageDialog(new JFrame(),"Non-Academic Course is already registered!");
                                           
                                        }
                                
                                }else{
                                    pane = new JOptionPane();
                                    pane.showMessageDialog(new JFrame(),"CourseID has been used for AcademicCourse");
                                }
                               
                            }else{
                                pane = new JOptionPane();
                                pane.showMessageDialog(new JFrame(),"CourseID is doesn't exist in the list");
                            }
                               
                        }
             }
                    
                    
             
        
        }
        
        
        
        
        //bttnRemoveNonAca button
        /*When the button is pressed first it compared courseId and then
          * call remove method from NonAcademicCourse
          */
        if(e.getSource().equals(bttnRemoveNonAca)){
               System.out.println("Inside remove");
               if(courselist.isEmpty()){
                   
                       pane = new JOptionPane();
                       pane.showMessageDialog(new JFrame(),"Course list is empty");
                   
               }else{
                       for(Course c:courselist){
                              /*to check whether the course already exist or not 
                                *downcast and instanceof used to make sure it is
                                *of NonAcademicCourse child class   
                                */
                               
                            if(c.getCourseID().equals(ncourseID)){
                                   
                                  if(c instanceof nonAcademicCourse){
                                            
                                        nac = (nonAcademicCourse)c; //downcasting to call register method
                                            if(nac.getisRemoved()==true){
                                                 pane = new JOptionPane();
                                                 pane.showMessageDialog(new JFrame(),"Non Academic Course is do not exist");

                                           
                                           }else{
                                                    nac.remove();
                                                  pane = new JOptionPane();
                                                  pane.showMessageDialog(new JFrame(),"Non-Academic Course is removal sucessful");
                                                  return;
                                            }
                                
                                 }else{
                                        pane = new JOptionPane();
                                        pane.showMessageDialog(new JFrame(),"CouseID has been used for AcademicCourse");
                                 }
                               
                            }else{
                                pane = new JOptionPane();
                                pane.showMessageDialog(new JFrame(),"CoruseID is not present in the list");
                             }
                               
                        }
                  
                }
        }
        
        
        /*display button
         *Display button to display information regarding respective class
        */
        
        if (e.getSource().equals(bttnDisplayAca)){
            
             if (courselist.isEmpty()){
                    pane = new JOptionPane();
                    pane.showMessageDialog(new JFrame(),"Blank List,Please fill the form");
                    System.out.println("CourseID is Blank");
                }else{
                        for(Course aac: courselist){ 
                            System.out.println("Displaying inside list--> Academic Course");
                                  
                            //for academic course
                                
                             if(aac instanceof AcademicCourse){
                                    System.out.println("------------------------------------------");
                                    ac = (AcademicCourse)aac; //downcasting to call display method
                                    ac.display();
                              }
                
                             }
                    } 
                    
            }
        
    
        if (e.getSource().equals(bttnDisplayNonAca)){
                
            if (courselist.isEmpty()==true){
                pane = new JOptionPane();
                pane.showMessageDialog(new JFrame(),"Empty List,Please fill the form");
                System.out.println("Courselist is empty");
            }
            else{
                    for(Course nc: courselist){
                        System.out.println("Displaying inside list--> Non Academic Course");
                            
                        //for nonacademic course
                        if(nc instanceof nonAcademicCourse){
                            System.out.println("------------------------------------------");
                            nac = (nonAcademicCourse)nc; //downcasting to call display method
                            nac.display();
                        }
                    }
             }
         }
        
                //for Clear Button
            //when button is pressed all the data from textfields are removed
        if(e.getSource().equals(bttnClearAca)){
                //using setText method and giving ("")empty string to textfield
                //from Academic course
               atextID.setText("");
               atextName.setText("");
               ntextDuration.setText("");
               atextLevel.setText("");
               atextCredit.setText("");
               atextAssessment.setText("");
               atextLeader.setText("");
               atextLecturer.setText("");
               atextStart.setText("");
               atextCompletion.setText("");
               
        }
            
        if(e.getSource().equals(bttnClearNonAca)){
               //for Non-Academic course
               ntextID.setText("");
               ntextName.setText("");
               ntextDuration.setText("");
               ntextPrerequisites.setText("");
               ntextLeader.setText("");
               ntextInstructor.setText("");
               ntextStart.setText("");
               ntextCompletion.setText("");
               ntextExam.setText("");
                
        }
        
        //------End of button functionality---------
    }
    
    public static void main(String args[]){
        INGcollege main=new INGcollege(); //creating class object to call instance method
        main.INGCollege(); //calling instance method
    }
        
}
