package work6;

public class School4 {

	public static void main(String[] args) {
		// インスタンス化
		Student3 s = new Student3("渋谷太郎", 22, 3, 5);
		// 自己紹介（1回目）
		s.introduction();
		// アクセッサメソッドを使って設定
		s.setName("変更太郎");
		s.setGrade(4);
		s.setRank(10);
		// 年齢計算
		s.ageCalculation();
		// 自己紹介（2回目）
		s.introduction();
	}

}
