package day05.q02;

public class Validation {
	boolean checkId(int id) {
		
		boolean login=false;
		if(id==1111 || id==2222) {
			login=true;
		}
		return login;
	}
	
}
