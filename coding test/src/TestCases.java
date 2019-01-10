import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestCases {
	
     public static void main(String [] args) {
    	 
    	 
    	 String str = "{}";
    	 
    	 System.out.println(isTrue(str));
     }
     
     public static boolean isTrue(String str) {
    	 
    	 boolean b = false;
    	 
    	 int leftPara = 0;
    	 int rigthPara = 0;
    	 
    	 char[] ch = str.toCharArray();
    	 
    	 Map<Character,Integer> mp = new LinkedHashMap<Character, Integer>();
    	 
    	 for(Character c : ch) {
    		 
    		 if(c == '(' || c == ')') {
    			 
    			 if(mp.containsKey(c)) {
        			 
    				 mp.put(c, mp.get(c)+1);
        		 }
    			 else {
    				 
    				 mp.put(c, 1);
    			 }
    		 }
    		 
    	 }
       	
    	 Set<Character> keys = mp.keySet();
    	 
    	 for(Character key : keys) {
    		 
    		 if(key =='(' ) {
    			 leftPara = mp.get(key);
    			 
    		 }
    		 else if(key == ')') {
    			 rigthPara = mp.get(key);
    			
    		 }
    	 }
    
         if(leftPara == rigthPara) {
        	 
        	 for(int i=0;i<str.length();i++) {
        		 
        		 if(str.charAt(i)== '(' || str.charAt(i)==')') {
        			 
        			 if(str.charAt(i)=='(') {
                		 b = true;
                		 break;
                	 }
                	 else {
                		 b = false;
                		 break;
                	 }
        		 }
        		 
        	 }
         }
         else {
        	 
        	 return b = false;
         }
         return b;
     }
}