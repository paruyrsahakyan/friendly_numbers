package projet_1.projet_1;

public class Number_4_1 {
/*public int getQuantityOfDigits(long a){
while (a/10>0){
	k*=10;
	i++;
	}
return i;
}*/
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
	                                       	//System.out.println("a_dig"+i+"="+ a_dig);
	                                       	k=k*10;
	                                       //	a_current=(a_current-a_dig)/10;
	                                       	result=false;
	                                       	int c=1;
	                                       //	b_current=b;
	                                       	for (int j=1; j<=bNumberOfDigits; j++) {
	                                       											b_dig=((b-(b%c))/c)%10;
	                                       											//System.out.println("b_dig"+j+"="+ b_dig);
	                                       											if (a_dig==b_dig) {System.out.println("a_dig"+i+"="+"b_dig"+j); result=true; break;}
	                                       											else c=c*10;                                 }
			                               	if (result==false)
	                                       		break;
			} 
		return result;
    }
}		


