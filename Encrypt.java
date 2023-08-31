public class Encrypt {
    public static void main(String[] args) {
        String s = "my name is devdeep singha and i have finished my 12 from kv ongc";
        System.out.println(encrypt(s));
        //for everyindex the character get added with it's index number

        String d = encrypt(s);
        System.out.println(decrypt(d));
        //same goes for decryption expect its deducting
    }

    public static String decrypt(String s){
        String ans="";
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            char r = (char)(c - i+1);
            ans = ans+r;
        }
        return ans;
    }
    public static String encrypt(String s){
        String ans="";
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            char r = (char)(c + i-1);
            ans = ans+r;
        }
        return ans;
    }
}
