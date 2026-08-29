package com.patterns.structural.flyweight;

import java.util.HashMap;

// responsible for caching
public class TreeFactory {

    public static HashMap<String, Tree> trees = new HashMap<>();

    public static Tree getTree(String name) {
        if (trees.containsKey(name)) {
            return trees.get(name);
        } else {
            switch (name) {
                case "OAK":
                    Tree oak = new Oak("OAK");
                    trees.put("OAK", oak);
                    return oak;
                case "PINE":
                    Tree pine = new Oak("PINE");
                    trees.put("PINE", pine);
                    return pine;
                default:
                    return null;
            }
        }
    }
}
