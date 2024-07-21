import java.util.*;
class avg{
    int sum=0;
    avg(int[] array,int n){
        for(int i=0;i<n;i++){
            this.sum+=array[i];
        }
        System.out.print("Average:"+sum/n);
    }
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter name:");
            String name=sc.nextLine();
            System.out.println("Enter mark:");
            int mark=sc.nextInt();
            sc.nextLine();
        }
        avg obj=new avg(arr,n);
        
    }
}