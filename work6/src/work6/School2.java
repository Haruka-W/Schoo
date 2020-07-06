package work6;

public class School2 {

	public static void main(String[] args) {
		// 1人目20歳
		Student s1 = new Student();
		s1.introduction();
		// 2人目21歳
		Student s2 = new Student();
		s2.ageCalculation();
		s2.introduction();
		// 3人目23歳
		Student s3 = new Student();
		s3.ageCalculation();
		s3.ageCalculation();
		s3.ageCalculation();
		s3.introduction();
	}

}
