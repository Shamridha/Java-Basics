import java.util.*;
public class Assesment_array1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strarr=str.split(" ");
        int[] array=new int[strarr.length];
        for(int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(strarr[i]);
        }
        
        int[] ans=new int[array.length];
        
        for(int i=0;i<array.length;i++){
            int temp=1;
            for(int j=0;j<array.length;j++){
                if(i!=j){
                    temp=temp*array[j];
                    ans[i]=temp;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
