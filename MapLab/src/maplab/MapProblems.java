/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maplab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @version Spring 2019
 * @author Kyle
 */
public class MapProblems {

    /**
     * Modify and return the given map as follows: if the key "a" has a value,
     * set the key "b" to have that value, and set the key "a" to have the value
     * "". Basically "b" is confiscating the value and replacing it with the
     * empty string.
     *
     * @param map to be edited
     * @return map
     */
    public Map<String, String> confiscate(Map<String, String> map) {
        if (map.get("a") != null) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    /**
     * Modify and return the given map as follows: if the key "duck" has a
     * value, set the key "goose" to have that same value. In all cases remove
     * the key "swan", the rest of the map should not change.
     *
     * @param map to be edited
     * @return map
     */
    public Map<String, String> mapBird1(Map<String, String> map) {
        if (map.get("duck") != null) {
            map.put("goose", map.get("duck"));
        }

        map.remove("swan");

        return map;
    }

    /**
     * Given a map of bird keys and topping values, modify and return the map as
     * follows: if the key "turkey" has a value, set that as the value for the
     * key "chicken". If the key "vulture" has a value, set that as the value
     * for the key "buzzard".
     *
     * @param map to be edited
     * @return map
     */
    public Map<String, String> mapBird2(Map<String, String> map) {
        if (map.get("turkey") != null) {
            map.put("chicken", map.get("turkey"));
        }
        if (map.get("vulture") != null) {
            map.put("buzzard", map.get("vulture"));
        }

        return map;

    }

    /**
     * Given an array of strings, return a Map<String, Integer> with a key for
     * each different string, with the value the number of times that string
     * appears in the array.
     *
     * @param strings array
     * @return map
     */
    public Map<String, Integer> wordCount(ArrayList<String> strings) {

        Map<String, Integer> map = new HashMap();
        int count = 0;

        for (int i = 0; i < strings.size(); i++) {
            String key = strings.get(i);
            if (map.containsKey(key)) {
                count = map.get(key);
                map.put(key, count + 1);
            } else {
                map.put(key, 1);
            }
        }
        return map;

    }

    /**
     * Given an ArrayList of Strings, create a new map that creates a key for
     * each String by multiplying it's length by 7. If a key is already being
     * used do not add the new value.
     *
     * @param str ArrayList of Strings
     * @return new Map
     */
    public Map<Integer, String> intMap(ArrayList<String> str) {
        Map<Integer, String> map = new HashMap();
        for (int i = 0; i < str.size(); i++) {
            int key = str.get(i).length() * 7;
            if(map.get(key) == null){
                map.put(key, str.get(i));
            }
        }
        return map;
    }

    /**
     * Caiomhe has tons of Student Records that need to be organized. She wants
     * you to put all these Records into a Map. The StudentRecord class already
     * has a hashCode method that should be used to create keys. Store all the
     * StudentRecord objects in a new map and then return it.
     *
     * @param students ArrayList of StudentRecord objects
     * @return map
     */
    public Map<Integer, StudentRecord> recordMap(ArrayList<StudentRecord> students) {
        Map<Integer, StudentRecord> map = new HashMap();
        for(int i = 0; i < students.size(); i++){
            map.put(students.get(i).hashCode(), students.get(i));
        }
        return map;
    }
}
