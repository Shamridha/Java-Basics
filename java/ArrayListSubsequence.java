import java.util.*;
public class ArrayListSubsequence {
    public static void main(String args[]){
        ArrayList<String> strList=new ArrayList<>();
        String word="abc";
        String ans="";
        subsequence(strList,word,ans);
        System.out.println(strList.size());
        for(int i=0;i<strList.size();i++){
            System.out.println(strList.get(i));
        }
    }    
    public static void subsequence(ArrayList<String> strList, String word,String ans){
        if(word.length()==0 && ans.length()!=0){
            strList.add(ans);
            return;
        }
        char ch=word.charAt(0);
        subsequence(strList,word.substring(1),ans+ch);
        subsequence(strList,word.substring(1),ans);
        //return ;
    }
}
