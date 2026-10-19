class Solution {
    public boolean isPalindrome(String s) {
        int right = s.length() - 1;
        int left = 0;
        while (left < right) {
            while (left < right && !isAlphaNumberic(s.charAt(left))) {
                left++;
            }
            while (right > left && !isAlphaNumberic(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isAlphaNumberic(char c) {
         return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
