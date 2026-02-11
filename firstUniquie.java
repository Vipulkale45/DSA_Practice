package DSA_Practice;

class Solution {
    public int firstUniqChar(String s) {
        
        int ans = Integer.MAX_VALUE;     
        for(char c = 'a'; c <= 'z'; c++){ 
            int index = s.indexOf(c);
            if(index != -1 && index == s.lastIndexOf(c)){
                ans = Math.min(ans, index);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    
    // Main method to test the code
    public static void main(String[] args) {
        Solution solution = new Solution();  // ✅ FIXED
        
        // Test cases
        String test1 = "leetcode";
        String test2 = "loveleetcode";
        String test3 = "aabb";
        
        System.out.println("Input: \"" + test1 + "\" → Output: " + solution.firstUniqChar(test1));
        System.out.println("Input: \"" + test2 + "\" → Output: " + solution.firstUniqChar(test2));
        System.out.println("Input: \"" + test3 + "\" → Output: " + solution.firstUniqChar(test3));
    }
}
