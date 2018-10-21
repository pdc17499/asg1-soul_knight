package Dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dic =new Dictionary();
    public void insertFromFile(){
        String s;
        File file = new File("dictionaries.txt");
        try {
            FileReader fr =new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((s=br.readLine()) != null){
                Word word= new Word();
                String [] x=s.split("\t");
                word.setWord_target(x[0].trim());
                word.setWord_explain(x[1]);
                dic.Array.add(word);
            }

        }catch (Exception e){
            System.out.println("ERROR");
        }

    }
    public void dictionaryLookup(){
        System.out.println("Nhập từ muốn tìm kiếm :");
        String a= new String();
        Scanner sc =new Scanner(System.in);
        a=sc.nextLine();
        int dem =0;
        for (int i=0;i<dic.Array.size();i++){
            if(dic.Array.get(i).getWord_target().contains(a)){
                dem ++;
                System.out.println(dic.Array.get(i).getWord_target() + " "+ dic.Array.get(i).getWord_explain());
            }
            else if (dem==0){
                System.out.println("Từ bạn nhập ko được tìm thấy");
            }
        }
    }


    public ArrayList<Word> insertFromcomandline() {
        DictionaryManagement b = new DictionaryManagement();
        ArrayList<Word> a = new ArrayList<>();
        Dictionary s = new Dictionary();
        int k;
        k = b.nhapso();
        for (int i = 0; i < k; i++) {
            a.add(i, b.AddWord());
        }
        return a;
    }
    public Word AddWord() {
        Word array = new Word();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập từ tiếng Anh : ");
        String a;
        a = sc.nextLine();
        array.setWord_target(a);
        System.out.println("Nghĩa tiếng Việt : ");
        String b;
        b = sc.nextLine();
        array.setWord_explain(b);
        return array;
    }
    public int nhapso() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng từ vựng");
        n = sc.nextInt();
        return n;
    }
    public void doc(){

    }

}