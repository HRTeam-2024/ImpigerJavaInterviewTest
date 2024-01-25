public class Palindrome {
    public static boolean checkPalindrome(String phrase) {
        // code here..
        int left = 0;
        int right = phrase.length()-1;
               
        while(left<right)
        {
            if(phrase.charAt(left)!= phrase.charAt(right))
            {
            return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // begin here
        System.out.println("starting...");
        String a = "madam";
        String b = "hello";
        boolean result1 = checkPalindrome(a);
        boolean result2= checkPalindrome(b);
        System.out.println("The given string is a palindrome " +result1);
        System.out.println("The given string is a palindrome " +result2);
    }


    // Palindrome is a word which is same RTL and LTR
    

    
}