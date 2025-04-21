package stack;

import java.util.Stack;

public class StringReverser {


    public String stringreverse(String input){
    Stack<Character> stack = new Stack<>();
    if(input == null)
        throw new IllegalArgumentException();
    for(char ch : input.toCharArray())
        stack.push(ch);
    StringBuilder reversed = new StringBuilder();

    while (!stack.empty()){
        reversed.append(stack.pop());
    }

    return reversed.toString();

    }
}
