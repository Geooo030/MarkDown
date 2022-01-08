/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length() == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                Character top = stack.pop();
                if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']') && top != '[') {
                    return false;
                }
                
            }
        }
        return stack.isEmpty();
    }
}
// @lc code=end

