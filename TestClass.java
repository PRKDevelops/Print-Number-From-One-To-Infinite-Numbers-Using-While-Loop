import java.util.*;
public class TestClass{
public static void main(String args[]){
	System.out.println("Enter The Number:-");
	Scanner sc = new Scanner(System.in);
	int Number = sc.nextInt();
	int counter = 1;
	while(counter <= Number){
		System.out.println(counter);
		counter++;
	}
	
	}
}