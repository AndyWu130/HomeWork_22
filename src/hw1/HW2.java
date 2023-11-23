package hw1;

public class HW2 {
	public static void main(String[] args) {
//A• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		int x = 0;
		for (x = 0; x <= 1000; x += 2)
			sum += x;
		System.out.println(sum);
		System.out.println("------------------------");
//B• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sum1 = 1;
		int x1 = 1;
		for (x1 = 1; x1 <= 10; x1++)
			sum1 = sum1 * x1;
		System.out.println(sum1);
		System.out.println("------------------------");
//C• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)	
		while (x1 <= 10) {
			sum1 = sum1 * x1;
			x1++;
		}
		System.out.println(sum1);
		System.out.println("------------------------");
//D• 請設計一隻Java程式,輸出結果為以下:
//			1 4 9 16 25 36 49 64 81 100
		int y = 1;
		for (y = 1; y <= 10; y++)
			System.out.print(y * y + " ");
		System.out.println();
		System.out.println("------------------------");
//E• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int lot = 1;
		int sum3 = 0;
		for (lot = 1; lot <= 49; lot++)
			if (lot % 10 != 4) {
				if (lot < 40) {
					System.out.print(lot + " ");
					sum3 += 1;
				}
			}
		System.out.println();
		System.out.println(sum3);
		System.out.println("------------------------");
//F• 請設計一隻Java程式,輸出結果為以下:
//			1 2 3 4 5 6 7 8 9 10
//			1 2 3 4 5 6 7 8 9
//			1 2 3 4 5 6 7 8
//			1 2 3 4 5 6 7
//			1 2 3 4 5 6
//			1 2 3 4 5
//			1 2 3 4
//			1 2 3
//			1 2
//			1
		int i = 1;
		int j = 1;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 11 - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("------------------------");
//G• 請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		int q = 1;
		int w = 1;
		for (q = 1; q <= 6; q++) {
			for (w = 1; w <= q; w++)
				System.out.print((char) (64 + q));
			System.out.println();
		}System.out.println("------------------------");
	}
}
