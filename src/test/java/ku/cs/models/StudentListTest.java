package ku.cs.models;

import org.junit.jupiter.api.Test;

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
        studentList.addNewStudent("6610450838","A");
        assertEquals(,studentList.findStudentById("6610450838"));
    }

    @Test
    void testGiveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610450838","A");
        studentList.giveScoreToId("6610450838",50);
        assertEquals(50,);
    }

    @Test
    void testViewGradeOfId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610450839","B",50);
        assertEquals("50",studentList.viewGradeOfId("6610450839"));
    }


}