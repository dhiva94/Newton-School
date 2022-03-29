import java.util.*;

public class prime {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int count = 0;
        for(int i = 2; i <= num; i++) {
        	if (num % i == 0) {
        		count++;
        	}
        }
        if (count == 1) {
        System.out.println("Prime");
        //System.out.print(count);
      }
        else {
        	System.out.println(" Not Prime");
        	//System.out.print(count);
        }
	}
}
