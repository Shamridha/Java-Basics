import java.util.*;
public class BinarySearchTreeConstruction {
    public static void main(String args[]){
        create obj=new create();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nodes=new int[n];
        for(int i=0;i<n;i++){
            nodes[i]=sc.nextInt();
        }
        Arrays.sort(nodes);
        Node root = obj.tree(nodes,0,nodes.length-1);
        obj.inorder(root);
    }
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class create{
        public static Node tree(int[] nodes,int left,int right){
            if(left>right){
                return null;
            }
            int middle=(left+right)/2;
            Node nn=new Node(nodes[middle]);
            nn.left=tree(nodes,left,middle-1);
            nn.right=tree(nodes,middle+1,right);
            return nn;

        }
        public static void inorder(Node root){
            if(root==null){
                return ;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

}
