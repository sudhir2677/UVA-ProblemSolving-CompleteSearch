import java.util.*;

class Main{

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = 0;
		boolean first = true;
		while( (n = c.nextInt()) != 0){
			for(int fghij = 1234; fghij <= 98765 / n; fghij++){
				int abcde = fghij*n;
				int tmp, used = (fghij < 10000 )? 1: 0;
				tmp = abcde;
				while(tmp>0){
					used |= 1<<(tmp%10);
					tmp = tmp/10;
				}
				tmp = fghij;
				while(tmp>0){
					used |= 1<<(tmp%10);
					tmp = tmp/10;
				}
				if(used == (1<<10) -1){
					//System.out.printf("%0.5d / %0.5d = %d\n", abcde, fghij, n);
					System.out.println(abcde + " / "+(fghij < 10000 ? "0"+fghij : fghij)+" = "+(abcde/ fghij));
					first = false;
				}
			}
			if(first){
				System.out.println("There are no solution for "+n+".");
			}
			first = true;
		}
	}
}