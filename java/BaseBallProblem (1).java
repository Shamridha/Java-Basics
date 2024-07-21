import java.util.*;
public class BaseBallProblem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        String str=sc.nextLine();
        String[] strarray=str.split(" ");
        for(int i=0;i<strarray.length;i++){
            switch(strarray[i]){
                case"C":
                stack.pop();
                break;
                case"D":
                stack.push(stack.peek()*2);
                break;
                case"+":
                int peek1=stack.pop();
                int peek2=stack.pop();
                int sum=peek1+peek2;
                stack.push(peek2);
                stack.push(peek1);
                stack.push(sum);
                break;
                default:
                stack.push(Integer.parseInt(strarray[i]));
            }
        }
        int ans=0;
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        System.out.print(ans);
    }    
}
