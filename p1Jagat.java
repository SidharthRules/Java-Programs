import java.io.*;
import java.util.*;
class File1 
{
 public static void main(String[] args) throws Exception
 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a String:");
	  String data1=sc.nextLine();
	  FileOutputStream fos=new FileOutputStream("abc.txt");
	  byte[] b1=data1.getBytes();
	  fos.write(b1);
	  FileInputStream fis=new FileInputStream("abc.txt");
	  int size=fis.available();
	  byte[] b2=new byte[size];
	  fis.read(b2);
	  String data2=new String(b2);
	  FileOutputStream fos1=new FileOutputStream("vowels.txt");
	  FileOutputStream fos2=new FileOutputStream("consonants.txt");
	  FileOutputStream fos3=new FileOutputStream("nonalphabets.txt");
	  for(int i=0;i<=b2.length;i++)
   	  {
  		if(((int)b2[i]>=65 && (int)b2[i]<=90 ) || ((int)b2[i]>=97 && (int)b2[i]<=122))
   		{
    			if((int)b2[i]==65 || (int)b2[i]==69 || (int)b2[i]==73 || (int)b2[i]==79 || (int)b2[i]==85 || (int)b2[i]==97 || (int)b2[i]==101 || (int)b2[i]==105 || (int)b2[i]==111 ||(int)b2[i]==117 )
    			{
      				fos1.write(b2[i]);
   			}
		        else
		    	{
		     		fos2.write(b2[i]);
		    	}
		}
	   	else
	   	{
	    		fos3.write(b2[i]);
	   	}
	}
  	  fos1.close();
	  fos2.close();
	  fos3.close();
	  fis.close();
	  
	  FileInputStream fis1=new FileInputStream("vowels.txt");  
	     int size1=fis1.available();
	  byte[] b3=new byte[size1];
	  fis1.read(b3);
	  String data3=new String(b3);
	  System.out.println();
	  System.out.println("Vowels in the String:"+data3+"\n");
	  fis1.close();
	  FileInputStream fis2=new FileInputStream("consonants.txt");
	  int size2=fis2.available();
	  byte[] b4=new byte[size2];
	  fis2.read(b4);
	  String data4=new String(b4);
	  System.out.println("Consonants in the String:"+data4+"\n");
	  fis2.close();
	  FileInputStream fis3=new FileInputStream("nonalphabets.txt");
	  int size3=fis3.available();
	  byte[] b5=new byte[size2];
	  fis3.read(b5);
	  String data5=new String(b5);
	  System.out.println("Nonalphabate in the String:"+data5+"\n");
	  fis3.close();
	} 
}


// dProbuk @ http://www.dprobuk.com/2015/09/java-program-to-separate-vowels.html#ixzz3nn9NhC3I
