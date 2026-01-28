package day07.q02;

/**
 * 会員を操作するクラス
 */

public class MemberManager {

	/**
	 * コンストラクタ
	 */
	private MemberManager() {
	}

	/**
	 * メソッド
	 */
	public static void show(Member[] list) {
		System.out.println("メンバー一覧を表示します");
		for (Member member : list) {
			member.show();
		}
	}

	public static void update(Member[] list, int id, String name) {
		System.out.println("\nID：" + id + "のメンバー名を" + name + "に更新します");
		for (Member member : list) {
			if (member.getId() == id) {
				member.setName(name);
				break;
			}
		}
	}
}
