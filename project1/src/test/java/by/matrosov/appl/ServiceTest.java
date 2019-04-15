package by.matrosov.appl;

import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTest {

    @Test
    public void getMessage() {
        Service service = new Service();
        assertEquals("project1 service", service.getMessage());
    }
}