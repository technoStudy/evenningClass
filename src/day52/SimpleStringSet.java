package day52;

import java.util.ArrayList;
import java.util.List;

public class SimpleStringSet implements StringSet {
    //1. way Set
    //2. way List
    List<String> items = new ArrayList<>();

    //3. way
    // Node {
    //   String val;
    //   Node next;
    // }


    @Override
    public void add(String s) {
        if(items.contains(s)) {
            throw new DuplicationException("no duplication allowed in Set");
        }
        items.add(s);
    }

    @Override
    public void remove(String s) {
        items.remove(s);
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void clear() {
        items.clear();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public String toString() {
        return "SimpleStringSet{" + items + '}';
    }
}
