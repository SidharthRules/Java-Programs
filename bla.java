class bla
{
   public static char getRandomCharacter(char ch1, char ch2)
   {

      return (char) (ch1 + Math.random() * (ch2 -ch1 +1));

   }
   public static char[] createArray()
   {

      //declare a 100 character array
      char[] character = new char[100];

      //for loop assigning the random characters to the array using getRandomCharacter method
      for (int x = 0; x < character.length; x++)
      character[x] = getRandomCharacter('a', 'z');

      //for loop outputting the characters in the array
      for (int x = 0; x < character.length; x++)
      System.out.println(character[x]);

      return character;

   }
   public static void countArray()
   {

      int vowelA=0, vowelE=0, vowelI=0, vowelO=0, vowelU=0, vowelY=0;
      int elsePlaceHolder = 0;
	  char [] arr = new char[100];
	  arr=createArray();
      for (int x = 0; x < 100; x++)
      {

         if (arr[x] == 'a')
         vowelA++;

         else if (arr[x] == 'e')
         vowelE++;

         else if (arr[x] == 'i')
         vowelI++;

         else if (arr[x] == 'o')
         vowelO++;

         else if (arr[x] == 'u')
         vowelU++;

         else if (arr[x] == 'y')
         vowelY++;

         else
         elsePlaceHolder++;

      }
      System.out.print(vowelA+" "+vowelE+" "+vowelI+" "+vowelO+" "+vowelU+" "+vowelY);
  }
      public static void main(String []as)
      {
			countArray();
		}
	}
