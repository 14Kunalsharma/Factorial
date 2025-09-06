import java.util.*;
class Fact{
	public static void factor(int n){
	int result=1;
	if(n<0){
	System.out.println("Invalid number");
	}
	else if(n==0){
	System.out.println("1");
	}
	else{
	for(int i=1; i<=n; i++){
		result= result*i;
	}}
	System.out.println("Factorial of given number = " + result);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		factor(n);
		sc.close();
	}
}