package Dictionary;

import java.util.ArrayList;

public class Dictionary {
    public ArrayList<Word> arr =new ArrayList<>();
    public String toString(int vitri,int dem){
        Word s=arr.get(vitri);
        return "    |"+dem+"    |"+s.getWord_target()+"          |"+s.getWord_explain();
    }



}
