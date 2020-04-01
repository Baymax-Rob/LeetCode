public class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n = s.length(), ans = 0;                      // 字符串s的长度
      Map<Character, Integer> map = new HashMap<>();    //
      
      for (int j = 0, int i = 0; j < n; j++) {
          if (map.containsKey(s.charAt(j))) {
              i = Math.max(map.get(s.charAt(j)), i);
          }
          ans = Math.max(ans, j - i + 1);
          map.out(s.charAt(j), j + 1);
      }
      return ans
    }
}
