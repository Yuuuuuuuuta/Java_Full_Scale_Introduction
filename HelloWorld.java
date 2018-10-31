import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class HelloWorld{
	public static void main(String[] args) {
		System.out.println("Hello Java World!");

		int numberA;
		numberA =10 ;
		System.out.println(numberA);

		int numberB = 20;
		int numberC = numberA + numberB ;
		System.out.println(numberC) ;

		System.out.println(++numberA);
		System.out.println(numberA);
		System.out.println(numberA++);
		System.out.println(numberA);

		boolean result = numberA > numberB;

		System.out.println(result);

		int numberD = numberA > 0 ? 1 : -1 ;
		System.out.println(numberD);

		boolean conditionA = true ;
		boolean conditionB = false ;
		boolean resultB = conditionA || conditionB ;
		System.out.println(resultB);


		int number = 0x12345678 ;
		int lower = number & 0x0000ffff ;
		System.out.printf("lower = %x\n", lower);

		int higher = number >> 16 ;
		System.out.printf("higher = %x\n", higher);

		int num = 0 ;
		num += 100 ;
		System.out.println(num);

		String message = "Hello" + "Java";
		message += "World" ;
		System.out.println(message);

		int second = LocalDateTime.now().getSecond();

		if(second % 2 == 0) {
			System.out.println(second + "は偶数です。");
		}else {
			System.out.println(second + "は奇数です。");
		}

		int month = LocalDate.now().getMonthValue();

		if(3 <= month && month <= 5) {
			System.out.println(month + "月は春です。");
		}else if(6 <= month && month <= 8) {
			System.out.println(month + "月は夏です。");
		}else if (9 <= month && month <= 11) {
			System.out.println(month + "月は秋です。");
		}else {
			System.out.println(month + "月は冬です。");
		}

		Month month2 = LocalDateTime.now().getMonth();

		switch (month2) {
			case MARCH:
			case APRIL:
			case MAY:
				System.out.println(month2 + "は春です");
				break;
			case JUNE:
			case JULY:
			case AUGUST:
				System.out.println(month2 + "は夏です");
				break;
			case SEPTEMBER:
			case OCTOBER:
			case NOVEMBER:
				System.out.println(month2 + "は秋です");
				break;
			default:
				System.out.println(month2 + "は冬です");
				break;

		}

		int sum = 0 ;
		for(int i = 0 ; i <= 10 ; i++) {
			sum += i;
			System.out.println(i + "回目:" + sum);
		}

		int[] numbers = {1,1,2,3,5,8,13,21};
		for(int number2 : numbers) {
			System.out.println(number2);
		}

		Scanner in = new Scanner(System.in);
		System.out.println("パスワードを入力してください");
		String str = in.nextLine();

		while(true) {
			if(str.equals("abc")) {
				break;
			}
			System.out.println("パスワードが違います。正しいパスワードを入力してください。");
			str = in.nextLine();
		}
		System.out.println("OK!");

	}


}