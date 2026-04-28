
class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "ac";
        System.out.println(sol.longestPalindrome(s)); // Output could be "bab" or "aba"
    }

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            int posLetraRepetida = posicaoLetraRepetida(s, s.charAt(i));
            if (posLetraRepetida != i) {
                return s.substring(i, posLetraRepetida + 1);
            }
        }
        return s;
    }

    private int posicaoLetraRepetida(String s, char c){
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }
    
}