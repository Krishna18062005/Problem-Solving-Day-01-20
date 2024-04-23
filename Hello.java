import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Day 1 
		Scanner sc=new Scanner(System.in);
		String b=sc.next();
		String c=sc.next();
		for(int i=0;i<c.length();i++){
		    b=b.replace(c.substring(i,i+1),"*");}
		
		for(int i=0;i<b.length();i++){
		    for(int j=i;j<b.length()+i;j++){
		        
		        System.out.print((j<b.length())?b.charAt(j):b.charAt(j-b.length()));
		    }
		    System.out.println();
		}

	}
}
