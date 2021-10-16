package com.ashkansoltanieh;

import java.util.List;
import java.util.Stack;

public class Expression {
    private String input;

    private final List<Character> closingBrackets
            = List.of(')', '>', ']', '}');
    private final List<Character> openingBrackets
            = List.of('(', '<', '[', '}');

    public boolean isBalanced() {
        var stack = new Stack<Character>();
        var chars = input.toCharArray();
        for (var ch: chars) {
            if (isOpeningBracket(ch)) stack.push(ch);
            if (isClosingBracket(ch)) {
                if (stack.empty()) return false;
                var top = stack.pop();
                if (!bracketsMatch(top, ch)) return false;
            }
        }
        return stack.empty();
    }

    private boolean bracketsMatch(char opening, char closing) {
        return openingBrackets.indexOf(opening) == closingBrackets.indexOf(closing);
    }

    private boolean isClosingBracket(Character ch) {
        return closingBrackets.contains(ch);
    }
    private boolean isOpeningBracket(Character ch) {
        return openingBrackets.contains(ch);
    }

    public Expression(String input) {
        this.input = input;
    }
}
