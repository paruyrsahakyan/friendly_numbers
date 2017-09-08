package projet_1.projet_1;

public class Number_4_1 {

boolean  ifNumbersAreFriendy(long a, long b){
	long k = 10; 
	long aNumberOfDigits=1, bNumberOfDigits=1; 
	long a_dig, b_dig;
	while ((a/k)>=1){
		k*=10;
		aNumberOfDigits++;
		}
	k=10;
	while ((b/k)>=1){
		k*=10;
		bNumberOfDigits++;
		}
	boolean result=false;
		    k=1;
				for (int i=1; i<=aNumberOfDigits; i++){
	                                       	a_dig=((a-(a%k))/k)%10;
	                                       	k=k*10;
	                                      	result=false;
	                                       	int c=1;
	                                       	for (int j=1; j<=bNumberOfDigits; j++) {
	                                       											b_dig=((b-(b%c))/c)%10;
	                                       											if (a_dig==b_dig) {System.out.println("a_dig"+i+"="+"b_dig"+j); result=true; break;}
	                                       											else c=c*10;                                 }
			                               	if (result==false)
	                                       		break;
			} 
		return result;
    }
}		


