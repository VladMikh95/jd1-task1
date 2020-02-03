package by.htp.cycle.main;

import java.util.Scanner;

public class Two {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		run21();
		run22();
		run23();
		run24();
		run25();
		run26();
		run27();
		run28();
		run29();
		run30();
		run31();
		run32();
		run33();
		run34();
		run35();
		run36();
		run37();
		run38();
		run39();
		run40();
		scan.close();
	}
	
	/*
	 * Задача 21.  Составить программу для вычисления значений функции  F(x)
	 * на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый
	 * столбец которой – значения  аргумента, второй - соответствующие значения функции:
	 */
	public static void run21() {
		double a;
		double b;
		double h;
		
		double y;
		
		a = -120.0;	//значение в радианах
		b = 120.0;	//значение в радианах
		h = 20;		//значение в радианах
		
		System.out.println("Задача 21");
		System.out.println("Значения функции на отрезке [" + a + ", " + b 
				+ "] c шагом " + h);
		System.out.println("   x    |    y");
		for (double x = a; x <= b; x = x + h) {
			y = Math.round( (x - Math.sin(x)) * 10);
			y = y / 10;
			
			if (x <= -100.0) {
				System.out.println(x + "  |  " +y);
			} else if (x < 0.0) {
				System.out.println(x + "   |  " +y);
			} else if (x == 0.0) {
				System.out.println(x + "     |  " +y);
			} else if (x < 100) {
				System.out.println(x + "    |  " +y);
			} else {
				System.out.println(x + "   |  " +y);
			}
		}
		System.out.println("");	
	}
	
	/*
	 * Задача 22.  Составить программу для вычисления значений функции  F(x)
	 * на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый
	 * столбец которой – значения  аргумента, второй - соответствующие значения функции:
	 */
	public static void run22() {
		double a;
		double b;
		double h;
		
		double y;
		
		a = -120.0;	//значение в радианах
		b = 120.0;	//значение в радианах
		h = 20;		//значение в радианах
		
		System.out.println("Задача 22");
		System.out.println("Значения функции на отрезке [" + a + ", " + b 
				+ "] c шагом " + h);
		System.out.println("   x    |    y");
		for (double x = a; x <= b; x = x + h) {
			y = Math.round(  (Math.sin(x) * Math.sin(x)) * 10);
			y = y / 10;
			
			if (x <= -100.0) {
				System.out.println(x + "  |  " +y);
			} else if (x < 0.0) {
				System.out.println(x + "   |  " +y);
			} else if (x == 0.0) {
				System.out.println(x + "     |  " +y);
			} else if (x < 100) {
				System.out.println(x + "    |  " +y);
			} else {
				System.out.println(x + "   |  " +y);
			}
		}
		System.out.println("");	
	}
	
	/*
	 * Задача 23.  Составить программу для вычисления значений функции  F(x)
	 * на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый
	 * столбец которой – значения  аргумента, второй - соответствующие значения функции:
	 */
	public static void run23() {
		double a;
		double b;
		double h;
		
		double y;
		
		a = -120.0;	//значение в радианах
		b = 120.0;	//значение в радианах
		h = 20;		//значение в радианах
		
		System.out.println("Задача 23");
		System.out.println("Значения функции на отрезке [" + a + ", " + b 
				+ "] c шагом " + h);
		System.out.println("   x    |    y");
		
		for (double x = a; x <= b; x = x + h) {
			y = Math.round( (1 / Math.tan(x/3) + Math.sin(x) / 2) * 10);
			y = y / 10;
			
			if (x <= -100.0) {
				System.out.println(x + "  |  " +y);
			} else if (x < 0.0) {
				System.out.println(x + "   |  " +y);
			} else if (x == 0.0) {
				System.out.println(x + "     |  " +y);
			} else if (x < 100) {
				System.out.println(x + "    |  " +y);
			} else {
				System.out.println(x + "   |  " +y);
			}
		}
		
		System.out.println("");	
	}
	
	/*
	 * Задача 24. Вводится натуральное число. Найти сумму четных цифр, входящих
	 * в его состав. Преобразовать его в другое число, цифры которого будут 
	 * следовать в обратном порядке по сравнению с введенным числом.
	 */
	public static void run24() {
		int n;
		
		int i = 0; 
		int sum = 0;
		int newN = 0;
		
		n = 2125;
		
		System.out.println("Задача 24");
		System.out.print("Дано натуральное число " + n 
				+ " Cумма четных цифр равна: ");
		while (n > 0) {
			i = n % 10;

			if (i % 2 == 0) {
				sum = sum + i;
			}
			
			newN = newN * 10 + i;
			n = n / 10;
		}
		
		System.out.println(sum);
		System.out.println("Число наоборот: " + newN);
		System.out.println("");
	}
	
	/*
	 * Задача 25. Требуется определить факториал числа, которое ввел пользователь
	 */
	public static void run25() {
		int n;
		
		int result = 1;
		
		n = 5;
		
		System.out.println("Задача 25");
		System.out.println("Факториал числа " + n);
		
		if (n == 0) {
			System.out.println("1");
		}
		
		for (int i = n; i > 1; i--) {
			result = result * i;
		}
		
		System.out.println(result);
		System.out.println("");
	}
	
	/*
	 * Задача 26. Вывести  на  экран  соответствий  между символами и их 
	 * численными  обозначениями в памяти компьютера (Таблицу ASCII)
	 */
	public static void run26() {
		char ch;
		
		System.out.println("Задача 26");
		System.out.println("Таблица ASII");
		System.out.println("число | символ");
		
		for (int i = 0; i <= 255; i++) {
			ch = (char) i;
			System.out.println("  " + i +  "   |   " + ch);
		}
		
		System.out.println("");
	}
	
	/*
	 * Задача 27. Для каждого натурального числа в промежутке от m до n вывести 
	 * все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры
	 */
	public static void run27() {		
		int m;
		int n;
		
		System.out.println("Задача 27");
		System.out.print("Введите начало промежутка: ");
		
		m = scan.nextInt();
		
		System.out.print("Введите конец прмежутка: ");
		
		n = scan.nextInt();
		
		for (int i = m; i <= n; i++) {
			System.out.print("Делители числа " + i + ": ");
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					System.out.print(j + ", ");
				}
			}
			
			System.out.println("");
		}
		System.out.println("");
	}
	
	/*
	 * Задача 28. Написать программу, в которой вводятся два операнда Х и Y 
	 * и знак операции (+, –, /, *). Вычислить результат Z в зависимости от знака.
	 * Предусмотреть реакции на возможный неверный знак операции, а также  на  ввод
	 * Y=0  при  делении.  Организовать  возможность  многократных  вычислений  без
	 * перезагрузки программа (т.е. построить цикл). В качестве символа прекращения
	 * вычислений принять ‘0’
	 */
	public static void run28() {		
		int answer = 1;
		
		int x;
		int y;
		String a;
		
		double z;
		
		System.out.println("Задача 28");
		
		while (answer != 0 ) {
			System.out.print("Введите операнд Х: ");
			x = scan.nextInt();
					
			System.out.print("Введите операнд Y: ");
			y = scan.nextInt();
			if(y == 0) {
				System.out.println("Вы ввели неправильное число. Введите операнд Y:");
				y = scan.nextInt();
			}
			
			System.out.print("Введите знак операции: ");
			a = scan.next();
			System.out.print("Ответ равен: ");
			if (a.equals("+")) {
				z = x + y;
				System.out.println(z);
			} else if (a.equals("-") ) {
				z = x - y;
				System.out.println(z);
			} else if (a.equals("*")) {
				z = x * y;
				System.out.println(z);
			} else if (a.equals("/")) {
				z = (double) x / y;
				System.out.println(z);
			} else {
				System.out.print("Вы ввели что-то не то. Введите знак операции: ");
				a = scan.next();
			}
			
			System.out.println("Если хотите перейти к следующей задаче введите 0");
			System.out.println("Если хотите остаться введите другое число");
			answer = scan.nextInt();
			System.out.println("");
		}
	}
	
	/*
	 * Задача 29. Даны два числа. Определить цифры, входящие в запись как первого так
	 * и второго числа
	 */
	
	public static void run29() {
		int a;
		int b;
		int dubl;
		
		
		a = 105;
		b = 15;
		dubl = b;
		
		System.out.println("Задача 29");
		System.out.println("Даны числа " + a + ", " + b + ". Общие цифры: ");
		
		while (a > 0) {
			int i = a % 10;
			b = dubl;

			while (b > 0) {
				int j = b % 10;
				
				if (i  == j) {
					System.out.print(i + ", ");
				}
				
				b = b / 10;
			}
			
			a = a / 10;
		}
		
		
		System.out.println("");
	}
	
	/*
	 * Задача 30. Написать программу, переводящую римские цифры в арабские
	 */
	
	public static void run30() {
		char rome;
		
		rome = 'V';
		
		System.out.println("Задача 30");
		System.out.println("Дана римская цифра " + rome + ". Результат равен: ");
			
		switch(rome) {
		case 'I':
			System.out.println(1);
			break;
			
		case 'V':
			System.out.println(5);
			break;
			
		case 'X':
			System.out.println(10);
			break;
			
		case 'L':
			System.out.println(50);
			break;
			
		case 'C':
			System.out.println(100);
			break;
			
		case 'D':
			System.out.println(500);
			break;
			
		case 'M':
			System.out.println(1000);
			break;
			
		default:
			System.out.println("Таких римских цифр не существует");
			break;
		}
		System.out.println("");
	}
	
	/*
	 * Задача 31. Компьютер  генерирует  пять  чисел  в  диапазоне  от  1  
	 * до  15  включительно.  Человек  пытается  их угадать.  Программа  должна
	 * выводить  угаданные  и  неугаданные  числа  из  тех,  что  сгенерировала
	 * программа, а также ошибочные числа пользователя
	 */
	
	public static void run31() {
		int[] numbers = new int[5];
		int[] answers = new int[5];
		
		for (int i = 0; i < 5; i++) {
			numbers[i] = (int) (Math.random() * 15 + 1);
		}
		
		System.out.println("Задача 31");
		System.out.println("Введите 5 разных чисел от 1 до 15 включительно:");
		
		for(int i = 0; i < 5; i++) {
			answers[i] = scan.nextInt();
		}
		
		System.out.print("Вы угадали следующие числа: ");
		for (int i : numbers) {
			for (int j : answers) {
				if(i == j) {
					System.out.print(j + ", ");
				}
			}
		}
		System.out.println("");
		
		System.out.print("Вы не угадали следующие числа: ");
		for (int i : numbers) {
			int a = 0;
			for (int j : answers) {
				if (i != j) {
					a++;
				}
			}
			
			if (a == 5) {
				System.out.print(i + ", ");
			}
			
		}
		System.out.println("");
		
		System.out.print("Вы ошибочно ввели следующие числа: ");
		for (int i : answers) {
			int a = 0;
			for (int j : numbers) {
				if (i != j) {
					a++;
				}
			}
			
			if (a == 5) {
				System.out.print(i + ", ");
			}
			
		}
		System.out.println("");
	}
	
	/*
	 * Задача 32. Проверить  введенную  пользователем  строку  на  наличие  
	 * недопустимых  символов.  В  качестве первого  символа  допустимы  только  
	 * буквы  и  знак  подчеркивания.  Остальные  символы  могут  быть буквами, 
	 * цифрами и знаком подчеркивания
	 */
	
	public static void run32() {
		String str;
		int i;
		boolean isCorrect = true;
		
		System.out.println("Задача 32");
		System.out.println("Введите строку:");
		
		str = scan.next();
		
		for(int j = 0; j < str.length(); j++) {
			i = (int) str.charAt(j);
			if (j == 0) {
				if ( (i < 64) 
						|| ((i > 90) && (i < 95)) 
						|| (i == 96) 
						|| ((i > 122) && (i < 192))) {
					System.out.println("Вы ввели строку с недопустимыми символами");
					isCorrect = false;
					break;
				}
			} else {
				if ( (i < 48)  
						|| ((i > 57) && (i < 64))
						|| ((i > 90) && (i < 95)) 
						|| (i == 96) 
						|| ((i > 122) && (i < 192))) {
					System.out.println("Вы ввели строку с недопустимыми символами");
					isCorrect = false;
					break;
				}
			}
		}
		
		if (isCorrect) {
			System.out.println("Вы ввели строку корректно");
		}
		System.out.println("");
	}
	
	/*
	 * Задача 33. Найдите наибольшую цифру данного натурального числа
	 */
	
	public static void run33() {
		int n;
		
		int i;
		int max = 0;
		
		n = 1432;
		
		System.out.println("Задача 33");
		System.out.print("Дано натуральное число " + n 
				+ ". Наибольшая цифра этого числа равна: ");
		
		while (n > 0) {
			i = n % 10;

			if (i > max) {
				max = i;
			}
			
			n = n / 10;
		}
		
		System.out.println(max);
		System.out.println("");
	}
	
	/*
	 * Задача 34. Найдите все четырехзначные числа, сумма цифр каждого из которых 
	 * равна 15
	 */
	
	public static void run34() {
		int a;
		
		System.out.println("Задача 34");
		System.out.println("Четырёхзначные числа, сумма цифр которых равна 15:");
		
		for (int i = 1000; i <= 9999; i++) {
			int sum = 0;
			int num = i;
			
			for (int j = 0; j < 4; j++) {
				a = num % 10;
				sum = sum + a;
				num = num / 10;
				
			}
			if (sum == 15) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		System.out.println("");
	}
	
	/*
	 * Задача 35. Найдите количество четных цифр данного натурального числа
	 */

	public static void run35() {
		int n;
		
		int i;
		int even = 0;
		
		n =13254;
		
		System.out.println("Задача 35");
		System.out.println("Дано натуральное число " + n 
				+ ". Количество четных цифр этого числа равно:");
		
		while (n > 0) {
			i = n % 10;

			if (i % 2 == 0) {
				even++;
			}
			
			n = n / 10;
		}
		
		System.out.println(even);
		System.out.println("");
	}
	
	/*
	 * Задача 36.  Два  двузначных  числа,  записанных  одно  за  другим, 
	 * образуют четырёхзначное число, которое делится на их произведение. 
	 * Найти эти числа
	 */
	
	public static void run36() {
		int a;
		int b;
		System.out.println("Задача 36");
		System.out.println("Результат: ");
		for (int i = 1000; i <= 9999; i++) {
			a = i % 100;
			b = i / 100;
			if  ( (a * b != 0) && (i % (a * b)) == 0) {
				System.out.println(i + " ");
			}
		}
		
		System.out.println("");
	}
	
	/*
	 * Задача 37. Даны два двузначных числа А и В. Из этих чисел составили 
	 * 2 четырехзначных числа: первое число получили путем написания сначала числа А,
	 * затем В. Для получения второго числа сначала записали число В, затем А.
	 * Найти числа А и В если известно , что первое четырехзначное число нацело 
	 * делится на 99, а второе на 49
	 */
	
	public static void run37() {
		int a;
		int b;
				
		System.out.println("Задача 37");
		System.out.println("Результат: ");
		
		for (int x = 1000; x <= 9999; x++) {
			if (x % 99 == 0) {
				for (int y = 1000; y <= 9999; y++) {
					if ((y % 49 == 0) 
							&& (x % 100 == y / 100) 
							&& (x / 100 == y % 100)) {
						a = x / 100;
						b = x % 100;
						System.out.println("Число А = " + a + ", число B = " + b);
					}
				}
			}
		}
		
		System.out.println("");
	}
	
	/*
	 * Задача 38. Для заданного натурального числа определить, образуют ли его цифры 
	 * арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр. 
	 * Например: 1357, 963
	 */
	
	public static void run38() {
		int n;
		int a;
		int diff;
		boolean isCorrect = true;
		
		n = 123456;
		
		System.out.println("Задача 38");
		System.out.println("Дано натуральное число " + n 
				+ ". Образуют ли его числа арифметическую прогрессию?");
		a = n % 10;
		n = n / 10;
		diff = n % 10 - a;	//разность межу предпоследней и последней цифрой
		a = n % 10;
		n = n / 10;
		while (n > 0) {
			if (diff != (n % 10 - a)) {
				System.out.println("Нет");
				isCorrect = false;
				break;
			}
			a = n % 10;
			n = n / 10;
		}
		
		if(isCorrect) {
			System.out.println("Да");
		}
		
		System.out.println("");
	}
	
	/*
	 * Задача 39. В трехзначном числе зачеркнули старшую цифру. Когда полученное
	 * число умножили на 7, то получили исходное число. Найти это число
	 */
	
	public static void run39() {
		
		System.out.println("Задача 39");
		System.out.println("Искомое число равно:");
		
		for (int i = 100; i < 999; i++) {
			if (i == (i % 100) * 7) {
				System.out.println(i);
			}
		}
		System.out.println("");
	}
	
	/*
	 * Задача 40. Получить все числа, не превышающие заданного числа N, которые делятся
	 * без остатка на все свои цифры
	 */
	public static void run40() {
		int n;
		
		n = 113;
		
		System.out.println("Задача 40");
		System.out.println("Числа менее " + n + "которые делятся без остатка "
				+ "на все свои цифры");
		
		for (int j = 1; j < n; j++) {
			int a = j;
			int i;
			boolean isDivide = true;
			
			while (a > 0) {
				i = a % 10;

				if ( (i == 0) || (j % i != 0)) {
					isDivide = false;
					break;
				}
		
				a = a / 10;
			}
			
			if(isDivide) {
				System.out.print(j + " ");
			}
		}
		
		System.out.println("");
	}
	
}
