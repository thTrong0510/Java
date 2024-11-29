package OOP;

public class SinhVien {
	SinhVien(String ten, int tuoi) {
		name = ten;
		age = tuoi;
	}
	
	SinhVien(){}
	
	private String name;
	private int age;
	
	void introduce(String effective) {
		System.out.printf("Toi ten la: %s - %d - Nang Luc: %s", name, age, effective);
	}
}
