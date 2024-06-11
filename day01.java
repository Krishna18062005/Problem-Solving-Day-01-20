class day1 {
    public static void main(String args[]) {
        int a[] = { 10, 20, 30, 29, 39, 39 };
        int i;
        int k = 3;// key to search element present or not
        for (i = 0; i < a.length; i++) {// loop to check the key
            if (a[i] == k) {
                break;// break if element present
            }
        }
        if (i == a.length) {// if the loop fully travelled
            // means the elements is not inarry

            System.out.println("Element not found");

        } else {
            System.out.println("Element found at index: " + i);
        }

    }

}
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
