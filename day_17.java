import java.util.*;
public class Hello {
    public static boolean digitsInX(int[] digits,int X){
        Arrays.sort(digits);
        while(X>0){
            if(Arrays.binarySearch(digits,X%10)<0)
                return false;
            X/=10;
        }
        return true;
    }
    public static boolean palin(int X){
        int Y=0;//variable for reverse
        int L=X;//new Variable for storing X value
        while(L>0){
            Y=(Y*10)+(L%10);
            L/=10;
        }
        return Y==X;
    }
    public static void main(String[] args) {
		//Smallest Palindromic Integer Greater Than X
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] digits=new int[N];
		for(int i=0;i<N;i++) digits[i]=sc.nextInt();
		int X=sc.nextInt();
		boolean sol=false;
		while(!sol){
        X++;
		    if(digitsInX(digits,X)&&palin(X)){
		        System.out.print(X);
		        sol=true;
		    }
		}
	}
}
import java.util.*;
public class Hello {
    public static int oneCount(int a){
        int c=0;//counter
        while(a>0){
            if(a%2==1){
                c++;
            }a/=2;
        }
        return c;
    }

    public static void main(String[] args) {
		//set bit's count 
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=oneCount(a);
		int NewCount=0;
		while(count!=NewCount){
		    a++;
		    if(oneCount(a)==count){
		        NewCount=count;
		    }
		}
		System.out.print(a);

	}
}
