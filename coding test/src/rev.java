
public class rev {
	String str="hello";
	String rev="";
	public void revStr()
	{
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rev r=new rev();
r.revStr();
	}

}
