package day41.encapsulation;

//To achieve encapsulation in Java
public class User {

    //Declare the variables of a class as private.
    private long id;
    private String username;
    private String password;
    private boolean active;
    private boolean certificate;
    private Boolean registered;

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

        //throw exception if user is admin
        //user is admin when id = 1
        if(this.id == 1){
            throw new RuntimeException("admins password cannot be shown");
        }
        return this.password;
    }


    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setCertificate(boolean certificate){
        this.certificate = certificate;
    }

    public boolean hasCertificate(){
        return this.certificate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isCertificate() {
        return certificate;
    }

    public Boolean getRegistered() {
        //wrapper Boolean can have
        // true, false, null
        return registered;
    }

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }
}
