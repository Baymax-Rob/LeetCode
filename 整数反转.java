class Solution {
    public int reverse(int x) {
      // ans 用来求反转后的数
     int ans = 0;
        while (x != 0) {
            // x % 10 取得最后一位
            int pop = x % 10;
            // 2^31-1=2147483647,-2^31=-2147483648
            // ans大于整数最大值的话溢出
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7)) 
                return 0;
             // ans小于整数最小值的话溢出
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8)) 
                return 0;
            ans = ans * 10 + pop;
            // x/10 去掉最后一位
            x /= 10;
        }
        return ans;
    }
}
