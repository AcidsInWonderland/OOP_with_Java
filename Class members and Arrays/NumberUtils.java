// Robyn Lesch
// NumberUtils
// 23 July 2020
// Mood: anxious

import java.util.*;

public class NumberUtils{

public static int[] toArray(int number){
	String str = (new Integer(number)).toString();
    char[] chArr = str.toCharArray();
    int[] arr = new int[chArr.length];
    for (int i = 0; i< chArr.length; i++) {
        arr[i] = Character.getNumericValue(chArr[i]);
    }
    return arr;
}
	

public static int countMatch(int numberA, int numberB) {
	int count = 0;
    while (numberA > 0 && numberB >0) {
        // Get the right most digits of each number
        int digitA = numberA % 10;
        int digitB = numberB % 10;

        // compare them
        if (digitA == digitB) {
            ++count;
        }

        // move on to the next digit
        numberA /= 10;
        numberB /= 10;
    }
    return count;
}

public static int countIntersect(int numberA, int numberB){
	int[] A = toArray(numberA);
	int[] B = toArray(numberB);
	int count = 0; 
	if (A[0] == B[1])
	{count ++; } 
	if (A[0] == B[2])
	{count ++; }
	if (A[0] == B[3])
	{count ++; }
	
	if (A[1] == B[0])
	{count ++; } 
	if (A[1] == B[2])
	{count ++; }
	if (A[1] == B[3])
	{count ++; }
	
	if (A[2] == B[0])
	{count ++; } 
	if (A[2] == B[1])
	{count ++; }
	if (A[2] == B[3])
	{count ++; }
	
	if (A[3] == B[0])
	{count ++; } 
	if (A[3] == B[1])
	{count ++; }
	if (A[3] == B[2])
	{count ++; }
	
	return count; 
}
}
