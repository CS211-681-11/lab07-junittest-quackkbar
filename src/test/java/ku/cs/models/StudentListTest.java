package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList list;
    @BeforeEach
    void init(){
        list.addNewStudent("1234567890", "Test1");
        list.addNewStudent("2222222222", "Teen");
        list.addNewStudent("3333333333", "Toast");
        list = new StudentList();
    }

    @Test
    @DisplayName("check addNewStudent")
    void testAddNewStudent() {
        list.addNewStudent("1111111111", "Test2");
        assertEquals("123", list.getStudents());
    }

    @Test
    void testFindStudentById() {
        String target = list.findStudentById("2222222222").toString();
        assertEquals("{id: \'2222222222\', name: \'Teen\', score: 0.0}", target);
    }

    @Test
    void testFilterByName() {
        StudentList testFilter = new StudentList();
        assertEquals("");
    }
}