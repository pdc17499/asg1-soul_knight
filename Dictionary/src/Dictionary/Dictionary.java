package Dictionary;

import java.util.ArrayList;


public class Dictionary {
    public int a;
    ArrayList<Word> Array= new ArrayList<>();

    public void setDictionarys(ArrayList<Word> array) {
        Array = array;
    }

    public ArrayList<Word> getDictionarys() {
        return Array;
    }

    public void push(Word word) {
        this.Array.add(word);
    }
}
