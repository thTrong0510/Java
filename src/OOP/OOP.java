package OOP;

public class OOP {
	
	//Tạo Object của 1 class trong cùng package hoặc được import vào 
	/*
	  Nếu thuộc tính: 
	  Public: có thể dùng object truy cập vào
	  protected: cùng package thì như public 
	  			 khác package nếu được kế thừa như public - ko được kế thừa như private
	  default: cùng package như public - khác package như priavte
	  private: không thể dùng object truy cập vào được 
	*/
	
	public static void main(String[] args) {
		SinhVien Trong = new SinhVien("Thanh Trong", 20);
		Trong.introduce("Trung Binh");
	}
}
