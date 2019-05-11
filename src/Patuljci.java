import java.util.Scanner;

public class Patuljci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int[] num = new int [9];
		int n=9;
		for(int i=0;i<9;i++) {
			num[i]=in.nextInt();
		}
		int total = 0;
		for(int i=0;i<3;i++) {
			for(int j=i+1;j<4;j++) {
				for(int k=j+1;k<5;k++) {
					for(int l=k+1;l<6;l++) {
						for(int m=l+1;m<7;m++) {
							for(int o=m+1;o<8;o++) {
								for(int p=o+1;p<9;p++) {
										total = num[i]+num[j]+num[k]+num[l]+num[m]+num[o]+num[p];
										if(total==100) {
											System.out.println(num[i]);
											System.out.println(num[j]);
											System.out.println(num[k]);
											System.out.println(num[l]);
											System.out.println(num[m]);
											System.out.println(num[o]);
											System.out.println(num[p]);
											return;
										}
									
								}
							}
						}
					}
				}
			}
		}
		
	}

}
