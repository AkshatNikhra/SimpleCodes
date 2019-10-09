import java.util.*;
public class HANOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		printMoves(n);

	}

	private static void printMoves(int n) {
		// TODO Auto-generated method stub
		solveProblem(n,"A","C","B");
	}
	private static void solveProblem(int n, String s, String t, String u) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		else
		{
		solveProblem(n-1,s,u,t);
		move(s,t);
		solveProblem(n-1,u,t,s);
		}
		
		
	}

	static void move(String a,String b)
	{
		System.out.println(a+"->"+b);
	}

}
