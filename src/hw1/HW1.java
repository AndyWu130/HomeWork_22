package hw1;

public class HW1 {
	public static void main(String[] args) {{
//•A 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int num1=12; int num2=6; 
		System.out.println("12,6和為："+(num1+num2));
		System.out.println("12,6積為："+num1*num2);
		System.out.println("--------------------------------");
//•B 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggs=200; int dozen=eggs/12; int egg=eggs%12;
		System.out.println("200顆蛋共是"+dozen+"打又"+egg+"顆");
		System.out.println("--------------------------------");
//•C 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int secs = 256559;
		System.out.println(
				secs / 86400 + "天" + secs % 86400 / 3600 + "小時" + secs % 86400 % 3600 / 60 + "分鐘" + secs % 60 + "秒");
		System.out.println("--------------------------------");
//•D 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double pi=3.1415; int r=5;
		System.out.println("圓面積為"+(pi*r*r));
		System.out.println("圓周長為"+(2*pi*r));
		System.out.println("--------------------------------");
//•E 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		double principal = 1500000; 
		double rate = 0.02; 
		int years = 10 ;
		for(int year= 1 ; year <= years ;year++) {
			principal=principal*(1+rate);}
			System.out.println("十年後本金加利息為"+principal);
			System.out.println("--------------------------------");
//•F 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//			5 + 5
//			5 + ‘5’
//			5 + “5”
//			並請用註解各別說明答案的產生原因
		System.out.println(5 + 5+" 就是單純5+5");
		System.out.println(5 + '5'+" 因為單引號會轉成字元ASCII值為53,所以是5+53");
		System.out.println(5+"5"+" 第一個5是整數,第二個5加了雙引號“”所以是字串,這時候會進行字串串聯,整數5被轉成字串和字串5相連所以是55字串");
		System.out.println("--------------------------------");
}}}