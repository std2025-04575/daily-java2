package day07.q01;

/**
 * 飲料水クラス
 */

public class Drink {
	/**値段*/
	private int price;
	/**商品名*/
	private String name;
	
	/**
	 * コンストラクタ
	 */
	public Drink() {
		super();
		price=120;
		name="ビタミン麦茶";
	}
	
	/**
	 * コンストラクタ
	 * 
	 * @param price 値段
	 * @param name 商品
	 */
	public Drink(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	/**
	 * 飲料水の値段と商品名を出力
	 */
	public void show(){
		System.out.println(name+"："+price+"円です。");
	}
	
	
	
}
