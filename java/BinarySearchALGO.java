import java.util.*;
public class BinarySearchALGO {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        //Arrays.sort(array);
        int left=0;
        int right=array.length-1;
        int middle=0;
        while(array[middle]!=k){
            middle=(left+right)/2;
            if(array[middle]==k){
                break;
            }
            if(array[middle]<k){
                left=middle+1;
                right=right;
            }
            if(array[middle]>k){
                left=0;
                right=middle-1;
            }
        }
        System.out.print(middle);
    }
}
