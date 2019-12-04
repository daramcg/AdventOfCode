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
		
		System.out.println(answers.size());
		for(int z :answers) {
			System.out.print(z+" ");
		}
		
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
}
