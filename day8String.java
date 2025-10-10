public class day8String {
    public static void main(String[] args) {
        String str = "hello world";
        String str1="geeksforgeeks";
        System.out.println(reverseString(str));
        System.out.println(pallindromeCheck(str));
        System.out.println(pallindromeCheckFull(str));
        System.out.println(nonRep(str1));
    }
    // Reverse a string
    public static String reverseString(String str){
        char[] ch=str.toCharArray();
        int i=0, j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;j--;
        }
        return new String(ch);
    }
    // Pallindrome Check
    public static boolean pallindromeCheck(String str){
        return reverseString(str).equals(str);
    }
    // pallindrome check full logic
    public static boolean pallindromeCheckFull(String str){
        int i=0, j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    // first non repeating char in a string
    // exp= str-"geeksforgeeks", op= 'f'
    public static char nonRep(String s) {
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            boolean found = false;

            for (int j = 0; j < n; ++j) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) 
                return s.charAt(i);
        }

        return '$';
    }

}
