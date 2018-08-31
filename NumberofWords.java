import java.util.Scanner;
public class NumberofWords 
{
        int i=0,count=0;
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();

        void word() 
        {
	    while(i<s.length()) 
               {
                   if(s.charAt(i)==' ') 
                   {
	           count++;
                   }i++;
               }
	   count=count+1;
	   System.out.println("Total words present in string are: "+count);
        }

	public static void main(String[] args) 
        {
          NumberofWords cw = new NumberofWords();
          cw.word();
        }

}