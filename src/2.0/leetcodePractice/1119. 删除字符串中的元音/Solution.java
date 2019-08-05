import java.util.ArrayList;

class Solution {
    public String removeVowels(String S) {
        ArrayList<Character> dict = new ArrayList<>();
        dict.add('a');
        dict.add('e');
        dict.add('i');
        dict.add('o');
        dict.add('u');
        for(int i = 0; i<S.length(); i++) {
            System.out.println("检查 "+S.charAt(i));
            if (dict.contains(S.charAt(i))) {
                System.out.println("contains "+S.charAt(i));
                S = S.replaceAll(String.valueOf(S.charAt(i)), "");
                i--;
            }
        }
        return S;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "aeiou";
        System.out.println(s.removeVowels(str));
    }
}