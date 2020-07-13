package work7;

public class Car {

	// メンバ変数
	String accelerator = "アクセル";
	String brake = "ブレーキ";
	int speed;

	// 走行メソッド
	void setRun() {
		System.out.println(accelerator + "を踏みます");
	}

	// スピード設定
	void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("走行スピードは" + speed + "kmです");
	}

	// 停止メソッド
	void setStop() {
		System.out.println(brake + "を踏みます");
	}

}
