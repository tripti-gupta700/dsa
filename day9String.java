public class day9String {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(lengthOfLastWord("Hello World"));
    }
    // Example 1: Input: jewels = "aA", stones = "aAAbbbb", Output: 3
    private static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0; i<jewels.length(); i++){
            for(int j=0; j<stones.length(); j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
    // Example 1: Input: s = "Hello World", Output: 5, Explanation: The last word is "World" with length 5.
    private static int lengthOfLastWord(String s) {
       int count=0;
       for(int i=s.length()-1; i>=0; i--){
        if(s.charAt(i)!= ' '){count++;}
        else{break;}
       } 
       return count;
    }
}
