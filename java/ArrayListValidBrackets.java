import java.util.*;
public class ArrayListValidBrackets {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            ArrayList<String> strlist=new ArrayList<>();
            String ans="";
            int open=0;
            int close=0;
            validBrackets(strlist,n,open,close,ans);
            System.out.println(strlist.size());
            for(String x:strlist){
                System.out.println(x);
            }
        }
        public static void validBrackets(ArrayList<String> strList, int n, int open, int close, String ans){
            if(open == n && close==n){
                strList.add(ans);
                return;
            }
            if(open> n|| close>n){
                return;
            }
            validBrackets(strList,n,open+1,close,ans+"(");
            if(close<open){
                validBrackets(strList,n,open,close+1,ans+")");
            }
        }
}
