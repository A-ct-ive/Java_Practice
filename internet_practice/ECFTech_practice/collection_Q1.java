package internet_practice.ECFTech_practice;

import java.util.ArrayList;

//必要なimportを行ないます。

public class collection_Q1{
    public static void main(String[] args) {
        //ArrayListインスタンスを生成します。
        ArrayList<String> list = new ArrayList<>();
        //4つの要素を追加。addメソッドを使用します。
        list.add("りんご");
        list.add("みかん");
        list.add("バナナ");
        list.add("ぶどう");
        //拡張for文で各要素を表示します。
        for(String data : list){
            System.out.println(data);
        }
    }
}