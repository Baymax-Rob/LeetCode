class Solution {
    public boolean isPalindrome(int x) {
    // 小于0的，最后一位为0的不会是回文数
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int a = 0;
        // x 小于回文数时，意味着已经处理掉x后面一半的数
        while (x > a) {
        // x % 10 得到倒数第一个数字，x / 10 移除最后一位数字， a * 10 + x % 10 得到后面的数的和
            a = a * 10 + x % 10;
            x = x / 10;
        }
        //  偶数位情况：反转后的数a与x的前半部分相同的话，则返回true
        //  奇数位情况：反转后的数a需要去掉最后一位与x的前半部分比较
        return x == a || x == a / 10;
    }
}
