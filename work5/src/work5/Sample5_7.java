package work5;

public class Sample5_7 {

	public static void main(String[] arcs) {
		boolean b = true;
		while(b == true) {
			System.out.println("Hello");
			// ↑これだけだと無限ループするので下記を追加
			b = false;
		}
	}

}
