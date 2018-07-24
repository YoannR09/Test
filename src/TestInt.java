
public class TestInt {

	int nombre = 2456;
	String nombreString = Integer.toString(nombre);
	int nombreTest;
	boolean codeOk = false;
	int chiffreOk = 0;
	int code = (int)(Math.random()*(10));
	
	
	
	public TestInt(){
		
		char [] max = new char[nombreString.length()];
		for(int ma=0; ma<nombreString.length();ma++) {
			max[ma]=9;
		}
		char [] min = new char[nombreString.length()];
		for(int mi=0; mi<nombreString.length();mi++) {
			min[mi]=9;
		}
		System.out.println(max);
		
		do {
			
			for(int i=0;i<nombreString.length();i++) {
				
				

				
				
				if(code<nombreString.charAt(i)) {
					
					
					int tryT  = code +(int)(Math.random()*(max[i] - code));
					
					
					if(tryT>nombreString.charAt(i)) {
						code = code +(int)(Math.random()*(tryT - code));
					}
					else {
						code = tryT + (int)(Math.random()*(max[i] - tryT));
						
					}
				
				}
				else if(code>nombreString.charAt(i)) {
					int tryT = min[i] + (int)(Math.random()*(code - min[i]));
					
					if(tryT>nombreString.charAt(i)) {
						code = code + (int)(Math.random()*(tryT - code));
					}
					else {
						code = tryT + (int)(Math.random()*(code - tryT));
						
					}
				}
				else {
					++chiffreOk;
					System.out.println(code + "code et la le nombrechar " + nombreString.charAt(i));
				}
				
				
				if(chiffreOk!=4) {
					codeOk=true;
				}
				System.out.println(code);
				
				System.out.println("nombreTest"+nombreTest);
			}
			++nombreTest;
				
		}while(codeOk==false);
		System.out.print("reussi");
	
	}
}
