package Task1.taskk;

public class StringPalindrome {
    public static void palindrome(){
        String s1 = "ankita";
        String s2 = "";

        for(int i = s1.length()-1;i>=0;i--){
            s2 = s2 +s1.charAt(i);
        }
        if(s1.equals(s2)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }
    public static void main(String[] args) {
        palindrome();
    }
}