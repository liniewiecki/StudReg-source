package com.nuig.ct417;


import java.util.ArrayList;
import java.util.HashMap;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class Course
{
  private DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-mm-yyyy");
  private String courseName;
  private HashMap<String, Module> modules = new HashMap();
  private HashMap<Integer, Student> students = new HashMap();
  private LocalDate startDate;
  private LocalDate endDate;
  
  public Course(String courseName, String startDate, String endDate) {
    this.courseName = courseName;
    this.startDate = dtf.parseLocalDate(startDate);
    this.endDate = dtf.parseLocalDate(endDate);
  }
  
  public void addModule(Module module) {
    modules.put(module.getModuleID(), module);
    
    for (Student student : module.getStudents()) {
    	
      students.put(Integer.valueOf(student.getStudentID()), student);
      student.addCourse(this);
    }
  }
  
  public ArrayList<Module> getModules() {
    return new ArrayList(modules.values());
  }
  
  public ArrayList<Student> getStudents() {
    return new ArrayList(students.values());
  }
  
  public String getCourseName() {
    return courseName;
  }
  
  public LocalDate getStartDate() {
    return startDate;
  }
  
  public LocalDate getEndDate() {
    return endDate;
  }
  
  public String toString()
  {
    return courseName + "\nTime:\t" + startDate.toString() + " : " + endDate.toString();
  }
}