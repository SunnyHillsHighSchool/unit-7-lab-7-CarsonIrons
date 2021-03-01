//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{
    words = new ArrayList<Word>();
    for(int j=0;j<wordList.length;j++){
     words.add( new Word(wordList[j]));
    }
	}

	public int countWordsWithXChars(int size)
	{
//make an int counter equal to 0
 int counter =0;                
//traverse arraylist
for(int i=0; i<words.size();i++){
//compare current word’s size with the input
if(words.get(i).getWord().length()==size)
// if they are equal, increment count
counter++;
//end loop
}
//return count 
return counter;

	}
	
	//this method will remove all words with a specified size / length

	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
//make an int count equal to 0
int count=0;
//traverse arraylist from top to bottom 
for(int i=words.size()-1;i>=0;i--){
//check if current index length is equal to parameter
if(words.get(i).getWord().length()==size){
//if it is loop  through it and increment count for each vowel found
count+=words.get(i).getNumVowels();
//then remove the element 
words.remove(i);
//end if statement
}
//end loop
  }
//return count 
return count;
  }

	

	public int countWordsWithXVowels(int numVowels)
	{
//make an int count and subcount both equal to 0
int count=0;
//traverse arraylist
for(int i=0;i<words.size();i++){
//make a loop to loop through the characters of current word element
//check if each character isVowel(method)
//if it is increment subcount
if(words.get(i).getNumVowels()==numVowels)
count++;
//end nested loop
//check if subcount equals input
//if it does increment count 
//end main loop
}
//return count
return count;
	}
	
	//add in a toString
  public String toString(){
    return ""+words;
  }
}