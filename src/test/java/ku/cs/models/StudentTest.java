package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore() {
        Student s1 = new Student("6610450838", "eiei",5);
        assertEquals(5, s1.getScore());
        s1.addScore(45.5);
        assertEquals(50.5,s1.getScore());
        s1.addScore(10);
        assertEquals(60.5, s1.getScore());
    }

    @Test
    @DisplayName("Test calculate grade")
    void testCalculateGrade() {
        Student s1 = new Student("6610450838", "eiei");
        s1.addScore(60.8);
        assertEquals("C",s1.grade());
    }

    @Test
    @DisplayName("Test change name")
    void testChangeName() {
        Student s1 = new Student("6610450838","eiei");
        s1.changeName("Tong");
        assertEquals("Tong",s1.getName());
        s1.changeName("Umami");
        assertEquals("Umami",s1.getName());
    }

    @Test
    @DisplayName("Test isId")
    void testIsId() {
        Student s1 = new Student("6610450838","eiei");
        assertTrue(s1.isId("6610450838"));
    }

}