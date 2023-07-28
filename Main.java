package Test_8_2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Recipe recipe1 = new Recipe("ジャガイモ煮込み+ごはん","ジャガイモ",0.3,14);
		Recipe recipe2 = new Recipe("麻婆豆腐＋ごはん","豆腐",0.5,14);
		System.out.println("今週の料理リスト：\n");
		String[] list = {
				"ジャガイモ煮込み+ごはん",
				"麻婆豆腐＋ごはん",
				"ラーメン+餃子",
				"しゃぶしゃぶ＋ごはん",
				"バーベキュー放題",
				"ステーキ放題" };
		

		while (true) {
			int lunchNo = new java.util.Random().nextInt(list.length);

			int dinnerNo = new java.util.Random().nextInt(list.length);

			if (lunchNo != dinnerNo) {
				System.out.println("今日の昼ご飯は >" + list[lunchNo]);
				System.out.println("今日の晩御飯は >" + list[dinnerNo]);
				break;
			}
			
		}
	}

}
