/******************************************************************************

Створити метод (private int[] fillArray(int begin, int end, int step)). 
Який заповнює масив від begin до end, з кроком в step.
   Приклад : fillArray(0, 10, 2) -> [0, 2, 4, 6, 8, 10] end – begin
--------------
у наший метод fillArray додав модифікатор static так як без нього не можна визвати
метод у методі Main 
зміна len є розміром масививу у формулу 2 додаєм так як у нас є умова що крайні точки теж 
повині бути вклюяні.

*******************************************************************************/
import java.util.Random;

public class Main
{   

    private static int[] fillArray(int begin, int end, int step){
        int len = (2 + end - begin) / step;
        System.out.println("len in array");
        System.out.println(len);
        
        int[] arr = new int[len];
        
        int val = begin;
        
        for(int i=0;i < len; i++ )
        {
            arr[i] = val;
            val += step;
        }
        
        return arr;
    }
    
	public static void main(String[] args) {
	    int[] arr = fillArray(0,10,2);
	    
	    System.out.println("show result");
        for(int a : arr)
            System.out.println(a);
	}
}
