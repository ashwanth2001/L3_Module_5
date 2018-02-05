package USACO;

public class AlyTest {

	public static void main(String[] args) {
		//for(int k = 0; k<101; k++) {
		int n1 = 4;
		int n2 = 15;
		int num = 0;
		for(int i = 1; i<=n1; i++) {
			for(int j = 1; j<=n2; j++){
				if((i+j)%5==0) {
					num++;
					System.out.println((i+" "+j));
				}
			}
		}
		System.out.println(", " + num);
		//}
	}
}
