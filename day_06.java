import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sr daily challenges
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		Set<Character> as=new HashSet<>();
		Set<Character> bs=new HashSet<>();
		for(char i : a.toCharArray()) as.add(i);
		for(char i: b.toCharArray()) bs.add(i);
		System.out.print((as.equals(bs))?"yes":"no");

	}
}
// spring is a java framework
// we take an opinionated view of spring platform,if you want it can be changed
// we can integrated any framework
// jar java archive file zipped file
// war file contains web related servers it provides database too
// jsp java server pages
// spring features:
// pojo - its a class file its a encapsulated file plain old object,dependency
// object,dependency injection,rest Api
// class file private variables ,getter and setter methods
// mvc --> model view controller model--> data structure view--> defines
// display,controller --> control logic
// spring allows dynamic languages
// group id package name
// artifact if file name
// jar for java project -->version if web use war;
// install steps
// extract contents
// open sts422 release...;

// public class springboot{
// private int a;
// private int b;
// public void setter(){
// a=8;
// b=9;
// }
// public void getter(){
// System.out.println(a+" "+b);
// }

// }
