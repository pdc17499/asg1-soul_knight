package Dictionary;

import java.io.*;
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
        dic.arr.add(word);

    }


    public void insertFromFile(){
        String s;
        File file = new File("dictioneries.txt");
        try {
            FileReader fr =new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((s=br.readLine()) != null){
             Word word= new Word();
             String [] x=s.split("\t");
             word.setWord_target(x[0].trim());
             word.setWord_explain(x[1]);
             dic.arr.add(word);
            }

        }catch (Exception e){
            System.out.println("ERROR");
        }

    }
    public void dictionaryLookup(){


    }
    public void dictionaryExportToFile(){

    }


}
