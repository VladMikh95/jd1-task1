package by.htp.cycle.main;

public class One {

	public static void main(String[] args) {
		run1();
		run2();
		run3();
		run4();
		run5();
		run6();
		run7();
		run8();
		run9();
		run10();
		run11();
		run12();
		run13();
		run14();
		run15();
		run16();
		run17();
		run18();
		run19();
		run20();
	}
	
	/*
	 * Задача 1.  Необходимо вывести на экран числа от 1 до 5
	 */
	public static void run1() {
		System.out.println("Задача 1");
		System.out.println("Вывод чисел на экран от 1 до 5");
		
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}
		System.out.println("");
	}
	
	/*
	 * Задача 2.  Необходимо вывести на экран числа от 5 до 1
	 */
	public static void run2() {
		System.out.println("Задача 2");
		System.out.println("Вывод чисел на экран от 5 до 1");
		
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("");
	}
	
	/*
	 * Задача 3.  Необходимо вывести на экран таблицу умножения на 3
	 */
	public static void run3() {
		int x;
		
		System.out.println("Задача 3");
		System.out.println("Таблица умножения на 3");
		
		for (int i = 1; i < 11; i++) {
			x = i * 3;
			System.out.println("3 X " + i + " = " + x);
		}
		System.out.println("");
		
	}
	
	/*
	 * Задача 4.  С помощью оператора while напишите программу вывода всех четных 
	 * чисел в диапазоне от 2 до 100 включительно
	 */
	public static void run4() {
		int i = 2;
		
		System.out.println("Задача 4");
		System.out.println("Четные числа от 2 до 100:");
		while (i < 101) {
			System.out.println(i);
			i = i + 2;
		}
		System.out.println("");
	}
	
	/*
	 * Задача 5. С  помощью  оператора  while  напишите  программу  определения  суммы
	 * всех  нечетных  чисел  в диапазоне от 1 до 99 включительно
	 */
	public static void run5() {
		int i = 1;
		int sum = 0;
		
		System.out.println("Задача 5");
		System.out.print("Сумма всех нечетных  чисел  в диапазоне от 1 до 99 "
				+ "включительно равна: ");
		
		while (i < 100) {
			sum = sum + i;
			i = i + 2;
		}
		
		System.out.println(sum);
		System.out.println("");
	}
	
	/*
	 * Задача 6. Напишите  программу,  где  пользователь  вводит любое  целое  
	 * положительное  число. А  программа суммирует все числа от 1 до введенного 
	 * пользователем числа
	 */
	public static void run6() {
		int a;
		
		int sum = 0;
		
		a = 5;
		
		System.out.println("Задача 6");
		System.out.print("Число А равно " + a + ". Сумма чисел от 1 до А равна: ");
		
		for (int i = 1; i <= a; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		System.out.println("");
	}
	
	/*
	 * Задача 7. Вычислить значения функции на отрезке [а,b] c шагом h:
	 */
	public static void run7() {
		int a;
		int b;
		int h;
		
		int y;
		
		a = -1;
		b = 5;
		h = 2;
		
		System.out.println("Задача 7");
		System.out.println("Значения функции на отрезке [" + a + ", " + b 
				+"] c шагом " + h + " равны:");
		for (int x  = a; x <= b; x = x + h) {
			if (x > 2) {
				y = x;
			} else {
				y = - x;
			}
			System.out.println(y);
		}
		
		System.out.println("");
	}
	
	/*
	 * Задача 8. Вычислить значения функции на отрезке [а,b] c шагом h:
	 */
	public static void run8() {
		int a;
		int b;
		int h;
		int c;
		
		int y;
		
		a = -3;
		b = 9;
		h = 3;
		c = 2;
		
		System.out.println("Задача 8");
		System.out.println("Значения функции на отрезке [" + a + ", " + b 
				+"] c шагом " + h + " равны:");
		for (int x  = a; x <= b; x = x + h) {
			if (x == 15) {
				y = (x + c) * 2;
			} else {
				y = x - c + 6;
			}
			System.out.println(y);
		}
		
		System.out.println("");
	}
	
	/*
	 * Задача 9. Найти сумму квадратов первых ста чисел
	 */
	public static void run9() {
		int sum = 0;
		
		System.out.println("Задача 9");
		System.out.println("Сумма квадратов первых 100 чисел");
		
		for(int i = 1; i <= 100; i++) {
			sum = sum + i * i;
		}
		
		System.out.println(sum);
		System.out.println("");
	}
	
	/*
	 * Задача 10. Составить программу нахождения произведения квадратов первых 
	 * двухсот чисел
	 */
	public static void run10() {
		Long mult = 1L;
		
		System.out.println("Задача 10");
		System.out.println("Произведение квадратов первых 200 чисел");
		
		for(int i = 1; i <= 200; i++) {
			mult = mult * i * i;
		}
		/*
		 * Результат равен 0,т.к. при выполнении цикла уже на 14 шаге произошло первое
		 * переполнение числа. В дальнейшем при выполнении цикла на 34 шаге произошло
		 * переполнение,которое привело к тому, что переменная mult = 0, а результат
		 * умножение любого числа на 0 всегда равно 0
		 *  
		 */
		System.out.println(mult);
		System.out.println("");
	}
	
	/*
	 * Задача 11.  Составить программу нахождения разности кубов первых двухсот
	 * чисел
	 */
	public static void run11() {
		int diff = 1;
		
		System.out.println("Задача 11");
		System.out.println("Разность кубов первых 200 чисел");
		
		for(int i = 2; i <= 200; i++) {
			diff = diff - i * i * i;
		}
		
		System.out.println(diff);
		System.out.println("");
	}
	
	/*
	 * Задача 12.  Последовательность  аn строится  так:  а1 =  1,  an =6+  аn-1 ,
	 * для  каждого  n  >1  Составьте  программу нахождения произведения первых 10
	 *  членов этой последовательности.
	 */
	public static void run12() {
		int a = 1;
		long mult = 1L;
		
		System.out.println("Задача 12");
		System.out.println("Произведение первых 10 членов последовательности равно");
		
		for (int i = 2; i <= 10; i++) {
			a = a + 6;
			mult = mult * a;
		}
		
		System.out.println(mult);
		System.out.println("");
	}
	
	/*
	 * Задача 13. Составить таблицу значений функции y = 5 - x^2/2 
	 * на отрезке [-5; 5] с шагом 0.5
	 */
	public static void run13() {
		double y;
		
		System.out.println("Задача 13");
		System.out.println("  x   |    y");
		
		for (double x = - 5; x <= 5; x = x + 0.5) {
			y = 5 - x * x / 2;
			
			if (x < 0) {
				System.out.println(x + "  |  " + y);
			} else {
				System.out.println(x + "   |  " + y);
			}
			
		}
		
		System.out.println("");
	}
	
	/*
	 * Задача 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
	 */
	public static void run14() {
		int n;
		
		double result = 0;
		
		n = 5;
		
		System.out.println("Задача 14");
		System.out.println("Если n = " + n + ", то результат выражения равен:");
		
		for (int i = 1; i <= n; i++) {
			result = result + 1.0 / i;
		}
		
		System.out.println(result);
		System.out.println("");
	}
	
	/*
	 * Задача 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени
	 */
	public static void run15() {
		int result = 0;
		
		System.out.println("Задача 15.");
		System.out.println("Результат выражения 1+2+4+8+...+ 2 в 10 степени равен:");
		
		for(int i = 0; i <= 10; i++) {
			double d = i;
			result = result + (int) Math.pow(2, d);	
		}
		System.out.println(result);
		System.out.println("");
	}
	
	/*
	 * Задача 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)
	 */
	public static void run16() {
		int a = 0;
		long mult = 1L;
		
		System.out.println("Задача 16");
		System.out.println("Выражение (1+2)*(1+2+3)*...*(1+2+...+10) равно");
		
		for (int i = 1; i <= 10; i++) {
			a = a + i;
			mult = mult * a;
		}
		
		System.out.println(mult);
		System.out.println("");
	}
	
	/*
	 * Задача 17. Даны действительное (а) и натуральное (n). 
	 * вычислить: a(a+1)...(a+n-1)
	 */
	public static void run17() {
		double a;
		int n;
		
		double mult;
		
		a = 1.0;
		n = 5;
		mult = a;
		
		System.out.println("Задача 17");
		System.out.println("Число а = " + a + ", a n = " + n 
				+ ". Выражение a(a+1)...(a+n-1) равно:");
		
		for (int i = 1; i < n; i++) {
			a = a + 1;
			mult = mult * a; 
		}
		
		System.out.println(mult);
		System.out.println();
	}
	
	/*
	 * Задача 18.  Даны числовой ряд и некоторое число е. Найти сумму 
	 * тех членов ряда, модуль которых больше или равен заданному е. 
	 * Общий член ряда имеет вид
	 */
	public static void run18() {
		int n;
		double e;
		
		double a;
		double sum = 0; 
		
		n = 10;
		e = 0.5;
		
		System.out.println("Задача 18");
		System.out.println("Ряд состоит из " + n + " элементов. Число e = " 
				+ e + ". Ответ:");
		
		for(int i = 1; i <= n; i++) {
			a = Math.abs( Math.pow(-1.0, (i - 1)) / i);
			if(a >= e) {
				sum = sum + a;
			}
		}
		System.out.println(sum);
		System.out.println("");
	}
	
	/*
	 * Задача 19.  Даны числовой ряд и некоторое число е. Найти сумму 
	 * тех членов ряда, модуль которых больше или равен заданному е. 
	 * Общий член ряда имеет вид
	 */
	public static void run19() {
		int n;
		double e;
		
		double a;
		double sum = 0; 
		
		n = 10;
		e = 0.6;
		
		System.out.println("Задача 19");
		System.out.println("Ряд состоит из " + n + " элементов. Число e = " 
				+ e + ". Ответ:");
		
		for(int i = 1; i <= n; i++) {
			a = Math.abs( Math.pow(2, -i) + Math.pow(3, -i));
			if(a >= e) {
				sum = sum + a;
			}
		}
		
		System.out.println(sum);
		System.out.println("");
	}
	
	/*
	 * Задача 20.  Даны числовой ряд и некоторое число е. Найти сумму 
	 * тех членов ряда, модуль которых больше или равен заданному е. 
	 * Общий член ряда имеет вид
	 */
	public static void run20() {
		int n;
		double e;
		
		double a;
		double sum = 0; 
		
		n = 10;
		e = 0.1;
		
		System.out.println("Задача 20");
		System.out.println("Ряд состоит из " + n + " элементов. Число e = " 
				+ e + ". Ответ:");
		
		for(int i = 1; i <= n; i++) {
			a = Math.abs( 1 / (3 * i - 2) / (3 * i + 1));
			if(a >= e) {
				sum = sum + a;
			}
		}
		
		System.out.println(sum);
		System.out.println("");
	}
}
