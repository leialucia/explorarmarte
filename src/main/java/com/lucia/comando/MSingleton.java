package com.lucia.comando;

public class MSingleton {
	
	private static M m;
	
	public static Comando criar() {
		
		if(m == null) {
			m = new M();
		}
		
		return m;
	}
	

}
