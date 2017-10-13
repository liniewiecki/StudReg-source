package com.nuig.ct417;


import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class Student
{
  private DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-mm-yyyy");
  
  private Course course;
  private  ArrayList<Module> modules = new ArrayList();
  private  int studId;
  private  String studName;
  private  LocalDate dob;
  private  String username;
  
  public Student(String name, String dob, int id)
  {
    studName = name;
    this.dob = dtf.parseLocalDate(dob);
    
    studId = id;
    username = generateUsername();
  }
  
  public String getStudentName() {
    return studName;
  }
  
  public LocalDate getDob() {
    return dob;
  }
  
  public String getUsername() {
	    return username;
	  }
	  
	  public Course getCourseName() {
	    return course;
	  }
	  
  
	  public int getStudentID() {
	    return studId;
	  }
	  
	  public void addCourse(Course course) {
	    this.course = course;
	  }
  
 
  public String getAge() {
	  
    new LocalDate();return Integer.toString(LocalDate.now().getYear() - dob.getYear());
  }
  
  public String generateUsername() {
	  
    return studName.replaceAll(" ", "") + getAge();
  }
  
  public void addModule(Module module)
  {
    modules.add(module);
  }
  
  public ArrayList<Module> getModules() {
    return modules;
  }
  
  public String toString()
  {
    return studName + " : " + studId;
  }
}