package unit2;

public class Practice2_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(3);
		fortune++;
		System.out.println("占いの結果が出ました");
		System.out.println(age +"歳の" + name + "さん、あなたの運記番号は" + fortune + "です");
		System.out.println("1:大吉2:中吉3:吉4:凶");
	}

}
