// Заповнити масив розміром n рандомними значеннями в діапазоні (від 0 до 9)
// та порахувати середнє арифметичне всіх парних чисел

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
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        // середнє арифметичне
        int count = 0;
        int result = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0 ){
                count++;
                result += arr[i];    
            }
        }
        System.out.println("середнє арифметичне");
        System.out.println(result);
        System.out.println(result / count);
    }
}
