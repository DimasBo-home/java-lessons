/******************************************************************************
Створити двовимірний масив, заповнити його випадковими значеннями від 0 до 9 (Random). 
Вивести його на екран окремим методом (private void printArray(int[][] arr)). 
Вивести на екран всі парні числа побічної діагоналі.
--------------------------
 у наший метод printArray додав модифікатор static так як без нього не можна визвати
метод у методі Main 
зміна len є розміром двохвимірного квадратного масмву.

*******************************************************************************/
import java.util.Random;

public class Main
{   
	static int len = 10;
	static int[][] arr;

    private static void printArray(int[][] arr){
        for(int[] a : arr){
            for(int b : a)
                System.out.print(Integer.toString(b) + " ");
		    System.out.println();
        }
    }

	public static void main(String[] args) {
		arr = new int[len][len];
		Random random = new Random();
		
		for(int i=0;i<len; i++)
            for(int j=0;j<len; j++)
                arr[i][j] = random.nextInt(10);
        
        printArray(arr);
		
		
	}
}
