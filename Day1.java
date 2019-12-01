import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;

public class Day1 {

	public static void main (String [] args) throws FileNotFoundException {
		ArrayList<Long> list=new ArrayList<Long>();
		
		File file=new File("input.txt");
		Scanner scan=new Scanner(file);
		
		while(scan.hasNext()) {
			list.add((long) Integer.parseInt(scan.nextLine()));	
		}
		
		long val = 0;
		long total = 0;
		long sum= 0;
		long result=0;
		
		for(long d : list) {
		    val =d/3 -2;
		    sum +=val;
		    total =val;
		    val=fuels(d, 0);
		    
		    System.out.println(val);
		    result+=val;
		}
		 
		System.out.println("-------------------------");
	
		
		//fuel for modules should be 3178783;
		//total fuel: 4765294
	
		System.out.println("fuel for modules: "+sum);
		System.out.println("total fuel: "+result);
	
		
		
	}
	
	   static long fuels(long N,long total ) 
	    { 
		   
			    if (N/3 -2  <=0) // base case
			        return total;
			  
			    else   {
			    	total+=N/3 -2;
			        
			        return fuels(N/3 -2,total); 
			    }
			}
	    
}


