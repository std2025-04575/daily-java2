package day05.q01;

/**
 * CashRegisterクラス
 * 
 * @param num 税抜き金額
 */

public class CashRegister {
	//calcPrice()作る
	public int calcPrice(int num ) {
		double dnum=num*1.1;
		int price=(int)dnum;
		return price;
	}
}
