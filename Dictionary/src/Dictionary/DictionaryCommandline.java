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


    public void dictionaryBasic(){

    }
    public void dictionaryAdvanced(){

    }
    public void dictionarySearcher(){

    }
}
