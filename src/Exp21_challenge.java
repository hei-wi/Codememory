class Student2 {
	
	String name;
	static String department = "環境情報";
	static int studentCount = 0;
	int score;
	static int totalScore = 0;

	public Student2(String name,int score) {
		this.name = name;
		this.score = score;
		Student2.totalScore += score;
		Student2.studentCount++;
	}

	void showName() {
		System.out.println("学生名：" + this.name);
	}
	
	void showInfo() {
		System.out.println("学生名：" + name + "," + score + "点");
	}
	
	static void showAverage() {
		Student2.totalScore /= Student2.studentCount;
		System.out.println("全体の平均点：" + Student2.totalScore + "点");
	}

	static void showStudentCount() {
		System.out.println("登録学生数：" + Student2.studentCount + "人");
	}
}

public class Exp21_challenge {
	public static void main(String[] args) {
		Student2 stu1 = new Student2("はると",72);
		Student2 stu2 = new Student2("みなと",88);
		Student2 stu3 = new Student2("アカリ",95);

		stu1.showInfo();
		stu2.showInfo();
		stu3.showInfo();
		Student2.showAverage();
	}
}

