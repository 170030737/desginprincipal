package calcate;

import java.util.Scanner;

public class calci {		
	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	        switch (x){
	            case 1:
	                Add add = new Add();
	                add.add(m,n);
	            case 2:
	                Sub sub = new Sub();
	                sub.Sub(m,n);
	            case 3:
	                multi mul = new multi();
	                mul.multi(m,n);
	            case 4:
	                Div div = new Div();
	                div.div(m,n);
	        }
	    }
}


