import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	String yourString="helloworld.123";
	List specialCharacters=new ArrayList();
	
	specialCharacters.add('.');
	int count=0;
	for(int i=0;i<yourString.length();i++)
	{
		for(int j=0;j<specialCharacters.size();j++)
		{
			if(yourString.charAt(i)==((Character)specialCharacters.get(j)).charValue())
			{
				count++;
			}
		}
	}
	System.out.println(count);
	}
}
			
