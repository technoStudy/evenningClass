package day50.tasks.task2.food;

public class Palov implements Food{


    @Override
    public String taste() {
        return "taste incredible with garlic";
    }

    public String fry(){
        return "fry meat, onion, carrots";
    }

    public String boil(){
        return "boil 40min after adding rice";
    }
}
