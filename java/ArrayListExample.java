import java.util.*;
public class ArrayListExample {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> strlist=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);//[1,2,3]
        System.out.println(list.get(0));//1
        System.out.println(list.contains(3));//true
        System.out.println(list.contains(4));//false
        list.set(2,4);
        System.out.println(list.get(2));//4
        System.out.println(list.size());//3
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");//1 2 4
        }

        strlist.add("Shanthosh");
        System.out.println(strlist);
    }   
}
