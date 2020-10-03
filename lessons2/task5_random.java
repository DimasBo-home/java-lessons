/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Random;

public class Main
{
    public static int[] random_array(final int n){
        Random random = new Random();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = random.nextInt(10);
        return arr;    
    }
    
	public static void main(String[] args) {
        // for (int i = 0)
        int[] arr = random_array(10);
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
	}
}
