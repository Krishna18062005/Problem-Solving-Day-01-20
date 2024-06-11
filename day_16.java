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
