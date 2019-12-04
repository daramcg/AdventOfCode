//PART A only

import java.util.ArrayList;
public class Day4 {
	public static void main(String[] args) {
		//set the range
		
		int bottomNum=272091;
		int topNum=815432;
		
		String bottom="272091";
		String top="815432";
		
		ArrayList<Integer> answers=new ArrayList<Integer>();
		
		ArrayList<Integer> answers2=new ArrayList<Integer>();
		
		boolean testIncrease=false;
		
		testIncrease=strictlyIncreasing("111111");
		
		boolean testAdjacent=adjacentNumbers("122444");
		
		//System.out.println(testIncrease);
		//System.out.println(testAdjacent);
		
		
		for(int i=bottomNum;i<=topNum;i++) {
			
			if(strictlyIncreasing(Integer.toString(i)) && adjacentNumbers(Integer.toString(i))) {
				answers.add(i);
			}
			
		}
		
		System.out.println("The number of possible passwords for part A is : "+answers.size());
		/*for(int z :answers) {
			System.out.print(z+" ");
		}*/
		
		
		
		for(int i=bottomNum;i<=topNum;i++) {
			
			if(strictlyIncreasing(Integer.toString(i)) && adjacentNumbers2(Integer.toString(i))) {
				answers2.add(i);
			}
			
		}
		System.out.println("The number of possible passwords for part B is : "+answers2.size());
		
}
	
	static boolean strictlyIncreasing (String x) {
		
		boolean end=false;
		
		int[] list=new int[x.length()];
		
		
		
		boolean[] result= new boolean[list.length];
				
		result[list.length-1]=true;
		
		for (int i=0;i<x.length();i++) {
			list[i]=Integer.parseInt(x.substring(i,i+1));
			//System.out.println(list[i]);
		}
		
		
		for(int i=0 ; i<list.length-1;i++) {
			
			if(list[i+1]>=list[i]) {
				result[i]=true;
			}
			else {
				result[i]=false;
			}
		}
		for(boolean c : result) {
			//System.out.println(c);
			if(c) {
				end=true;
			}else if(!c) {
				end =false;
				break;
			}
		}
		
		
		return end;
		
		
		
	}
		
		static boolean adjacentNumbers (String x) {
			boolean result=false;
			
			for(int i=1 ; i<x.length();i++) {
				if(Integer.parseInt(x.substring(i,i+1))==Integer.parseInt(x.substring(i-1,i))) {
					result=true;
				}
			}
			return result;
		}
		
		static boolean adjacentNumbers2 (String x) {
			boolean result=false;
			
			
			int a=Integer.parseInt(x.substring(0,1));
			int b=Integer.parseInt(x.substring(1,2));
			int c=Integer.parseInt(x.substring(2,3));
			int d=Integer.parseInt(x.substring(3,4));
			int e=Integer.parseInt(x.substring(4,5));
			int f=Integer.parseInt(x.substring(5,6));
			
				if(a==b && a!=c) result=true;
				else if(b==c && b!=d && b!=a) result=true;
				else if(c==d && c!=e && c!=b) result=true;
				else if(d==e && d!=f && d!=c) result=true;
				else if(e==f && e!=d) result=true;
				else result =false;
			
			return result;
		}
}
