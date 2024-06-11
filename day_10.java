import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sum of digits in a string and prints the character first
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int s=0;
		for(char i :a.toCharArray()){
		    int k=(int)i;
		    if(k<=57&&k>=48){
		        s+=k-48;
		        continue;
		    }
		    System.out.print(i);
		}
		System.out.print(s);

	}
}
