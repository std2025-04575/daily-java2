package day07.q02;

/**
 * 会員クラス
 */

public class Member {
	//フィールド
	private int id;
	private String name;
	
	/**
	 * コンストラクタ
	 * 
	 * @param id
	 * @param name
	 */
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * メソッド
	 */
	public void show() {
		System.out.println("メンバー一覧を表示します");
		System.out.println(this.id+":"+this.name);
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
