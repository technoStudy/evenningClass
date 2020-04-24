package day22;

import java.util.ArrayList;

public class Task2 {

    // create a method that will return list of languages
    public static ArrayList<String> getLanguages() {
        ArrayList<String> list = new ArrayList<>();
        list.add("English");
        list.add("Turkish");
        list.add("Macedonian");
        list.add("Uzbek");

        return list;
    }

    // create a method that will print list of languages in reverse order
    public static void printReverse(ArrayList<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    // create method that returns languages which starts with "T" or ends with "sh"
    public static ArrayList<String> getSpecificLanguages(ArrayList<String> languages){
        ArrayList<String> result = new ArrayList<>();

        // check if language starts with "T" or ends with "sh"
        // only then add to result list
        for (String language : languages) {
            if(language.startsWith("T") || language.endsWith("sh")){
                result.add(language);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> languages = getLanguages();

//        printReverse(languages);
        ArrayList<String> specificLanguages = getSpecificLanguages(languages);
    }

}


// create a method that will print only first three elements in list
// create method that returns languages which starts with "T" or ends with "sh"
// create method that will return new list without "English"
// create method that will remove all occurrence of language which ends with "sh"
