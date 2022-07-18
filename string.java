/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String word="  Hello how are  ";
	    word=word.trim();
	    System.out.println(word);//delete leading and trailing space
	    System.out.println(word.substring(2));//will create substring starting from index 2 to end similar to slicing 
        System.out.println(word.substring(0,5));//the end is excluded
        System.out.println(word.replace('e','z'));//all occurance are replaced
        System.out.println(word.replace("ll","teh"));//even strings work
        System.out.println(word.startsWith("h"));//returns true or false
        System.out.println(word.endsWith("e"));
        System.out.println(word.indexOf("Hell"));//returns first occurance.Returns with first chars index
        System.out.println(word.indexOf("l",2));//-1 if not found.Second arg means start looking from here inclusive
        System.out.println(word.lastIndexOf("l",6));//works from end.index works normally(looks between 0,index)
        //We should use .equals instead of == as == compares if they point to same memory whereas equals compare valueOf
        System.out.println(word.equals("Hello how are"));
        System.out.println(word.equalsIgnoreCase("hello how are"));
// 		String word="apple";
// 		System.out.println(word.charAt(0));
// 		System.out.println(word.toUpperCase());
// 		System.out.println(word.toLowerCase());
// 		String copy=word.toUpperCase();
// 		System.out.println(copy);
// 		char arr[]=word.toCharArray();
// 	//	System.out.println(toString(arr));
// 	//	arr[0]='P';
// 		//System.out.println(arr[0]);
// 		//String str=arr.toString();
// 		String s=new String();
// 		String str=s.valueOf(arr);
// 		System.out.println(str);
//         System.out.println(word=="apple");
//         System.out.printf("The highest score is %d of %s",100,"Mankrit");
//         System.out.println(str.length());
//         String newcop=str+" "+copy;
//         System.out.println(newcop);

	}
}
