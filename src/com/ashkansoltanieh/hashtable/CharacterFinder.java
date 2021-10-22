package com.ashkansoltanieh.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharacterFinder {
    String expression;

    public CharacterFinder(String expression) {
        this.expression = expression;
    }

    public char findFirstNonRepeatingChar() {
        Map<Character, Integer> map = new HashMap<>();
        var chars = expression.toCharArray();
        for (var ch: chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        //items are not in order in Hash table, and we need to loop the array
        for (var ch : chars) {
            if (map.get(ch) == 1) return ch;
        }
        return Character.MIN_VALUE;
    }

    public char findFirstRepeatedChar() {
        var chars = expression.toCharArray();
        Set<Character> set = new HashSet<>();

        for (var ch: chars) {
            if (set.contains(ch)) return ch;
            set.add(ch);
        }

        return Character.MIN_VALUE;
    }
}
