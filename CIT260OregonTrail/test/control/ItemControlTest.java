/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Items;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class ItemControlTest {
    
    public ItemControlTest() {
    }

    /**
     * Test of addItemToStock method, of class ItemControl.
     */
    @Test
    public void testAddItemToStock() {
        System.out.println("addItemToStock");
        String name = "Govert";
        int quantity = 500;
        ItemControl instance = new ItemControl();
        boolean expResult = true;
        boolean result = instance.addItemToStock(name, quantity);
        assertEquals(expResult, result);
    }

    /**
     * Test of useResource method, of class ItemControl.
     */
    @Test
    public void testUseResource() {
        System.out.println("useResource");
        System.out.println("----------------------------------");
        System.out.println("Test 1");
        Items item = new Items();
        item.setName("Oxen");
        int quantity = 3;
        ItemControl instance = new ItemControl();
        boolean expResult = true;
        boolean result = instance.useResource(item, quantity);
        assertEquals(expResult, result);
        
        System.out.println("----------------------------------");
        System.out.println("Test 2");
        item = new Items();
        item.setName("Wheel");
        quantity = 0;
        instance = new ItemControl();
        expResult = false;
        result = instance.useResource(item, quantity);
        assertEquals(expResult, result);
        
        System.out.println("----------------------------------");
        System.out.println("Test 3");
        item = new Items();
        item.setName("Clothe");
        quantity = -2;
        instance = new ItemControl();
        expResult = false;
        result = instance.useResource(item, quantity);
        assertEquals(expResult, result);
        
        System.out.println("----------------------------------");
        System.out.println("Test 4");
        item = new Items();
        item.setName("Food");
        quantity = 1;
        instance = new ItemControl();
        expResult = true;
        result = instance.useResource(item, quantity);
        assertEquals(expResult, result);
    }

    /**
     * Test of debitMoney method, of class ItemControl.
     */
    @Test
    public void testDebitMoney() {
        System.out.println("debitMoney");
        float totalAmount = 0.0F;
        ItemControl instance = new ItemControl();
        int expResult = 0;
        int result = instance.debitMoney(totalAmount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoney method, of class ItemControl.
     */
    @Test
    public void testGetMoney() {
        System.out.println("getMoney");
        ItemControl instance = new ItemControl();
        instance.getMoney();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoney method, of class ItemControl.
     */
    @Test
    public void testSetMoney() {
        System.out.println("setMoney");
        totalAmount = null;
        ItemControl instance = new ItemControl();
        instance.setMoney(<error>);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}