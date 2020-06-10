package day52;

public class App {

    public static void main(String[] args) {
        StringSet set = new SimpleStringSet();
        set.add("C");
        set.add("B");
        set.add("A");
        System.out.println(set);

        StringSet sortedSet = new SortedStringSet();
        sortedSet.add("C");
        sortedSet.add("B");
        sortedSet.add("A");
        System.out.println(sortedSet);
    }
}
