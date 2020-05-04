package day29.tasks.task2;

public class StringUtils {

    public static boolean isBlank(String str){
//        if(str == null || str.trim().isEmpty()){ //str.isEmpty()
//            return true;
//        }else{
//            return false;
//        }

        return str == null || str.trim().isEmpty();

    }
}
