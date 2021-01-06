// **Є клас User (name, age, height, group, password, email) створити UserDto 
// класс (name, age, email). Створити класс UserMapper з методами 
// mapToUser(UserDto userDto), та mapToDto(User user);
// Створити колекцію яка буде зберігати 5-10 юзерів і з допомогою stream      api 
// вибрати всіх хто досяг повноліття та повернути на виході List<UserDto> 


public class Main
{
	public static void main(String[] args) {
        HashMap<String, Integer, String> myHashMap = new HashMap<String, Integer, String>();
        
        User u = new User("dimas",23, 170,"test", "testpass", "test@tes.com");
        System.out.println(u);
        
        
        UserDto ud = new UserDto("dto",23, "testdto@dto.com");
        System.out.println(ud);
	}
}

class UserMapper{
    public mapToUser(UserDto userDto){
        
    }
}

class UserDto{
    public String name, email;
    public int age = 0, height = 0;
    
    public UserDto(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public String toString(){
        return "UserDto " + email +" "+ name;
    }
}

class User{
    public String name;
    public int age, height;
    public String group, password, email;
    
    public User(String name, int age, int height, String group, String password, String email){
        this.name = name;
        this.age = age;
        this.height = height;
        this.group = group;
        this.password = password;
        this.email = email;
    }
    public String toString(){
        return  "User " + email +" "+ name;
    }
}