package IOStream;

public class IOStream {
	public static void main(String[] args) {
		/*
		 	Có 3 loại: 
		 		Byte stream and charecter stream
		 			Character stream:
		 				Ngôn ngữ có dấu, tượng hình (tiếng việt, tiếng hàn..): cần nhiều hơn 8 bytes
		 			Bytes Stream: 
		 				Ngôn ngữ ko dấu (Tiếng anh): cần 8 bytes để lưu
		 			
		 			FileReader/FileInputStream: khởi tạo file dùng để đọc dữ liệu ra
		 			FileWriter/FileOutputStream: khởi tạo file dùng để ghi dữ liệu vào
		 			Khi đặt file.txt:
		 			 	+ chỉ ghi file.txt thì máy hiểu file.txt đang nằm ở root chính là First_code 
		 			 		nằm cùng cấp với các package và trong src
		 			 	+ nếu không nằm tron src cần cung cấp path 
		 			 		trong package chứa class đó / cùng cấp với class đó thì cần điền path của file.txt
		 			 	+ nhiều chức năng chỉ cho dùng Paths(class/object) chứ ko cho nhập trực tiếp chuỗi string vào
		 		
		 			
		 		Buffered stream
		 			làm trước thao tác đọc ghi -> load all thing vào memory trước chỉ cần đem ra sử dụng 
		 			hiệu suất cao hơn Byte stream and charector stream
		 			tốn dung lượng nhưng tốc độ nhanh 	
		 		data stream and object stream 
		*/
	}
}
