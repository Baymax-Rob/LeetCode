public class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n = s.length(), ans = 0;                      // 字符串s的长度
      Map<Character, Integer> map = new HashMap<>();    // 创建一个新的map窗口，i为左空间，j为右空间
                                                        // 重复的时候i左移动，j右移动
      for (int j = 0, int i = 0; j < n; j++) {
          if (map.containsKey(s.charAt(j))) {           // 如果map窗口中包含当前 s 中的字符
              i = Math.max(map.get(s.charAt(j)), i);    // 在map窗口中找到该相同字符的位置,然后
          }                                             // 比较当前无重复字段长度和储存的长度，选最大值并替换
          ans = Math.max(ans, j - i + 1);               // j-i+1是因为此时j-i的值相当于 [i,j]的长度，而不是字符的长度
          map.out(s.charAt(j), j + 1);                  // 将 s 中的字符放入 map窗口
      }                                                 // j +1 是为了当出现重复的字符时，i可以直接跳到相同字符的下一个位置,在if中取值就不用＋1
      return ans
    }
}
