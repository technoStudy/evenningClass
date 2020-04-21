package day22;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
        ArrayList<String> languages = languageList();

//        printReverse(languages);

//        printThree(languages);

        ArrayList<String> specifiedLanguages = specifiedLanguages(languages);

        ArrayList<String> withoutEnglish = withoutEnglish(languages);
    }

    // create a method that will return list of languages
    public static ArrayList<String> languageList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Russian");
        list.add("Turkmen");
        list.add("Tajik");
        list.add("Turkish");
        list.add("Kazakh");
        list.add("English");
        list.add("Uzbek");
        list.add("French");
        list.add("Spanish");
        list.add("German");

        list.add("English");
        list.add("Turkish");
        list.add("Vietnamese");
        list.add("Indonesian");
        list.add("Javanese");
        list.add("Spanish");

        return list;
    }

    // create a method that will print list of Strings in reverse order
    public static void printReverse(ArrayList<String> list) {
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    // create a method that will print only first three elements in list
    public static void printThree(ArrayList<String> list) {
//        1 way
        for(int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }

//        // 2 way
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(3));
    }

    // create method that returns languages which starts with "T" or ends with "sh"
    public static ArrayList<String> specifiedLanguages(ArrayList<String> languages) {
        ArrayList<String> result = new ArrayList<>();

        for(String language : languages) {
            if(language.startsWith("T") || language.endsWith("sh")) {
                result.add(language);
            }
        }

        return result;
    }

    //  create method that will return new list without "English"
    public static ArrayList<String> withoutEnglish(ArrayList<String> languages) {
        ArrayList<String> result = new ArrayList<>();

        for(String language : languages) {
            if(!language.equals("English")) {
                result.add(language);
            }
        }

        return result;
    }

    // create method that will remove all occurrence of language which ends with "sh"

}
