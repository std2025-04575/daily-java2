package day08.q02;

/**
 * モンスタークラス
 */
public class Monster {
	
	private String name;
	private int hp;
	private int age;
	/**
	 * コンストラクタ
	 * 
	 * @param name
	 * @param hp
	 */
	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
		System.out.println(name + "が現れた！！");
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Monster [name=" + name + ", hp=" + hp + ", age=" + age + "]";
	}
		
	
}