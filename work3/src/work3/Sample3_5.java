package work3;

public class Sample3_5 {
	public static void main(String[] arcs) {
		String str = "Hello";
		System.out.println(str);
		// 文字数を表示
		System.out.println(str.length());
		// 大文字へ変換
		System.out.println(str.toUpperCase());
		// 小文字へ変換
		System.out.println(str.toLowerCase());
		// eという文字が含まれているか検索
		System.out.println(str.indexOf("e"));
		// 2文字目から3文字を切り取り
		System.out.println(str.substring(1, 4));
	}
}
