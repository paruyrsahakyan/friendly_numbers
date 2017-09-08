package projet_1.projet_1;

// This class indicates is to number are friendly or not. (Numbers are friendly if they both consist of the same simple numbers)
public class Number_4 {

	public static void main(String arg[]){
		boolean result;
		long a=9687, b=765777798;
	
	Number_4_1 objectOf4_1 = new Number_4_1();
		result= objectOf4_1.ifNumbersAreFriendy(a, b);
				if (result){
							System.out.println("revers");
		                    long exchange = a; a=b; b=exchange;}
	    result=  objectOf4_1.ifNumbersAreFriendy(a, b);
	    		System.out.println(result);	
	}
}
	
