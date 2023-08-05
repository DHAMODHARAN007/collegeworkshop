package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class StudentService {
    public static void main(String... args){
      StudentService ss= new StudentService();
      ss.addStudent();
      ss.getStudents();
    }

    public void addStudent(){
        Student student = new Student();
        List<Student> studentList = new ArrayList<Student>();
        student.setStudentId("001");
        student.setName("Ameet");
        student.setCourse("BCA");
        student.setStartDate("01/08/2023");
        student.setEndDate("08/01/2026");
        Student student1 = new Student();
        studentList.add(student);
        student1.setStudentId("002");
        student1.setName("Abinesh");
        student1.setCourse("BCA");
        student1.setStartDate("01/08/2023");
        student1.setEndDate("08/01/2026");
        studentList.add(student1);
        Student student2 = new Student();
        studentList.add(student);
        student2.setStudentId("003");
        student2.setName("Arun");
        student2.setCourse("BCA");
        student2.setStartDate("01/08/2023");
        student2.setEndDate("08/01/2026");
        studentList.add(student2);
    }

    public List<Student> getStudents(){
        return new ArrayList<Student>();
    }
}
