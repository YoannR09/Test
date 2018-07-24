import java.util.ResourceBundle;

public class Tesst {
	Test t;
	private String tentative;
	private String code;
	private static String tentatives;
	private static String cases;
	ResourceBundle titres =ResourceBundle.getBundle("Titre");
	
	
	public Tesst() {
		ResourceBundle titres =ResourceBundle.getBundle("Titre");
		tentatives = (titres.getString("tentative"));
		cases =(titres.getString("cases"));
		 int tentative =4567;
		String test = null;
		String cache;
		int nombreTest = 0;
		int code = (int)(Math.random()*10000);
		int tryT = 0;
		int tryB = 0;
		int max = 9999;
		int min = 1;
		
		int cases = Integer.parseInt(titres.getString("cases"));
		
		do {
					
			if(code<tentative) {
				tryT = code +(int)(Math.random()*(max - code));
				
				
				 if(tryT>tentative) {
					 min=code;
					 code = code +(int)(Math.random()*(tryT - code ));
					 max=tryT;				 
					
				 }
				 else{
				
					 code = tryT +(int)(Math.random()*(max - tryT ));
					 min=tryT;	
					 
					 
				 }
				 
			}		
			
			
			else{
				tryT = min +(int)(Math.random()*(code - min));			
				
					 if(tryT>tentative) {
						 
						 code = code +(int)(Math.random()*(tryT - code));
						 max=tryT;
						 
						 
					 }
					 else {
						 max=code;
						 code = tryT +(int)(Math.random()*(code - tryT));
						 min=tryT;
						 					
					 }				 
					 						
				}
						
		System.out.print(code+"\n");
			nombreTest++;
		   
		}while(code!=tentative);
			
			
		
		test = Integer.toString(code);
		cache = Integer.toString(tentative);
		System.out.print(nombreTest+"test \n");
		System.out.print(code);
		System.out.println(tentatives);
		System.out.println(cases);
		
	}

	private void initMethod() {
		
		
	}

}
