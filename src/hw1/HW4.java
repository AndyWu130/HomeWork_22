package hw1;

public class HW4 {
	public static void main(String[] args) {
//		• 有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)
		int array[]= {29,100,39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for(int i =0;i<array.length;i++) {
			sum += array[i];
		}System.out.println("此陣列元素平均值為"+sum/array.length);
		for(int i =0;i<array.length;i++) {
			if(array[i]>52) {
				System.out.print(array[i]+" ");
			}
		}
//	• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
		String s = "Hello World";
		String s = new String s.reverse;
		System.out.print(String s.reverse());
	}
}

	

