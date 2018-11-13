class palli{
	public static void main(String[] args){
		String s[]={"abba","caba","cdc"};
		int flag=0;
		for(int i=0;i<s.length;i++){
			for(int j=0;j<s[i].length();j++){
				if(s[i].charAt(j)!=s[i].charAt(s[i].length()-(j+1))){
					flag=1;
					break;
				}
			}
			if(flag==1){
				System.out.println(s[i]+""+"  not palindrome");
			}
			else{
				System.out.println(s[i]+""+" is a palindrome");
			}
			flag=0;
		}
	}
}