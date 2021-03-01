public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   																//why is it static?
                                   //It doesnt change 
   
   //add an instance variable
private String s;
	//create a constructor
	public Word(){
    s="";
  }

  public Word(String a){
    s=a;
  }

	//create other methods
  
  //getter method 
  public String getWord(){
    return s;
  }
  
  //setter method 
  public void setWord(String b){
    s=b;
  }

  //Method isVowel for checking if a letter is a vowel(String input)
 public boolean isVowel(String a){
  //takes a char and checks if it ==s a,e,i,o,or u
   for(int i=0; i<vowels.length();i++){
     if(a.equals(vowels.substring(i,i+1)))
    //if it does return true
     return true;
   }
  //otherwise return false
   return false;
 }
 
  //Method getNumVowels for counting vowels in a word
  public int getNumVowels(){
  //int count equals 0
  int count=0;
  //Loop through characters of the string
  for(int i=0; i<s.length();i++){
  //check if each isVowel
  if(this.isVowel(s.substring(i,i+1)))
  //if true, increment count
  count++;
  }
  //return count 
return count; 
  }

  //Method getLength to return number of chars
  public int getLength(){
  //return input’s length()
    return s.length();
  }



	//look at the sample runner code
	//on the lab handout

	//create a toString method
  public String toString(){
   return s;
  }
  
}