
public class sample0618 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		java.util.Scanner test = new java.util.Scanner(System.in);
		System.out.print("選擇 圓形,正方形,長方形 ?");
		String input = test.next();
		
		switch(input){
		case "圓形":
			System.out.print("輸入 半徑");
			int r = test.nextInt();
			System.out.print("選擇 周長,面積 ？");
			String q = test.next();
			switch(q) {
			case "周長":
				System.out.print("周長="+r*2*3.14159);
				break;
			case "面積":
				System.out.print("面積＝"+r*r*3.14159);
				break;
			default:
				System.out.print("failure");
			}
			break;
		case "正方形":
			System.out.print("輸入 邊長");
			int l = test.nextInt();
			System.out.print("選擇 周長,面積 ？");
			String w = test.next();
			switch(w) {
			case "周長":
				System.out.print("周長="+l*4);
				break;
			case "面積":
				System.out.print("面積＝"+l*l);
				break;
			default:
				System.out.print("failure");
			}
			break;
		case "長方形":
			System.out.print("輸入 長邊");
			int ll = test.nextInt();
			System.out.print("輸入 短邊");
			int sl = test.nextInt();
			System.out.print("選擇 周長,面積 ？");
			String e = test.next();
			switch(e) {
			case "周長":
				System.out.print("周長="+(ll+sl)*2);
				break;
			case "面積":
				System.out.print("面積＝"+ll*sl);
				break;
			default:
				System.out.print("failure");
			}
			
			
		
		
		}
			
			
			
		
		
		
		
		
		
		/*
		System.out.print("input score");
		int score = test.nextInt();
		int level = (score/10);
		
		switch(level) {
		
		case 10:
		case 9:
			System.out.print("A");
		break;
		case 8:
			System.out.print("B");
		break;
		case 7:
			System.out.print("C");
		break;
		
		case 6:
			System.out.print("D");
		break;
		
		default:
			System.out.print("failure");
		
		}
		
		
		
		
		
		
		
		/*

		System.out.print("input a int");
		int input = test.nextInt();

		if (input % 2 == 0)
			{
			System.out.print("int is O");}
		else
		{System.out.print("int is G");
		}

		
		
		
		/*
		 * 
		 * System.out.print("input int"); int input1 = test.nextInt();
		 * 
		 * System.out.print("input flot"); double input2 = test.nextDouble();
		 * 
		 * System.out.print("input boolean"); boolean input3 = test.nextBoolean();
		 * 
		 * System.out.print("input char"); char input4 = test.next().charAt(1);
		 * 
		 * System.out.print("input str"); String input5 = test.next();
		 * 
		 * System.out.println("int:" + input1); System.out.println("flot:" + input2);
		 * System.out.println("collean:" + input3); System.out.println("cha:" + input4);
		 * System.out.println("str:" + input5);
		 * 
		 * test.close();
		 */

	}

}
