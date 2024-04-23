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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//day 1 prb 2
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c1=0;
		String c=BinaryString(a);
		String d=BinaryString(b);
        int n=Math.min(c.length(),d.length());
        if(d.length()>8||c.length()>8){
            System.out.print(-1);
        }else{
		for(int i=0;i<n;i++){
		    c1++;
		    if(c.charAt(i)!=d.charAt(i))   break;
		}//System.out.println(c+" "+d);
		System.out.print((c1==1)?c1-1:c1);}
	}
	public static String BinaryString(int a){
	    String k="";
	    while(a>0){
	        k+=(char)((a%2)+48);
	        a/=2;
	    }
	    return k;
	}
}
