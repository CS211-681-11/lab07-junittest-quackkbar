package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList list;
    @BeforeEach
    void init(){
        list = new StudentList();
        list.addNewStudent("1234567890", "Test1");
        list.addNewStudent("2222222222", "Teen");
        list.addNewStudent("3333333333", "Toast");
    }

    @Test
    @DisplayName("check addNewStudent")
    void testAddNewStudent() {
        list.addNewStudent("1111111111", "Test2");

        Student s = list.findStudentById("1111111111");
        assertNotNull(s);
        assertEquals("Test2", s.getName());
    }

    @Test
    void testFindStudentById() {
        String target = list.findStudentById("2222222222").toString();
        assertEquals("{id: \'2222222222\', name: \'Teen\', score: 0.0}", target);
    }

    @Test
    void testFilterByName() {
        StudentList testFilter = new StudentList();
        testFilter.addNewStudent("3333333333", "Toast");
        StudentList result = list.filterByName("To");
        Student s = result.getStudents().get(0);
        assertEquals("Toast", s.getName());
    }

    @Test
    void testGiveScoreToId(){
        list.giveScoreToId("1234567890", 50.0);
        Student s = list.findStudentById("1234567890");
        assertEquals(50.0, s.getScore());
    }

    @Test
    void testViewGradeOfId(){
        assertEquals("F", list.viewGradeOfId("1234567890"));
    }
}