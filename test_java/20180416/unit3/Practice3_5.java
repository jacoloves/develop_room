package unit3;

public class Practice3_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("[メニュー]1:検索2:登録3:削除4:変更>");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
			default:

		}
	}

}
