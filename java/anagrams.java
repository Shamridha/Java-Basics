import java.util.*;
class anagrams {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        for(int i=0;i<ch1.length;i++){
            for(int j=i+1;j<ch1.length;j++){
                if(ch1[i]>ch1[j]){
                    char temp = ch1[i];
                    ch1[i]=ch1[j];
                    ch1[j]=temp;
                }
            }
        }

        for(int i=0;i<ch2.length;i++){
            for(int j=i+1;j<ch2.length;j++){
                if(ch2[i]>ch2[j]){
                    char temp = ch2[i];
                    ch2[i]=ch2[j];
                    ch2[j]=temp;
                }
            }
        }int count=0;
        for(int i=0;i<ch1.length;i++){
            for(int j=0;j<ch2.length;j++){
                if(ch1[i]==ch2[j]){
                    count=1;
                    i++;
                }
                else{
                    count=0;
                    break;
                }
            }
            
        }
        if(count==1){
            System.out.print("It is anagram.");
        }
        else{
            System.out.print("It is not anagram.");
        }
    }
    
}
