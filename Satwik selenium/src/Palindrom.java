public class Palindrom{
    public static void main(String[] args){
	String s="abcba";
	String s1="";
	for(int i=s.length()-1;i>=0;i--){
	   s1=s1+s.charAt(i);
	}
	System.out.println(s1);
	  if(s.equals(s1)){
	     System.out.println("the given string is a palindrome");
	  }
	  else{
	     System.out.println("the given string is not a palindrome");
	  }
    }
}