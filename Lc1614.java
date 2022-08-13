import java.util.*;

public class Lc1614 {
    private static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0;
        for(char ch: s.toCharArray()) {
            if(ch == '(')
                stack.push(ch);
            else if(ch == ')') {
                max = Math.max(max, stack.size());
                stack.pop();
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(solution("(1+(2*3)+((8)/4))+1"));
        System.out.println(solution("(1)+((2))+((3))"));
    }
}
