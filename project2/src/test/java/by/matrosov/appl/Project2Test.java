package by.matrosov.appl;

import org.junit.Test;

import static org.junit.Assert.*;

public class Project2Test {

    @Test
    public void getMessage() {
        Project2 project2 = new Project2();
        assertEquals("project1 service", project2.getMessage());
    }
}