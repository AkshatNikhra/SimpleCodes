import java.util.*;
 class sumFfromArray
 {
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 int lengthOfArray=sc.nextInt();
		 int[] a=new int[lengthOfArray];
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 int req=sc.nextInt();
		 sc.close();
		 Map<Integer,Integer> mp=new HashMap<>();
		 for(int i=0;i<a.length;i++)
		 {
			 if(mp.containsKey(a[i]))
			 {
				 System.out.println("Index required are "+mp.get(a[i])+" "+i);
			 }
			 else
			 {
				 mp.put(req-a[i], i);
			 }
		 }
		 
	 }
 }