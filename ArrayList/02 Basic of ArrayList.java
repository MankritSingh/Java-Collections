/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer>arr=new ArrayList();
		arr.add(10);//add new element at end
        arr.add(0,5);//add new element at index 0
        arr.add(20);
        arr.add(20);
        System.out.println(arr);
        //System.out.println(arr[0]);arr[0]=10;//cant access like this
        System.out.println(arr.get(0));
        //We can even add another list,ie append it in the array syntax arr.addAll(list_name)
        arr.set(0,100);
        System.out.println(arr);
       System.out.println(arr.contains(100)); //true if element is present
        Collections.sort(arr);//sort array
        System.out.println(arr);
        //Iterate array 1)normal for loop2)for each/advanced for loop
        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        arr.remove(0);//removes element at index 0;;
        arr.remove(Integer.valueOf(20));//removes first occurance
        System.out.println(arr);
        arr.clear(); //clears full list

        
        
	}
}
