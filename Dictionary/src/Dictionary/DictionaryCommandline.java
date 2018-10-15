package Dictionary;


import java.util.ArrayList;

public class DictionaryCommandline {

    public void showAllWords(Dictionary k){
        ArrayList<Word>arr=new ArrayList<>();
         arr= k.getDictionary();
            for (int i = 1; i < arr.size(); i++) {
                System.out.println(i + "     |" + arr.get(i).getWord_target() + "    |"+ arr.get(i).getWord_explain());
            }
        }



    public void dictionaryBasic(){

    }
    public void dictionaryAdvanced(){

    }
    public void dictionarySearcher(){

    }
}
