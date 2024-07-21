import java.util.*;
public class ArrayListMazePath {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        ArrayList<String> strList=new ArrayList<>();
        int n=2;
        int row=0;
        int col=0;
        String ans="";
        mazePath(strList,n,row,col,ans);
        System.out.println(strList.size());
        for(int i=0;i<strList.size();i++){
            System.out.println(strList.get(i));
        }
        for(int i=0;i<strList.size();i++){
            String dup=strList.get(i);
            for(int j=0;j<dup.length();j++){
                if(dup.charAt(j).equals("D")){
                    System.out.println("Diagonal:"+dup);
                }
            }
        }
        
    }
    public static void mazePath(ArrayList<String> strList,int n,int row,int col,String ans){
        if(row==n && col==n){
            strList.add(ans);
            return ;
        }
        if(row>n || col>n){
            return ;
        }
        mazePath(strList,n,row,col+1,ans+"H");
        mazePath(strList,n,row+1,col,ans+"V");
        mazePath(strList,n,row+1,col+1,ans+"D");
    }
}
