import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num[] = new int[9];
		int max = 0;
		int n = 0;
		
		for(int i = 0; i < 9; i++) {
			num[i] = sc.nextInt();
			if(num[i] > max) {
				max = num[i];
				n = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(n);
	}

}