package Dictionary;

import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dic= new Dictionary();
    public void insertFromCommandline(){
        Scanner sc = new Scanner(System.in);
        Word word =new Word();
        System.out.println("Tiếng Anh");
        word.setWord_target(sc.nextLine());
        System.out.println("Tiếng Việt");
        word.setWord_explain(sc.nextLine());


    }


    public void insertFromFile(){

    }
    public void dictionaryLookup(){

    }


}
