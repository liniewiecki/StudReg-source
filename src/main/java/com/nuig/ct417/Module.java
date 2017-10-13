package com.nuig.ct417;


import java.util.ArrayList;
import java.util.HashMap;

public class Module
{
  public String moduleName;
  public String moduleID;
  private  HashMap<Integer, Student> students = new HashMap();
  
  public Module(String name, String id) {
    moduleName = name;
    moduleID = id;
  }
  
  public void addStudent(Student student) {
    students.put(Integer.valueOf(student.getStudentID()), student);
    student.addModule(this);
  }
  
  public void addStudents(ArrayList<Student> students) {
    for (Student student : students) {
      this.students.put(Integer.valueOf(student.getStudentID()), student);
      student.addModule(this);
    }
  }
  
  public ArrayList<Student> getStudents() {
    return new ArrayList(students.values());
  }
  
  public String getModuleID() {
    return moduleID;
  }
  
  public String getModuleName() {
    return moduleName;
  }
  
  public String toString()
  {
    return moduleID + " : " + moduleName;
  }
}
