/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> resList = new LinkedList<>();
        if(digits == null || digits.isEmpty()) {
            return resList;
        }

        char[][] map = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'},
                {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        resList.add("");
        while(resList.peek().length() != digits.length()) {
            String pre = resList.poll();
            int index = digits.charAt(pre.length()) - '2';
            char[] list = map[index];
            for(char c : list) {
                resList.add(pre + c);
            }
        }
        return resList;
        
    }
}
// @lc code=end

