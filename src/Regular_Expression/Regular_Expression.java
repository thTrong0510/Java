package Regular_Expression;

import java.util.regex.*;

public class Regular_Expression {
	public static void main(String[] args) {
		//purpose: text search, text replace
		/*
		 Gồm 3 class chính: 
		 	Pattern class: định nghĩa hình thức search
		 	Matcher class: được sử dụng để search
		 	PatternSyntaxException class: xử lý exception về lỗi cú pháp
		 
		 Các kí hiệu: học ở regexone.com
		 	\d: đại diện cho 1 số từ 0-9
		 	.: đại diện cho 1 kí tự bất kì	\. là kí tự dấu '.'
		 	[]: khoảng chứa các loại kí tự hợp lệ
		 		[abc]trong: atrong, btrong, ctrong là hợp lệ
		 	^: nằm bên trong [] thì nghĩa phủ định 
		 		[^abc]trong: atrong, btrong, ctrong là không hợp lệ 
		 	-: khoảng kí tự hợp lệ
		 	{a,b}: số lần lặp kí tự min = a, max = b
		 	^..$: xét từ trái qa phải
		 	
		 	email: ^[A-Z0-9]+@[A-Z0-9]+\\.[A-Z][0-9]$ 
		 	dấu + thể hiện 1-n kí tự, \. thể hiện kí tự . trong code phải thêm \
		 
		 */
		
		//mẫu là "trong" và ko phân biệt hoa thường
		Pattern pattern = Pattern.compile("trong", Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher("Thanh Trong");
		if(matcher.find()) {
			System.out.println("co chu \"trong\" trong chuoi \"Thanh Trong\"");
		}
		else {
			System.out.println("Khong ton tai");
		}
	}
}
