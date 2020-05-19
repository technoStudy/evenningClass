package day40.questions;


class User{
    public int id;

    public User(int id) {
        this.id = id;
    }

    public boolean equals(User user){
        return this.id == user.id;
    }
}

public class Q23 {

    public static void main(String[] args) {
        //check two users are equal or not?

        User user1 = new User(1111);
        User user2 = new User(5555);
        System.out.println(user1);
        System.out.println(user2);

        if(user1.id == user2.id){
            System.out.println("user1.id == user2.id => Users are equal");
        }

        if(user1 == user2){
            System.out.println("user1 == user2 => Users are equal");
        }

        if(user1.equals(user2)){
            System.out.println("user1.equals(user2) => Users are equal");
        }
    }

}
