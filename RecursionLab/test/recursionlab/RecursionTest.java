/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionlab;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @version Fall 2019
 * @author Kyle
 */
public class RecursionTest {

    /**
     * Test instance
     */
    Recursion instance;

    /**
     * Instantiation of test instance
     */
    public RecursionTest() {
        instance = new Recursion();
    }

    /**
     * Test of powerN method, of class Recursion.
     */
    @Test
    public void testPowN() {
        assertEquals(instance.powN(3, 0), 1);
        assertEquals(instance.powN(3, 1), 3);
        assertEquals(instance.powN(3, 2), 9);
        assertEquals(instance.powN(3, 3), 27);
        assertEquals(instance.powN(2, 1), 2);
        assertEquals(instance.powN(2, 2), 4);
        assertEquals(instance.powN(2, 3), 8);
        assertEquals(instance.powN(2, 4), 16);
        assertEquals(instance.powN(2, 5), 32);
        assertEquals(instance.powN(10, 1), 10);
        assertEquals(instance.powN(10, 2), 100);
        assertEquals(instance.powN(10, 3), 1000);
    }

    /**
     * Test of tabs method, of class Recursion.
     */
    @Test
    public void testTabs() {
        assertEquals(instance.tabs(0), 0);
        assertEquals(instance.tabs(1), 3);
        assertEquals(instance.tabs(2), 6);
        assertEquals(instance.tabs(3), 9);
        assertEquals(instance.tabs(4), 12);
        assertEquals(instance.tabs(5), 15);
        assertEquals(instance.tabs(12), 36);
        assertEquals(instance.tabs(50), 150);
        assertEquals(instance.tabs(234), 702);
    }

    /**
     * Test of overExclaim method, of class Recursion.
     */
    @Test
    public void testOverExclaim() {
        assertEquals(instance.overExclaim("String!!"), "String!");
        assertEquals(instance.overExclaim("Cool!!!"), "Cool!");
        assertEquals(instance.overExclaim("Seaweed"), "Seaweed");
        assertEquals(instance.overExclaim("Cannonball!!!!!"), "Cannonball!");
        assertEquals(instance.overExclaim("I ride a moped!!!!!"), "I ride a moped!");
        assertEquals(instance.overExclaim("(>'.')>!!!!!"), "(>'.')>!");
        assertEquals(instance.overExclaim("Watermelon?!!!!!!!!"), "Watermelon?!");
        assertEquals(instance.overExclaim("#$%!@#&!!!!!"), "#$%!@#&!");
        assertEquals(instance.overExclaim("!!!!!!!!!!!!!!!!!!!!!"), "!");
        assertEquals(instance.overExclaim("Cool Whip!!!!!"), "Cool Whip!");
        assertEquals(instance.overExclaim("Enxymes!!!!!!!!!!"), "Enxymes!");

    }

    /**
     * Test of manyX method, of class Recursion.
     */
    @Test
    public void testManyX() {
        assertEquals(instance.manyX("XxxDemonSlayerxxX"), 6);
        assertEquals(instance.manyX("PugXSlayer"), 1);
        assertEquals(instance.manyX("OnlyxxxXxHave"), 5);
        assertEquals(instance.manyX("ImpossiblyXXXXAwesome"), 4);
        assertEquals(instance.manyX("xPANCAKExDINNERx"), 3);
        assertEquals(instance.manyX("XXXXXxxxxxxXXXXXxxxxxx"), 22);
        assertEquals(instance.manyX(""), 0);
        assertEquals(instance.manyX("DANGEROUSLYxxxxxxCHEESYxxxxxx"), 12);
        assertEquals(instance.manyX("NothingSpecial"), 0);
        assertEquals(instance.manyX("xOxUxTxOxFxCxOxNxTxRxOxL"), 12);
    }

}

