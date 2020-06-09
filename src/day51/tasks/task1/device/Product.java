package day51.tasks.task1.device;

public interface Product {

    double getPrice();


    //2. way downcast in default method in Product
//    default String getModel(){
//        AbstractDevice device = (AbstractDevice) this;
//        return device.getModel();
//    }

    //3. way create abstract method and implement it in derived class
    String getModel();

}
