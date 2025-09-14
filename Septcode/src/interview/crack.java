package interview;

public class crack {
	void mirror()
	{
		String s="yogesh ramesh tayade";
		String ss[]=s.split(" ");
		String rev="";
		for(String w:ss)
		{
			String reverse="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverse=reverse+w.charAt(i);
			}
			rev=rev+reverse+" ";
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crack obj=new crack();
		obj.mirror();
	}

}
