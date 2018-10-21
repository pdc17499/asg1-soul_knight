package Dictionary;

import java.util.ArrayList;

public class DictionaryCommandline {
    ArrayList<Word> arrays=new ArrayList<>();

    public void showAllWords(Dictionary vd) {

        arrays = vd.getDictionarys();
        System.out.println("stt  " +"|English  "+"|Tiếng việt");
        for (int i = 0; i < arrays.size(); i++) {
            System.out.println((i+1) + "     |" + arrays.get(i).getWord_target() + "    |"+ arrays.get(i).getWord_explain());
        }
    }
    public void dictionaryBasic() {
        DictionaryManagement a =new DictionaryManagement();
        Dictionary b = new Dictionary();
        DictionaryCommandline c = new DictionaryCommandline();
        b.setDictionarys(a.insertFromcomandline());
        c.showAllWords(b);
    }
    public void dictionaryAdvanced()
    {
        DictionaryManagement a =new DictionaryManagement();
        Dictionary b = new Dictionary();
        DictionaryCommandline c = new DictionaryCommandline();
        a.insertFromFile();
        c.showAllWords(b);
       // a.dictionaryLookup();

    }
}