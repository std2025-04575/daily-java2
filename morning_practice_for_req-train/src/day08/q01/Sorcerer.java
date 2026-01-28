package day08.q01;

import day08.q02.Monster;

/**
 * 魔導士クラス
 */

public class Sorcerer extends Magic{

	/**
	 * コンストラクタ
	 * 
	 * @param name
	 */
	public Sorcerer(String name) {
		super(name);
	}

//	@Override
//	public void attack(int mp) {
//		// TODO 自動生成されたメソッド・スタブ
//		super.attack(mp);
//		int adddamege=(int)(mp*0.5);
//		System.out.println("追加で"+adddamege+"を与えた。");
//	}

	@Override
	public void attack(int mp, Monster monster) {
		// TODO 自動生成されたメソッド・スタブ
		super.attack(mp, monster);
		int adddamege=(int)(mp*0.5);
		System.out.println("追加で"+adddamege+"を与えた。");
		monster.setHp(monster.getHp() - adddamege);
	}
	
	
	
}
