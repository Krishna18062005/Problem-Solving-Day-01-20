import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String date=sc.next();
		String[] array=date.split("-");
		String[] mon={"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.print(mon[Integer.parseInt(array[1])-1]);

	}
}
