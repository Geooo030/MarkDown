/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String str = "";        
        traceInput(str, n, 0, res);
        return res;
    }

    private void traceInput(String str, int n, int stack, List<String> res) {
        // 把栈里的左括号全部匹配完
        if(n == 0) {
            StringBuilder tmp = new StringBuilder(str);
            while(stack > 0) {
                tmp.append(')');
                stack--;
            }
            res.add(tmp.toString());
            return;
        }
        // 每个次DFS 1.左分支：加个左括号 n--, stack ++
        // 2.右分支：填充右括号 stack--
        traceInput(str + '(', n - 1, stack + 1, res);
        if(stack > 0) {
            traceInput(str + ')', n, stack - 1, res);
        }

    }
}
// @lc code=end

