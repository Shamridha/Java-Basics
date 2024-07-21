import java.util.*;
public class arrayindex_recurssion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int i=0;
        int target=sc.nextInt();
        index(array,target,i);
    }   
    public static int index(int[] array,int x,int i){
        if(i==array.length){
            
            return 0;
        }
        if(array[i]==x){
            System.out.print(i+" ");
            return index(array,x,i+=1);
        }
        return index(array,x,i+=1);
    } 
}
