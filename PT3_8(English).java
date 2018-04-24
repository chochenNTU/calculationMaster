import java.util.ArrayList;
import java.util.Scanner;

public class PT3_8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		ArrayList<Integer> intArray = new ArrayList<>(); //陣列清單儲存正整數
		int number;
		System.out.println("Please enter a positive integer ");
		number = in.nextInt();
		while(number>0){
			intArray.add(number);
			System.out.println("Please enter a positive integer ");
			number = in.nextInt();
		
		}
	int sum = 0;
	//求總和
	for(int i=0;i<intArray.size();i++) { 
	   sum +=intArray.get(i);
	}
	int max=0;
	//求最大值
	for(int i=0;i<intArray.size();i++) {
		  if(i==0) {
			 max=intArray.get(0);
		  }else {
			  if(intArray.get(i)> max) {
				  max=intArray.get(i);
			  }
		  }
		}
	System.out.println("total"+intArray.size()+"numbers");
	System.out.println("sum:"+sum);
	System.out.println("average:"+(double)sum/intArray.size());
	System.out.println("maximum:"+max);
	}
	
}
