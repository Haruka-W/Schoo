package work7;

public class Student {

	// メンバ変数
	String name = "スクー太郎";
	int age = 20;
	int grade = 2;
	int rank = 1;
	String address;
	String sex;
	String teacher;

	// 自己紹介メソッド
	void introduction() {
		System.out.println("私の名前は" + name + "です");
		System.out.println("私の年齢は" + age + "歳です");
	}

	// 年齢計算メソッド
	void ageCalculation() {
		age = age + 1;
		System.out.println("私は" + age + "歳になりました");
	}

	//住所の設定メソッド
	void setAddress(String address) {
		this.address = address;
	}

	//住所の取得メソッド
	String getAddress() {
		return address;
	}

	// 性別と担任の設定メソッド
	void setGradeAndRank(String sex, String teacher) {
		this.sex = sex;
		this.teacher = teacher;
	}

	// 住所と年齢を設定するメソッド
	void setAddressAndAge(String address, int age) {
		this.address = address;
		this.age = age;
	}

	// String型の配列を３つ
	String[] group(String one, String two, String three) {
		String[] pin = new String[3];
		pin[0] = one;
		pin[1] = two;
		pin[2] = three;
		return pin;
	}

	// int型の引数をString型にしてアウトプット
	String createProfire(int age) {
		String profire = "私の年齢は" + age + "です";
		return profire;
	}

}
