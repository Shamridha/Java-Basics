import java.util.*;
public class BinarySearchUsingRecurssion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        
        System.out.println(recurssion(array,0,array.length-1,k));
    }
    public static int recurssion(int[] array,int left,int right,int target){
        if(left>right){
            return -1;
        }
        int middle=(left+right)/2;
        if(array[middle]==target){
            return middle;
        }
        if(array[middle]<target){
            left=middle+1;
        }
        if(array[middle]>target){
            right=middle-1;
        }
        middle=recurssion(array,left,right,target);
        return middle;
    }
}
