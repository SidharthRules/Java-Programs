import java.util.*;

public class Anagram
{
 public static boolean isAnagram(String s1,String s2)
 {
  if(s1.length()!=s2.length())
  {  return false; }
  s1=sortCharacters(s1);
  
  s2=sortCharacters(s2);
  return s1.equals(s2);
  
  
 }
 public static String sortCharacters(String str)
 {
  char[] c=str.toLowerCase().toCharArray();
  Arrays.sort(c);
  return String.valueOf(c);
 }
 public static void main(String arg[])
 {
  String s1,s2;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter 2 strings");
  s1=sc.nextLine();
  s2=sc.nextLine();
  if(isAnagram(s1,s2))
   System.out.println("Both are anagram");
  else
   System.out.println("Both are not anagram");
 }
}
