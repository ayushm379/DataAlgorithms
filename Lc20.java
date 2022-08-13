import java.util.*;

public class Lc20 {
    public static boolean solution(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        Stack<Character> stack = new Stack<>();
        
        for(char ch: s.toCharArray()) {
            if(!map.containsKey(ch) || stack.isEmpty()) {
                stack.add(ch);
            } else {
                if(stack.peek() == map.get(ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(solution("()[]{}"));
        System.out.println(solution("(]"));
    }
}
