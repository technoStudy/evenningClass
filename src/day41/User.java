package day41;

//To achieve encapsulation in Java
public class User {

    //Declare the variables of a class as private.
    private String username;
    private String password;

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    //Provide public setter and getter methods to modify and view the variables values.

    //Setter methods to modify
    //to make write-only(can modify, but cant retrieve) remove all getter methods
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password){
        //password must have at least length of 6
        if(password.length() < 6){
            throw new IllegalArgumentException("Password is too short, please provide longer password");
        }
        if(password.length() > 10){
            throw new IllegalArgumentException("Password is too long, please provide shorted password");
        }
        this.password = password;
    }


    //Getter methods to view/retrieve
    //to make read-only(can retrieve, but cant modify) remove all setter methods
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
