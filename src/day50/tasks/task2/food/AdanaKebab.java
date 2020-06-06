package day50.tasks.task2.food;

public class AdanaKebab implements Food {

    @Override
    public String taste() {
        return "spicy as kebab";
    }


    public String marinade(){
        return "oil, salt";
    }

    public String grill(){
        return "grill meat";
    }

}
