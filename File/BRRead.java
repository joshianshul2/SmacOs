import java.io.*;
class BRRead 
{	
	public static void main(String args[]) throws IOException
	{
		char c;
		int i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'q' to quit.");
		do 
		{	
			i=br.read();
			c=(char) (i);
			System.out.println(c+" = "+i);
		} 
		while(c != 'q');
	}

}