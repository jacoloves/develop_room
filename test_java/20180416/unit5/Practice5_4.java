package unit5;

public class Practice5_4 {

	public static double calcTriangelArea(double bottom, double height) {
		double ans = bottom * height / 2;
		return ans;
	}

	public static double calcCircleArea(double radius) {
		double ans = 3.14 * radius * radius;
		return ans;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double bot, hei, rad, ans1, ans2;
		bot = 10.0;
		hei = 5.0;
		rad = 5.0;

		ans1 = calcTriangelArea(bot, hei);
		ans2 = calcCircleArea(rad);

		System.out.println("三角形の底辺の長さが"+ bot +"cm、高さが"+ hei +"cmの場合、面積は"+ ans1 + "cm2");
		System.out.println("円の半径が"+ rad +"cmの場合、面積は"+ ans2 + "cm2");
	}

}
