import java.util.*;
public class Hello {
    public static boolean Palin(String bs){
        
        int j=bs.length()-1;
        int i=0;
        while(i<j){
            if(bs.charAt(i)!=bs.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }

    public static void main(String[] args) {
		//Palindrome decimal &binary;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print((Palin(Integer.toString(a))&&Palin(Integer.toBinaryString(a)))?"yes":"no");

	}
}
