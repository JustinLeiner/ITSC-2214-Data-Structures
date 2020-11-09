/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcertTicket;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author justinleiner
 */
public class WalletTest {
    
    public WalletTest() {
    }

    /**
     * Test of add method, of class Wallet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        ConcertTicket ct = null;
        Wallet instance = new Wallet();
        ConcertTicket ct1, ct2;
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        try {
            ct1 = new ConcertTicket("Band 1", df.parse("09/20/2020"), 18.5);
            ct2 = new ConcertTicket("Band 2", df.parse("09/30/2020"), 20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO review the generated test code and remove the default call to fail.
            fail("Exception declaring ConcertTicket objects");
            return;
            
        }
     assertEquals(0, instance.getSize());
     instance.add(ct1);
     assertEquals(1,instance.getSize());
     instance.add(ct2);
     assertEquals(2, instance.getSize());
     assertTrue(instance.tickets[1].compareTo(ct2) == 0);
    }

    /**
     * Test of resize method, of class Wallet.
     */
    @Test
    public void testResize() {
        System.out.println("resize");
        Wallet instance = new Wallet();
        instance.resize();
       
    }

    /**
     * Test of toString method, of class Wallet.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Wallet instance = new Wallet();
        Wallet instance1 = new Wallet();
        String expResult = instance.toString();
        String result = instance1.toString();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getSize method, of class Wallet.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Wallet instance = new Wallet();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class Wallet.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Wallet instance = new Wallet();
        ConcertTicket ct1, ct2;
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        try {
            ct1 = new ConcertTicket("Band 1", df.parse("09/20/2020"), 18.5);
            ct2 = new ConcertTicket("Band 2", df.parse("09/30/2020"), 20);
        } catch (Exception e) {
           System.out.println(e.getMessage());
           fail("Excetion declaring ConcertTickect objects");
           return;
        }
        instance.add(ct1);
        instance.add(ct2);
        ConcertTicket firstRemoved = instance.remove();
        ConcertTicket secondRemoved = instance.remove();
        assertEquals(0, instance.getSize());
        assertTrue(ct2.compareTo(firstRemoved) == 0);
        assertTrue(ct1.compareTo(secondRemoved) == 0);
        
    }
    
}
