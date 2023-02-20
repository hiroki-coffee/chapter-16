package Polymorphism01;

public class Polymorphism01 {
	public static void main(String[] args) {
		
		Human human0 = new Student("佐藤", 17, 70);
		
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human0.getProfile());

		
		Human human1 = new Employee("小野田", 28, "営業部");
		
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human1.getProfile());
	}
}