package work7;

public class School {

	public static void main(String[] args) {
		// インスタンス化
		Student s = new Student();
		// 住所の設定
		s.setAddress("東京都中央区");
		// 住所の取得
		String address = s.getAddress();
		System.out.println("住所は" + address + "です");
	}

}
