/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author masha
 */
public class showReportTest {
    
    public showReportTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of findingTaskName method, of class showReport.
     */
    @Test
    public void testFindingTaskName() {
        System.out.println("findingTaskName");
        String detailedName = "";
        String expResult = "";
        String result = showReport.findingTaskName(detailedName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longestDuration method, of class showReport.
     */
    @Test
    public void testLongestDuration() {
        System.out.println("longestDuration");
        String expResult = "";
        String result = showReport.longestDuration();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of findStatus method, of class showReport.
     */
    @Test
    public void testFindStatus() {
        System.out.println("findStatus");
        String developersName = "";
        String expResult = "";
        String result = showReport.findStatus(developersName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deletingTasks method, of class showReport.
     */
    @Test
    public void testDeletingTasks() {
        System.out.println("deletingTasks");
        String deleteTaskName = "";
        String expResult = "";
        String result = showReport.deletingTasks(deleteTaskName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of openReport method, of class showReport.
     */
    @Test
    public void testOpenReport() {
        System.out.println("openReport");
        String expResult = "";
        String result = showReport.openReport();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of statusWithDone method, of class showReport.
     */
    @Test
    public void testStatusWithDone() {
        System.out.println("statusWithDone");
        String expResult = "";
        String result = showReport.statusWithDone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
