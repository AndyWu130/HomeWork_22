package hw1;
import java.util.Scanner;

public class HW3 {
//	• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:
//
//	(提示:Scanner,三角形成立條件,判斷式if else)
//	(進階功能:加入直角三角形的判斷)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		
		System.out.println("請輸入");
		if(x==y&&y==z&&x!=0) {
			System.out.println("正三角形");
		}
//		else if(x==y||x==z) {
//			System.out.println(”等腰三角形“);
//		}
//		else if(x+y>z&&x+z>y&&y+z>x) {
//			System.out.println(”其他三角形“);
//		}
//		else {
//			System.out.println(”不是三角形“)
		}
		
	}
//}
