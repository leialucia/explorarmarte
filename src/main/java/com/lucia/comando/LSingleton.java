package com.lucia.comando;

public class LSingleton {
	
	private static L l;
	
	public static Comando criar() {
		
		if(l == null) {
			l = new L();
		}
		
		return l;
	}
	

}
