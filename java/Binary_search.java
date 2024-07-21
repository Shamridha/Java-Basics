import java.util.*;
class Binary_search {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size:");
        search obj=new search();
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i]<array[j]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        int result=obj.searching(array,x,0,array.length);
        if (result==-1){
            System.out.print("Element is not in the given array.");
        }
        else{
            System.out.print("Element is found at "+result+" index.");
        }
    }
}
class search{
    public static int searching(int array[],int x,int low,int high){
        
        int mid=(low+high)/2;
        if(array[mid]==x){
            return mid;
        }
        else if(array[mid]>x){
            high=mid-1;
            return searching(array,x,low,high);
        }
        else if(array[mid]<x){
            low=mid+1;
            return searching(array,x,low,high);
        }
        else{
            return -1;
        }
    }
}
