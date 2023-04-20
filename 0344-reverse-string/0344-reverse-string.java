class Solution {
  public void reverseString(char[] s) {
    int lst = 0;
    int rev = s.length - 1;

    while (lst < rev) {
      char temp = s[lst];
      s[lst++] = s[rev];
      s[rev--] = temp;
    }
  }
}
