package by.matrosov.appl;

import org.junit.Test;

import static org.junit.Assert.*;

public class Project3Test {

    @Test
    public void getMessage() {
        Project3 project3 = new Project3();
        assertEquals("project1 service", project3.getMessage());
    }
}