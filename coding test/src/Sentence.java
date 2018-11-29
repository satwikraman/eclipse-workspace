public class Sentence {
	public static void main(String[] args) {
		String s="hello how are you";
		String st[]=s.split(" ");
		for (int i = 0; i < st.length; i++) {
			String str ="";
			for (int j = st[i].length()-1; j >= 0; j--) {
				str= str+(st[i].charAt(j));
			}
			System.out.print(str+" ");
		}
	}
}
