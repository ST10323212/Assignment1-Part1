/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author user-pc
 */
public class StudentManagementAppTest {
    
    public StudentManagementAppTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of displayMenu method, of class StudentManagementApp.
     */
    @Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        StudentManagementApp instance = new StudentManagementApp();
        instance.displayMenu();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of captureStudent method, of class StudentManagementApp.
     */
    @Test
    public void testCaptureStudent() {
        System.out.println("captureStudent");
        StudentManagementApp instance = new StudentManagementApp();
        instance.captureStudent();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of searchStudent method, of class StudentManagementApp.
     */
    @Test
    public void testSearchStudent() {
        System.out.println("searchStudent");
        StudentManagementApp instance = new StudentManagementApp();
        instance.searchStudent();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of deleteStudent method, of class StudentManagementApp.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        StudentManagementApp instance = new StudentManagementApp();
        instance.deleteStudent();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of printStudentReport method, of class StudentManagementApp.
     */
    @Test
    public void testPrintStudentReport() {
        System.out.println("printStudentReport");
        StudentManagementApp instance = new StudentManagementApp();
        instance.printStudentReport();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class StudentManagementApp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StudentManagementApp.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
