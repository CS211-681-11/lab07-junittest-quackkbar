package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

 //   static Student s;
//    @BeforeAll // must static
//    static void init(){
//        Student s = new Student("6710405401", "Test");
//    }

    Student s;
    @BeforeEach
    void init(){
        s = new Student("6710405401", "Test");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 12 คะแนน")
    void testAddScore() {

        s.addScore(12);
        assertEquals(12, s.getScore());
    }

    @Test
    @DisplayName("ทดสอบการคิดเกรด")
    void testCalculateGrade(){
        s.addScore(10);
        assertEquals( "F", s.getGrade());
    }

    @Test
    @DisplayName("ทดสอบเปลี่ยนชื่อ")
    void testChangeName(){
        s.changeName("ABC");
        assertEquals("ABC", s.getName());
    }

    @Test
    void testToString(){
        assertEquals("{id: \'6710405401\', name: \'Test\', score: 0.0}", s.toString());
    }
}