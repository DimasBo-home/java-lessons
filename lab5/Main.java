/******************************************************************************
З консолі вводиться довільний рядок який містить математичні операції («1+5+8-7*5/4») 
потрібно вивести на екран результат обчислення даного рядка (Пріоритет виконання операцій не враховувати)

Написати метод який заповнить масив довільного розміру числами по зростанню, 
починаючи з центру масиву ([3,2,1,0,1,2,3])

Написати метод який буде читати з консолі довільний рядок в форматі («+Andrew» або «-John»), 
в залежності від оператора (+ або -) додає в рядок (саме в рядок, НЕ В КОЛЕКЦІЮ) 
або ж віднімає від нього дане слово(якщо такого слова немає, тоді вивести відповідне 
повідомлення в консоль). Зробити все в циклі while в якому має бути switch який буде 
пропонувати варіанти того що можна зробити: 1 – ввести нове значення, 2 – вивести на 
екран всі введені слова через кому, 3 – вихід з програми.  

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    // Написати метод який заповнить масив довільного розміру числами по зростанню, 
    // починаючи з центру масиву ([3,2,1,0,1,2,3])
    public static int[] randomNumber(int[] a){
        int center = a.length / 2;
        
        int number = 0;
        int i = center;
        while(i >= 0){
            a[i] = number;
            number++;
            i--;
        }
        
        number = 0;
        i = center;
        while(i < a.length){
            a[i] = number;
            number++;
            i++;
        }
        return a;
        
    }
    
//  Написати метод який буде читати з консолі довільний рядок в форматі («+Andrew» або «-John»), 
// в залежності від оператора (+ або -) додає в рядок (саме в рядок, НЕ В КОЛЕКЦІЮ) 
// або ж віднімає від нього дане слово(якщо такого слова немає, тоді вивести відповідне 
// повідомлення в консоль). Зробити все в циклі while в якому має бути switch який буде 
// пропонувати варіанти того що можна зробити: 1 – ввести нове значення, 2 – вивести на 
// екран всі введені слова через кому, 3 – вихід з програми. 
    
    public static void StartLineNames(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ведіть імена через кому.(exit key '3')");
        String s = in.nextLine();
        
        int key = 0;
        
        while(key != 3){
            System.out.println("варіанти:: 1 – ввести нове значення, 2 – вивести на екран, 3 – вихід з програми.");
            key =  Integer.parseInt(in.nextLine());
            switch (key){
                case 2:
                    System.out.print("print: ");
                    System.out.println(s);
                    break;
                case 1:
                    String s_new = in.nextLine();
                    if (s_new.substring(0,1).equals("+")){
                        System.out.println(s);
                        s = s + "," + s_new.substring(1, s_new.length());
                        System.out.println(s);
                    }
                        
                    else if (s_new.substring(0,1).equals("-"))
                        if (!s.contains(s_new.substring(1, s_new.length() ))){
                            System.out.println("Invalide value");                            
                            break;
                        }
                        s = s.replace(s_new.substring(1, s_new.length() ), "");
                        // clear ,
                        s = s.replace(",,","");
                        s = s.replace("  "," ");
                        if (s.substring(s.length()-1, s.length() ).equals(",") )
                            s = s.substring(0, s.length()-1 );
                        if (s.substring(0,1).equals(",") )
                            s = s.substring(1, s.length());
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }
    }
    
    
    public static void main(String[] args) {
        System.out.println("Task1 randomNumber");
        int[] arr = randomNumber(new int[11]);
        for(int item : arr){
            System.out.print(" ");
            System.out.print(item);
        }
        System.out.println();
        System.out.println("Task2 StartLineNames");
        
        StartLineNames();
            
    }
}
