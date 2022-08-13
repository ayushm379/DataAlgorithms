public class Lc125 {
    private static boolean helper(String s, int start, int end) {
        if(start >= end) return true;
        if(!Character.isLetterOrDigit(s.charAt(start)))
            return helper(s, start+1, end);
        if(!Character.isLetterOrDigit(s.charAt(end)))
            return helper(s, start, end-1);
        if(s.charAt(start) != s.charAt(end))
            return false;
        return helper(s, start + 1, end - 1);
    }
    public static boolean solution(String s) {
        return helper(s.toLowerCase(), 0, s.length()-1);
    }
    public static void main(String[] args) {
        System.out.println(solution("A man, a plan, a canal: Panama"));
        System.out.println(solution("race a car"));
    }
}
