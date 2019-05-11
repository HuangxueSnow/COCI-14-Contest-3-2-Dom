import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Prase {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		in.nextLine();
		int warn = 0;
		HashMap<String,Integer> name = new HashMap<String,Integer>();
		for(int i=1;i<=n;i++) {
			String na = in.nextLine();
			int food = name.getOrDefault(na, 0);
			if(food>(i-1)-food)warn++;
			name.put(na, food+1);
		}
		System.out.println(warn);
	}

}
