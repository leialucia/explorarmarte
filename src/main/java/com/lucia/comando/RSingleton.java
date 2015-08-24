package com.lucia.comando;

public class RSingleton {
	
	private static R r;
	
	public static Comando criar() {
		
		if(r == null) {
			r = new R();
		}
		
		return r;
	}
	

}
