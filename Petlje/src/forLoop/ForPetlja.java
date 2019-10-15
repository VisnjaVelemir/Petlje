package forLoop;

public class ForPetlja {

	public static void main(String[] args) {
		
/*System.out.println("Nenade care!");	*/	
		
		
		
for(int i = 0; i <= 10; i ++){
	System.out.println("Ruzan je font");
	
	
}
		
/*		
for(int i = 0; i<4; i++) {
		
int zbir = i +6;
System.out.println("Zbir je:" +zbir);
}		
		*/
		

		
/*	for (int i = 1; i < 11; i++){
	if (i<5){ 
		int zbir = i + 6;
	System.out.println("Zbir je:" + zbir);	
	}else {
		int proizvod = i*9;
		System.out.println("Proizvod je:" + proizvod);
	}
		
	}*/
		
/*	int pocetak = 317;
	int kraj = 25;
	
	if (pocetak <= kraj){

		for(int i = pocetak; i<kraj; i++) {
			if (i%2 == 0) {
				System.out.println(i + " - Broj je paran");
				
			}else {
				System.out.println( i + " - Broj je neparan");
				
				
			}
			
		}
		
	} else {
		System.out.println("Ne moze pocetak da bude veci od kraja");
		

	}*/



for(int i = 1; i <= 10; i++) {
	for ( int j = 1; j<11; j++){
		int proizvod = i * j;
		
		System.out.println(i + "*" + j + "=" + proizvod);
	}
	
}




	
	


		
		

	}

}
