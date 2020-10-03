/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
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
