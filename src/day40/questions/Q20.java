package day40.questions;


class MyString {
    String s;


    public String plusStr(String str) {
        return new String(this.s + str);
    }

}

public class Q20 {


    public void stringsConcat() {
        String x = "";
        x = x + ""; // creates new Object
        x = x + "abc";  // creates new Object

        x = x + "a" + "b" + "c";// creates 3 new Object, in old version

        x = x + "a" + "b" + "c";// creates 1 new Object, in new version


    }


    public static void main(String[] args) {
        String text = "Hi";
        text += " there";


        MyString myText = new MyString();
        myText.s = "Hi";
        myText.plusStr(" there");


        StringBuilder sb = new StringBuilder();
        sb.append("Hi");
        sb.append(" ");
        sb.append("there");
        sb.append("!");

    }

}
