package day52;

import java.util.Collections;

public class SortedStringSet extends SimpleStringSet {


    @Override
    public void add(String s) {
        super.add(s);

        Collections.sort(this.items);
    }

    @Override
    public String toString() {
        return "SortedStringSet{" + items + '}';
    }
}
