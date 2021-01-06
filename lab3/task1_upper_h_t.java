// Данний рядок «sjdhgfsjkavchjwagehf» (Просто набір букв в нижньому регістрі), 
// потрібно підняти в верхній регістр всі букви в діапазоні від H до T по алфавіту 

public class Main
{
    public static String work = "sjdhgfsjkavchjwagehf";
    
    public static String upper_with_h_t(String text){
        // 104 і 116 це симлволи h i t по таблиці asci
	    String result = "";
	    for(char w : text.toCharArray())
	    {
	        int a = w;
	        if (116 >= w  && w >= 104)
	            w = (char)(a-32);
	        result = result + w;
	    }
	    return result;
    }
    
	public static void main(String[] args) {
	    System.out.println(work);
	    System.out.println(upper_with_h_t(work));
	}
}
