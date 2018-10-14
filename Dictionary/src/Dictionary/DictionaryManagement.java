package Dictionary;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dic= new Dictionary();
    public void insertFromCommandline(){
        Scanner sc = new Scanner(System.in);
        int s1;
        System.out.println("Nhập số từ muốn thêm :");
        s1=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<s1;i++){
            Word word =new Word();
            System.out.println("Tiếng Anh");
            word.setWord_target(sc.nextLine());
            System.out.println("Tiếng Việt");
            word.setWord_explain(sc.nextLine());
            dic.arr.add(word);

        }


    }


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
             dic.arr.add(word);
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
        for (int i=0;i<dic.arr.size();i++){
            if(dic.arr.get(i).getWord_target().contains(a)){
                dem ++;
                System.out.println(dic.arr.get(i).getWord_target() + " "+ dic.arr.get(i).getWord_explain());
            }
            else if (dem==0){
                System.out.println("Từ bạn nhập ko được tìm thấy");
            }
        }
    }
    public void removeWord(){
        System.out.println("Mời nhập từ cần xóa");
        String b=new String();
        Scanner sc =new Scanner(System.in);
        b=sc.nextLine();
        int dem=0;
        for (int i=0;i<dic.arr.size();i++){
            if (dic.arr.get(i).getWord_target().contains(b)){
                dem++;
                dic.arr.remove(dic.arr.get(i));

            }
            else if(dem==0) System.out.println("Từ bạn nhập ko có trong từ điển");
        }
    }
    public void dictionaryExportToFile(){

    }


}
