package interview;

import java.util.Arrays;

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
	void remduplicatechrinstring()
	{
		String str="programming";
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(result.indexOf(ch)==-1)
			{
				result=result+ch;
			}
		}
		System.out.println(result);
	}
	
	void findcountofwordrepeats()
	{
		String s="yogesh mangesh nilesh ramesh";
		String tofind="sh";
		int index=s.indexOf(tofind);
		int count=0;
		while(index!=-1)
		{
			count++;
			index=s.indexOf(tofind, index+1);
		}
		System.out.println(tofind+":"+count);
	}
	void secondplacecodeformaxnumberfromarray()
	{
		int a[]= {1,2,3,4,5};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crack obj=new crack();
		obj.secondplacecodeformaxnumberfromarray();
	}

}
