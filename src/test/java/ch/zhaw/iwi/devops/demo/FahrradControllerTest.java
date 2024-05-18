package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FahrradControllerTest {

    private FahrradController controller;

    @BeforeEach
    public void setUp() {
        controller = new FahrradController();
    }

    @Test
    public void testGetFahrradById() {
        Fahrrad fahrrad = controller.getFahrradById(1);
        assertNotNull(fahrrad);
        assertEquals(1, fahrrad.getId());
        assertEquals("Trek Emonda", fahrrad.getName());
    }



}
