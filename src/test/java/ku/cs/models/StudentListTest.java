package ku.cs.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void testAddNewStudent() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610450838","A");
        assertEquals(1,studentList.getStudents().size());
        studentList.addNewStudent("6610450839","B",50);
        assertEquals(2,studentList.getStudents().size());
    }

    @Test
    void testFindStudentById() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610450840", "Prayut");
        Student foundStudent = studentList.findStudentById("6610450840");
        assertEquals("Prayut", foundStudent.getName());
    }

    void testGiveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610450841", "Pravit");
        studentList.giveScoreToId("6610450841", 45.0);
        Student student = studentList.findStudentById("6610450841");
        assertEquals(45.0, student.getScore());

        studentList.giveScoreToId("6610450841", 30.0);
        assertEquals(80.0, student.getScore());
    }

    @Test
    void testViewGradeOfId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610450000", "Ant", 87.0);
        studentList.addNewStudent("6610450001", "Boy", 70.0);
        studentList.addNewStudent("6610450002", "Catto", 60.0);
        studentList.addNewStudent("6610450003", "Doggo", 41.0);

        assertEquals("A", studentList.viewGradeOfId("6610450000"));
        assertEquals("B", studentList.viewGradeOfId("6610450001"));
        assertEquals("C", studentList.viewGradeOfId("6610450002"));
        assertEquals("F", studentList.viewGradeOfId("6610450003"));
    }

    @Test
    void testGetStudents() {
        StudentList studentList = new StudentList();
        assertTrue(studentList.getStudents().isEmpty());

        studentList.addNewStudent("6610450838", "Tong");
        studentList.addNewStudent("6610450839", "Long", 75.0);
        ArrayList<Student> students = studentList.getStudents();
        assertEquals(2, students.size());
        assertEquals("Tong", students.get(0).getName() );
        assertEquals("Long", students.get(1).getName());
    }


}