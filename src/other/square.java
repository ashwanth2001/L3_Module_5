package other;

public class square
{
	public static void main(String[] args){
		int a = 0;
		for(int i = 1; i<100; i++){
			for( int j = 1; j<i; j++){
				a = (int) (Math.pow(i, 2)-Math.pow(j, 2));
				//System.out.println(a);
				if(a<2020&&a>2000){
					System.out.println(i + ", " + j + ", " + a);
				}
			}
        }
    }
}
