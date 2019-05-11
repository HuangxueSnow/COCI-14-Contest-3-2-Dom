import java.util.Scanner;

public class Spirals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		int[][] num = new int[15][15];
		int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
		int d = 0;
		int step = 0;
		int limit = 1;
		int turn = 0;
		int r=7;
		int c=7;
		int top=7,bot=7,left=7,right=7;
		num[r][c]=start;
		for(int i=start+1;i<=end;) {
			if(step<limit) {
				r+=dir[d][0];
				c+=dir[d][1];
				num[r][c]=i;
				step++; i++;
				top = Math.min(top, r);
				bot = Math.max(bot, r);
				left = Math.min(left, c);
				right = Math.max(right, c);
			}
			else {
				d=(d+1)%4;
				turn++;
				step=0;
				if(turn==2) {
					limit++;
					turn = 0;
				}
			}
		}
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				if(num[i][j]==0)System.out.print("   ");
				else if(num[i][j]>9) System.out.print(num[i][j]+" ");
				else System.out.print(" "+num[i][j]+" ");
			}
			System.out.println();
		}
	}

}
