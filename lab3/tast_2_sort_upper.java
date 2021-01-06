// List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1"); 
// Вивести в консоль всі змінні в відсортованому вигляді
// які починаються з «с» та трансформувати їх в верхній регістр

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1"); 
        
        System.out.println(myList);
        for(int i=0;i<myList.size(); i++){
            if (myList.get(i).substring(0,1).equals("c"))
                for(int j=0;j<myList.size(); j++){
                    if(i != j && myList.get(j).substring(0,1).equals("c")){
                        int numI = Integer.parseInt(myList.get(i).substring(1, myList.get(i).length()));
                        int numJ = Integer.parseInt(myList.get(j).substring(1, myList.get(i).length()));
                        if(numI < numJ)
                            Collections.swap(myList, i, j);
                    }
                }
        }
        
        System.out.println(myList);
            
        
        
	}
}
// output
//  
// [a1, a2, b1, c2, c1]                                                                                   
// [a1, a2, b1, c1, c2]  