/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maplab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @version Spring 2019
 * @author Kyle
 */
public class MapProblemsTest {

//<editor-fold defaultstate="collapsed" desc="Instance Setup">
    /**
     * Test Instance
     */
    MapProblems instance;

    /**
     * Default Constructor Initializes Test Instance
     */
    public MapProblemsTest() {
        instance = new MapProblems();
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="testConfiscate">
    /**
     * Test of confiscate method, of class MapProblems.
     */
    @Test
    public void testConfiscate() {
        System.out.println("confiscate");

        // A and B, but no C
        Map<String, String> result = new HashMap<>();
        result.put("a", "money");
        result.put("b", "sadness");
        //Solution
        Map<String, String> expResult = new HashMap<>();
        expResult.put("a", "");
        expResult.put("b", "money");
        //Test Case 1
        assertEquals("Case 1", expResult, instance.confiscate(result));

        // A, no B or C
        result = new HashMap<>();
        result.put("a", "money");
        //Solution
        expResult = new HashMap<>();
        expResult.put("a", "");
        expResult.put("b", "money");
        //Test Case 2
        assertEquals("Case 2", expResult, instance.confiscate(result));

        // A B C
        result = new HashMap<>();
        result.put("a", "money");
        result.put("b", "sadness");
        result.put("c", "diamonds");
        //Solution
        expResult = new HashMap<>();
        expResult.put("a", "");
        expResult.put("b", "money");
        expResult.put("c", "diamonds");
        //Test Case 3
        assertEquals("Case 3", expResult, instance.confiscate(result));

        // C
        result = new HashMap<>();
        result.put("c", "diamonds");
        //Solution
        expResult = new HashMap<>();
        expResult.put("c", "diamonds");
        //Test Case 4
        assertEquals("Case 4", expResult, instance.confiscate(result));

        // A and C
        result = new HashMap<>();
        result.put("a", "money");
        result.put("c", "diamonds");
        //Solution
        expResult = new HashMap<>();
        expResult.put("a", "");
        expResult.put("b", "money");
        expResult.put("c", "diamonds");
        //Test Case 5
        assertEquals("Case 5", expResult, instance.confiscate(result));

        // Empty
        result = new HashMap<>();
        //Solution
        expResult = new HashMap<>();
        //Test Case 6
        assertEquals("Case 6", expResult, instance.confiscate(result));

    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="testMapBird1">
    /**
     * Test of mapBird1 method, of class MapProblems.
     */
    @Test
    public void testMapBird1() {
        System.out.println("mapBird1");

        // duck, swan
        Map<String, String> input = new HashMap<>();
        input.put("duck", "quackquack");
        input.put("swan", "kentucky");
        //Solution
        Map<String, String> output = new HashMap<>();
        output.put("duck", "quackquack");
        output.put("goose", "quackquack");
        //Test Case 1
        assertEquals("Case 1", output, instance.mapBird1(input));

        // empty
        input = new HashMap<>();
        //Solution
        output = new HashMap<>();
        //Test Case 2
        assertEquals("Case 2", output, instance.mapBird1(input));

        // duck only
        input = new HashMap<>();
        input.put("duck", "tomato");
        //Solution
        output = new HashMap<>();
        output.put("duck", "tomato");
        output.put("goose", "tomato");
        //Test Case 3
        assertEquals("Case 3", output, instance.mapBird1(input));

        // swan only
        input = new HashMap<>();
        input.put("swan", "wisconsin");
        //Solution
        output = new HashMap<>();
        //Test Case 4
        assertEquals("Case 4", output, instance.mapBird1(input));

        // duck, goose
        input = new HashMap<>();
        input.put("duck", "genocide");
        input.put("goose", "peace");
        //Solution
        output = new HashMap<>();
        output.put("duck", "genocide");
        output.put("goose", "genocide");
        //Test Case 5
        assertEquals("Case 5", output, instance.mapBird1(input));
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="testMapBird2">
    /**
     * Test of mapBird2 method, of class MapProblems.
     */
    @Test
    public void testMapBird2() {
        System.out.println("mapBird2");

        // turkey
        Map<String, String> input = new HashMap<>();
        input.put("turkey", "gobblegobble");
        //Solution
        Map<String, String> output = new HashMap<>();
        output.put("turkey", "gobblegobble");
        output.put("chicken", "gobblegobble");
        //Test Case 1
        assertEquals("Case 1", output, instance.mapBird2(input));

        // turkey, chicken
        input = new HashMap<>();
        input.put("turkey", "gobblegobble");
        input.put("chicken", "moo");
        //Solution
        output = new HashMap<>();
        output.put("turkey", "gobblegobble");
        output.put("chicken", "gobblegobble");
        //Test Case 2
        assertEquals("Case 2", output, instance.mapBird2(input));

        // vulture
        input = new HashMap<>();
        input.put("vulture", "culture");
        //Solution
        output = new HashMap<>();
        output.put("vulture", "culture");
        output.put("buzzard", "culture");
        //Test Case 3
        assertEquals("Case 3", output, instance.mapBird2(input));

        // vulture, buzzard
        input = new HashMap<>();
        input.put("vulture", "culture");
        input.put("buzzard", "cottage cheese");
        //Solution
        output = new HashMap<>();
        output.put("vulture", "culture");
        output.put("buzzard", "culture");
        //Test Case 4
        assertEquals("Case 4", output, instance.mapBird2(input));

        //turkey, vulture
        input = new HashMap<>();
        input.put("turkey", "absolute zero");
        input.put("vulture", "surface of the sun");
        //Solution
        output = new HashMap<>();
        output.put("turkey", "absolute zero");
        output.put("vulture", "surface of the sun");
        output.put("chicken", "absolute zero");
        output.put("buzzard", "surface of the sun");
        //Test Case 5
        assertEquals("Case 5", output, instance.mapBird2(input));

        //empty
        input = new HashMap<>();
        //Solution
        output = new HashMap<>();
        //Test Case 5
        assertEquals("Case 5", output, instance.mapBird2(input));
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="testWordCount">
    /**
     * Test of wordCount method, of class MapProblems.
     */
    @Test
    public void testWordCount() {
        System.out.println("wordCount");

        // empty
        ArrayList<String> input = new ArrayList<>();
        //Solution
        Map<String, Integer> output = new HashMap<>();
        //Test Case 1
        assertEquals("Case 1", output, instance.intMap(input));

        // one item
        input = new ArrayList<>();
        input.add("anchovy");
        //Solution
        output = new HashMap<>();
        output.put("anchovy", 1);
        //Test Case 2
        assertEquals("Case 2", output, instance.wordCount(input));

        // two different items
        input = new ArrayList<>();
        input.add("anchovy");
        input.add("pepperoni");
        //Solution
        output = new HashMap<>();
        output.put("anchovy", 1);
        output.put("pepperoni", 1);
        //Test Case 3
        assertEquals("Case 3", output, instance.wordCount(input));

        // same item multiple times
        input = new ArrayList<>();
        input.add("anchovy");
        input.add("pepperoni");
        input.add("anchovy");
        input.add("anchovy");
        input.add("pepperoni");
        //Solution
        output = new HashMap<>();
        output.put("anchovy", 3);
        output.put("pepperoni", 2);
        //Test Case 4
        assertEquals("Case 4", output, instance.wordCount(input));
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="testIntMap">
    /**
     * Test of intMap method, of class MapProblems.
     */
    @Test
    public void testIntMap() {
        System.out.println("intMap");

        // empty
        ArrayList<String> input = new ArrayList<>();
        //Solution
        Map<Integer, String> output = new HashMap<>();
        //Test Case 1
        assertEquals("Case 1", output, instance.intMap(input));

        // one item
        input = new ArrayList<>();
        input.add("spicy");
        //Solution
        output = new HashMap<>();
        output.put(35, "spicy");
        //Test Case 1
        assertEquals("Case 1", output, instance.intMap(input));

        // multiple items
        input = new ArrayList<>();
        input.add("spicy");
        input.add("one");
        input.add("skeletor");
        //Solution
        output = new HashMap<>();
        output.put(35, "spicy");
        output.put(21, "one");
        output.put(56, "skeletor");
        //Test Case 2
        assertEquals("Case 2", output, instance.intMap(input));

        // multiple items - skip adding one
        input = new ArrayList<>();
        input.add("spicy");
        input.add("one");
        input.add("skeletor");
        input.add("two");
        //Solution
        output = new HashMap<>();
        output.put(35, "spicy");
        output.put(21, "one");
        output.put(56, "skeletor");
        //Test Case 3
        assertEquals("Case 3", output, instance.intMap(input));

    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="restRecordMap">
    /**
     * Test of recordMap method, of class MapProblems.
     */
    @Test
    public void testRecordMap() {
        System.out.println("recordMap");

        StudentRecord a = new StudentRecord("Beetle", "Juice", 999);
        StudentRecord b = new StudentRecord("Christina", "Ricci", 444);
        StudentRecord c = new StudentRecord("Michael", "Keaton", 555);
        StudentRecord d = new StudentRecord("Mister", "T", 688);
        //Overriding record
        StudentRecord e = new StudentRecord("Mista", "F", 689);

        // empty
        ArrayList<StudentRecord> input = new ArrayList<>();
        //Solution
        Map<Integer, StudentRecord> output = new HashMap<>();
        //Test Case 1
        assertEquals("Case 1", output, instance.recordMap(input));

        // one entry
        input = new ArrayList<>();
        input.add(a);
        //Solution
        output = new HashMap<>();
        output.put(a.hashCode(), a);
        //Test Case 2
        assertEquals("Case 2", output, instance.recordMap(input));

        // multiple entries
        input = new ArrayList<>();
        input.add(a);
        input.add(b);
        input.add(c);
        input.add(d);
        //Solution
        output = new HashMap<>();
        output.put(a.hashCode(), a);
        output.put(b.hashCode(), b);
        output.put(c.hashCode(), c);
        output.put(d.hashCode(), d);
        //Test Case 3
        assertEquals("Case 3", output, instance.recordMap(input));

        // multiple entries - e overrides d
        input = new ArrayList<>();
        input.add(a);
        input.add(b);
        input.add(c);
        input.add(d);
        input.add(e);
        //Solution
        output = new HashMap<>();
        output.put(a.hashCode(), a);
        output.put(b.hashCode(), b);
        output.put(c.hashCode(), c);
        output.put(d.hashCode(), d);
        output.put(e.hashCode(), e);
        //Test Case 4
        assertEquals("Case 4", output, instance.recordMap(input));

        System.out.println(d.toString());
        System.out.println(e.toString());
    }
//</editor-fold>

}
