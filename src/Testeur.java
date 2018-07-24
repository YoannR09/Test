
public class Testeur {

	int nombre = 7456;
	String nombreString = Integer.toString(nombre);
	int code = (char)(Math.random()*10000);
	String codeString = Integer.toString(code);
	char [] tryT = new char [nombreString.length()];
	char [] max = new char [nombreString.length()];
	
	char [] min = new char [nombreString.length()];
	char [] charArrayCode = codeString.toCharArray();
	char [] charArrayNombre = nombreString.toCharArray();
	

	public Testeur() {
		   
		
		   
		do {
			
			for ( int i=0; i<codeString.length(); i++) {
			max[i]=9;
			max[i]=0;
			char chiffreCode = codeString.charAt(i);
			char chiffreNombre = nombreString.charAt(i);
			
			if(charArrayCode[i]<chiffreNombre) {
				tryT[i] = (char) (chiffreCode +(Math.random()*(max[i] - chiffreCode)));
				
				
				 if(tryT[i]>chiffreNombre) {
					 min[i]= (char) (chiffreCode);
					 chiffreCode = (char) (chiffreCode +(Math.random()*(tryT[i] - chiffreCode)));
					 max[i]=tryT[i];				 
					
				 }
				 else{
				
					 chiffreCode = (char) (tryT[i] +(Math.random()*(max[i] - tryT[i])));
					 min[i]=tryT[i];	
					 
					 
				 }
			
				 System.out.println(chiffreCode +0+" on est dans le if");
			}		
			
			
			else{
				tryT[i] = (char) (min[i] +(Math.random()*(chiffreCode - min[i])));			
				
					 if(tryT[i]>chiffreNombre) {
						 
						 chiffreCode= (char) (chiffreCode +(Math.random()*(tryT[i] - chiffreCode)));
						 max[i]=tryT[i];
						 
						 
					 }
					 else {
						 max[i]=(char) (chiffreCode);
						 chiffreCode = (char) (tryT[i] +(Math.random()*(chiffreCode - tryT[i])));
						 min[i]=tryT[i];
						 					
				}				 
					 System.out.println(chiffreCode+0+" on est dans le else");	  						
			}
			charArrayCode[i]=(char)(chiffreCode+0);
		
	
			}
			
			}while(code==nombre);
			
		
	}
}
