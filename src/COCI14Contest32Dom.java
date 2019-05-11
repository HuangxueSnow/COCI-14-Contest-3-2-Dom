import java.util.Scanner;

public class COCI14Contest32Dom {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = in.nextInt();
		int m = in.nextInt();
		int p = in.nextInt();
		int[][] people = new int[n][2];
		for(int i=0;i<n;i++) {
			people[i][0]=in.nextInt();
			people[i][1]=in.nextInt();
		}
		int current = p;
		int times = 0;
		while(times==0 && current==p || current!=p) {
			int temp = current;
			
			for(int i=0;i<n;i++) {
				boolean check = false;
				if(current==p && times!=0) {
					System.out.println("-1");
					return;
				}
				if(current == people[i][1]) {
					current = people[i][0];
					times++;
					check = true;
				}
				if(i!=0 && check) {
					i=-1;
				}
			}
			if(temp==current) {
				System.out.println(times);
				return;
			}
			
		}
		
	}

}
