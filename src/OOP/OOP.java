package OOP;

public class OOP {
	
	//package: 
	/*
	 	nên để ở chế đó public để các class có thể import dùng
	 	trong những package khác nhau có thể tạo các class trùng tên 
	 */
	
	//Tạo Object của 1 class trong cùng package hoặc được import vào 
	/*
	  Nếu thuộc tính: 
	  Public: có thể dùng object truy cập vào
	  protected: cùng package thì như public 
	  			 khác package nếu được kế thừa như public - ko được kế thừa như private
	  default: cùng package như public - khác package như priavte
	  private: không thể dùng object truy cập vào được 
	  
	  this: gọi của chính class đang sử dụng
	  super: gọi của class cha của nó 
	  
	  trong interface: 
	  		1 - có cung cấp default function() một function có nội dung hàm k cần overide lại ở con 
	   		nếu implemments nhiều Interface có cùng default function này gọi trực tiếp Parents.super.function()
	   		2 - static function cũng có nội dung hàm	
	   
	   		
	   abstract: 
	   		nên dùng khi các class con có quan hệ với nhau ví dụ cùng là sinh viên ....
	   		nếu class đó có nhiều thuộc tính protected, private ...
	   		ko dùng static, final 
	   	interface: ưu tiên làm hơn 
	   		nên dùng khi các class con là bất kì ko liên quan đến nhau 
	   		nếu class đó chỉ có thuộc tính public
	   		nếu muốn đa kế thừa
	*/
	
	public static void main(String[] args) {
		SinhVien Trong = new SinhVien("Thanh Trong", 20);
		Trong.introduce("Trung Binh");
	}
}
