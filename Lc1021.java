import java.util.*;

public class Lc1021 {
    private static String solution(String s) {
        String sol = "";
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()) {
            if(ch == '(') {
                if(!stack.isEmpty()) 
                    sol += "(";
                stack.add(ch);
            } else if(ch == ')') {
                stack.pop();
                if(!stack.isEmpty())
                    sol += ")";
            }
        }
        return sol;
    }
    public static void main(String[] args) {
        System.out.println(solution("(()())(())"));
        System.out.println(solution("(()())(())(()(()))"));
    }
}
