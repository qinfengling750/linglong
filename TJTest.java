package day1;

public class TJTest {

	public static void main(String[] args) {
		T t=new T(3,5);
		System.out.println("原始位置：");
		t.print();
		t.drop();
		System.out.println("下落后:");
		t.print();
	}

}
