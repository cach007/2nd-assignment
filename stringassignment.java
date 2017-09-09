
import java.util.Scanner;
public class stringassignment {

	public static void main(String[] args) {
		String str,exp,st1="",st2="";
		char ex1,ex2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Give a sentence:");
		str=sc.nextLine();
		System.out.print("Give me characters to delete:");
		exp=sc.next();
		System.out.println("Original sentence:"+str);
		ex1=exp.charAt(0);
		ex2=exp.charAt(1);
		st1=String.valueOf(ex1);
		st2=String.valueOf(ex2);
		str=str.replaceAll(st1,"");
		str=str.replaceAll(st2,"");
		System.out.println("Modified sentence:"+str);
	}

}
