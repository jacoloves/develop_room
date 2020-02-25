package unit5;

public class Practice5_2 {

	public static void email(String title, String address, String text) {
		System.out.println("「" + address + "」に、以下のメールを送信しました");
		System.out.println("件名：「"+ title + "」");
		System.out.println("本文：「"+ text + "」");
	}

	public static void email(String address, String text) {
		System.out.println("「" + address + "」に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：「"+ text + "」");
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String add = "ttt@co.jp";
		String tex = "テストです";

		email(add, tex);
	}

}
