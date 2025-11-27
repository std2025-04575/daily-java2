package day09.q01;

import java.io.IOException;

public class ComPlayer implements Playable{

		@Override
		public int doJanken()throws IOException{
			int pon=(int)Math.random()*3;
			String[] hand= {"グー","チョキ","パー"};
			System.out.println("コンピューターは"+hand[pon]+"を選んだ");
			return pon;
		}
	}


