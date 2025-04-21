package stack;

import java.util.Stack;

public class BalancedString {



    public boolean isBalance(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'|| ch =='<'){  //([ )
                stack.push(ch);
            }

            if(ch == ')'|| ch == ']' || ch == '}'|| ch =='>'){
                if (stack.empty()) return false;
                char top = stack.pop();
                if(
                        (ch ==')' && top != '(') || (ch ==']' && top != '[') || (ch =='}' && top != '{') || (ch =='>' && top != '<')
                )
                    return false;

            }
        }
        return stack.empty();
    }
}
