package OOP;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing_Unboxing {

	public static void main(String[] args) {
		Integer soNguyen = new Integer(10);// auto boxing
		int value = soNguyen.intValue();// unboxing

		List<Double> list = new ArrayList<Double>();
		list.add(3.5); //autoboxing tự chuyển 3.5 -> kiểu dữ liệu k nguyên thủy Double

		ArrayList arrList = new ArrayList();
		arrList.add(2); //auto
		arrList.add("Thanh Trong");
		
		System.out.println(arrList.toString());
	}

}
