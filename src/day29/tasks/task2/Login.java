package day29.tasks.task2;

public class Login {
    String username;
    String password;


    public static Login create(String u, String p){
        Login login = new Login();
        login.username = u;
        login.password = p;

        return login;
    }


    /*
    ***Part 3***
    create instance method in Login to check
    if username and password are not empty or not null
     */
    public void checkAndPrint(){
        if(StringUtils.isBlank(username)){
            System.out.println("Not valid username");
        }
        if(StringUtils.isBlank(password)){
            System.out.println("Not valid password");
        }
    }
}
