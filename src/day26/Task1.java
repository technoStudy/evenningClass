package day26;

import java.util.HashMap;

public class Task1 {

    // create method that returns map,
    // which has string as key, and string length as value
    //{
    // One=3,
    // Two=3,
    // Three=5,
    // Four=4,
    // A hundred=9
    // }
    public static HashMap<String, Integer> getWordLengthMap(String... words){
        HashMap<String, Integer> result = new HashMap<>();
        //start your code here
        for (String word : words) {
            result.put(word, word.length());
        }
        return result;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> wordLengthMap = getWordLengthMap("Hi", "Hello", "Mac", "Windows");


        HashMap<String, Integer> wordLengthMap1 = getWordLengthMap("Dos", "Tugba", "Yusuf");
    }

}










