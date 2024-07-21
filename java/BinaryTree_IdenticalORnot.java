import java.util.*;
public class BinaryTree_IdenticalORnot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        BinaryTree obj=new BinaryTree();
        System.out.print("Enter size and Nodes of the first tree: ");
        int n=sc.nextInt();
        int[] treeone=new int[n];
        for(int i=0;i<n;i++){
            treeone[i]=sc.nextInt();
        }
        System.out.print("Enter size and Nodes of the two tree: ");
        int m=sc.nextInt();
        int[] treetwo=new int[n];
        for(int i=0;i<m;i++){
            treetwo[i]=sc.nextInt();
        }
    }
}
