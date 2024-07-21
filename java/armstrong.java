import java.util.*;
public class armstrong
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int x=n;
		int y=n;
		int re=0;
		int result=0;
		int rem=0;
		while(n>0){
		    rem=n%10;
		    count=count+1;
		    n=n/10;
		}
		while(x>0){
		    re=x%10;
		    result+=Math.pow(re,count);
		    x=x/10;
		}
		if (result==y){
		    System.out.println("Armstrong");
		}
		else{
		    System.out.println("Not Armstrong");
		}
	}
}
