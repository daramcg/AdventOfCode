import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class Day2 {

	public static void main (String [] args) throws FileNotFoundException {
		String str="";
		
		File file=new File("input2.txt");
		Scanner scan=new Scanner(file);
		
		while(scan.hasNext()) {
			str=scan.nextLine();	
		}
		
		int[] t= {1,1,1,4,99,5,6,0,99};
		
		t=compute(t);
		for(int v : t) {
			System.out.print(v+" ");
		}
		System.out.println("");
		
		String test = str; 
		// The string you want to be an integer array.
		String[] integerStrings = test.split(","); 
		// Splits each spaced integer into a String array.
		int[] integers = new int[integerStrings.length]; 
		int[] inputs = new int[integerStrings.length];
		
		// Creates the integer array.
		for (int i = 0; i < integers.length; i++){
		    integers[i] = Integer.parseInt(integerStrings[i]); 
		    inputs[i] = Integer.parseInt(integerStrings[i]);
		//Parses the integer for each string.
		}
		
		//Restore state of input
		integers[1]=12;
		integers[2]=2;
			
			
			
			System.out.println("----------------");
			
			for(int a : integers) {
				System.out.print(a+" ");
			}
			System.out.println("");
			
			System.out.println("----------------");
	
			integers=compute(integers);
			for(int v : integers) {
				System.out.print(v+" ");
			}
		
			
			System.out.println("");
			
			System.out.println("----------------");
	

			System.out.println("");	
			System.out.println("----------------");
			
			//Here I tried different values until I got the result 19690720 as requested.
			//A terrible way to do this, but it was quicker than messing with loops
			// 100*noun + verb ie 100*32 + 55 = 6255
			int answer=bruteF(62,55,inputs);
			
			System.out.println(answer);
			
		}
	
	static int[] compute(int[] in) {
		
		int[] t= new int[in.length];
		t=in;
		for(int i=0; i<t.length-3;i++) {
			
			switch(t[i]) {
			
				case 1:
			    // opCode 1
					t[t[i+3]]=t[t[i+1]]+t[t[i+2]];
					i=i+3;
			    break;
			    
				case 2:
			    // opCode 2
					t[t[i+3]]=t[t[i+1]]*t[t[i+2]];
					i=i+3;
			    break;
			    
				case 99:
				    // opCode 99 - halt
					i=t.length;
				    break;
			  default:
			    // do nothing
			}
		}
			return t;
	}
	
	static int bruteF(int a, int b, int[] ins) {
		
		ins[1]=a;
		ins[2]=b;
		ins=compute(ins);
		
		
		return ins[0];
	}
}
	