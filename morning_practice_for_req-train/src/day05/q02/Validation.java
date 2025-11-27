package day05.q02;

public class Validation {
	boolean checkId(int id) {
		
		boolean login=true;
		if(id==1111 || id==2222) {
			login=false;
			System.out.println("ログインに成功しました");
			System.out.println("ようこそ、ID:"+id+"さん");
		}else {
			System.out.println("ログインできません");
			System.out.println("もう一度入力してください");
		}
		return login;
	}
	
}
