//Session3_Assignment3: 30.4.2016
//Author : Kamakshi Abbi
import java.util.*;
public class RandomNumberGenerator {
	int num;
	public RandomNumberGenerator(int num){
		this.num = num;
	}
	public int Generate(int N){
		Random r = new Random();
		return(r.nextInt((N-1)));
		
	}
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	input.close();
	RandomNumberGenerator obj = new RandomNumberGenerator(num);
	System.out.println("Random number [0 and N - 1] " + obj.Generate(num));
}
}
