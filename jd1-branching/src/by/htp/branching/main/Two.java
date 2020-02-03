package by.htp.branching.main;

import java.util.Scanner;

public class Two {

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
	}	
	
	/*
	 *  Задача 21.  Программа  —  льстец.  На  экране  высвечивается  вопрос  «Кто
	 *  ты:  мальчик  или  девочка? Введи  Д  или  М».  В зависимости от ответа на
	 *  экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся 
	 *  мальчики!»
	 */
	public static void run21() {
		char a;
		
		a = 'M';
		
		System.out.println("Задача 21");
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		System.out.println(a);
		if(a == 'M') {
			System.out.println("Мне нравятся мальчики!");
		} else if(a == 'Д') {
			System.out.println("Мне нравятся девочки!");
		} else {
			System.out.println("Ты ввел что-то не то(");
		}
		System.out.println("");
	} 
	
	/*
	 *  Задача 22. Перераспределить значения переменных х и у так, чтобы в х 
	 *  оказалось большее из этих значений, а в y - меньшее
	 */
	public static void run22() {
		int x;
		int y;
		
		x = 11;
		y = 12;
		System.out.println("Задача 22");
		System.out.print("Даны числа: x = " + x + ", y = " + y + ". "
						 + "В результате получим ");
		if (x < y) {
			System.out.println("x = " + y + ", y = " + x);
		} else {
			System.out.println("x = " + x + ", y = " + y);
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 23. Определить правильность даты, введенной с клавиатуры (число —
	 *   от 1 до 31, месяц — от 1 до 12). Если введены  некорректные данные, то 
	 *   сообщить об этом
	 */
	public static void run23() {
		Scanner scan = new Scanner(System.in);
		int d;
		int m;
		
		
		System.out.println("Задача 23");
		System.out.println("Введите день (номер)");
		d = scan.nextInt();
		System.out.println("Введите месяц (номер)");
		m = scan.nextInt();
		scan.close();
		if (m == 2) {
			if ((d < 1) || (d > 28)) {
				System.out.println("Вы ввели некорректные данные");
			} else {
			System.out.println("Вы ввели корректные данные");
			}
		} else if ((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 8) 
				      || (m == 10) || (m == 12)) {
			if ((d < 1) || (d > 31)) {
				System.out.println("Вы ввели некорректные данные");
			} else {
				System.out.println("Вы ввели корректные данные");
			}
		} else if ((m == 4) || (m == 6) || (m == 9) || (m == 11)) {
			if ((d < 1) || (d > 30)) {
				System.out.println("Вы ввели некорректные данные");
			} else {
				System.out.println("Вы ввели корректные данные");
			}
		} else {
			System.out.println("Вы ввели некорректные данные");
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 24. Составить программу, определяющую результат гадания на ромашке 
	 *  — «любит—не любит», взяв за исходное	данное количество лепестков n 
	 */
	public static void run24() {
		int n;
		
		n = 15;
		
		System.out.println("Задача 25");
		System.out.print("Результат гадания на ромашке с " +  n);
		System.out.print(" лепестками равен: ");
		if ( (n % 2) == 1) {
			System.out.println("любит");
		} else {
			System.out.println("не любит");
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 25. Написать  программу  —  модель  анализа  пожарного  датчика
	 *  в  помещении, которая  выводит  сообщение «Пожароопасная ситуация », 
	 *  если температура в комнате превысила 60° С
	 */	
	public static void run25() {
		int t;
		
		t = 54;
		
		System.out.println("Задача 25");
		System.out.print("Сообщение, которое выводит пожарная система при");
		System.out.print(" темературе " + t + ": ");
		if (t > 60) {
			System.out.println("Пожароопасная ситуация");
		} else {
			System.out.println("Все в порядке");
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 26. Написать программу нахождения суммы большего и меньшего из
	 *  трех чисел.
	 */
	public static void run26() {
		int a;
		int b;
		int c;
		
		int max;
		int min;
		
		a = 13;
		b = 21;
		c = 3;
		
		System.out.println("Задача 26");
		System.out.print("Сумма большего и меньшего из трех чисел ");
		System.out.print(a + ", " + b + ", " + c + " равна: ");
		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		
		if (c < min) {
			min = c;
		}
		
		if (c > max) {
			max = c;
		}
		System.out.println(min + max);
		System.out.println("");
	}
	
	/* 
	 * Задача 27. Найти max{min(a, b), min(c, d)}.
	 */
	public static void run27() {
		int a;
		int b;
		int c;
		int d;
		
		a = 23;
		b = 17; 
		c = 6; 
		d = 47;
		
		System.out.println("Задача 27");
		System.out.print("Дано: a = " + a + ", b = " + b + ", c = " + c);
		System.out.print(", d = " + d + ". Ответ: ");
		if (b < a) {
			a = b;
		}
		
		if (d < c) {
			c = d;
		}
		
		if (a < b) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}
		System.out.println("");
	}
	
	/*
	 * Задача 28. Даны три числа a, b, с. Определить, какое из них равно d. 
	 * Если ни одно не равно d, то найти max(d — a, d — b, d — c)
	 */
	public static void run28() {
		int a;
		int b;
		int c;
		int d;
		
		a = 12;
		b = 4;
		c = 3;
		d = 12;
		
		System.out.println("Задача 28");
		System.out.print("Дано: a =" + a + ", b = " + b + ", c = " + c);
		System.out.print(". Числа, которые равны k = " + d + ":");
		if (a == d) {
			System.out.print(" a,");
		} else if (b == d) {
			System.out.print(" b,");
		} else if (c == d) {
			System.out.print(" c,");
		} else {
			System.out.print(" таких чисел нет, значит ответ будет ");
			d = d - Math.min(a, Math.min(b, c));
			System.out.print(d);
		}
		System.out.println("");
		System.out.println("");
	}
	
	/*
	 * Задача 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
	 * Определить, будут ли они расположены на одной прямой
	 */
	public static void run29() {
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
		
		int i;
		
		x1 = 3;
		y1 = 6;
		x2 = 4;
		y2 = 8;
		x3 = 1;
		y3 = 2;
		
		System.out.println("Задача 29");
		System.out.print("Даны три точки А(" + x1 + ", " + y1 + "), B(" + x2);
		System.out.print(", " + y2 + "), C(" + x3 + ", " + y3 + "). ");
		System.out.print("Расположены ли эти точки на одной плоскости? ");
		// Для проверки используется формула нахождения площади треугольника
		// 1/2 опускается, т. к. она не влияет на проверку
		i = (x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3);
		if (i == 0) {
			System.out.println("Да");
		} else {
			System.out.println("Нет");
		}
		System.out.println("");
	}
	
	/*
	 * Задача 30. Даны действительные числа а,b,с. Удвоить эти числа, 
	 * если а > b > с, и заменить их абсолютными значениями, если это не так
	 */
	public static void run30() {
		int a;
		int b;
		int c;
		
		a = 32;
		b = -3;
		c = 0;
		
		System.out.println("Задача 30");
		System.out.print("Дано: a = " + a + ", b = " + b + ", c = " + c + ". ");
		if ((a > b) && (b > c)) {
			a = a * 2;
			b = b * 2;
			c = c * 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		System.out.println("Результат: a = " + a + ", b = " + b + ", c = " + c);
		System.out.println("");
	}
	
	/*
	 * Задача 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z 
	 * кирпича. Определить, пройдет ли кирпич через отверстие
	 */
	public static void run31() {
		int a;
		int b;
		int x;
		int y;
		int z;
		
		int m;
		int s;
		
		a = 40;
		b = 15;
		x = 40;
		y = 20;
		z = 15;
		
		System.out.println("Задача 31");
		System.out.println("Размеры прямоугольного отверстия " + a + " X " + b 
				 		 + ", размеры кирпича " + x + " X " + y + " X " + z + ".");
		System.out.print("Пройдет ли кирпич через отверстие? ");
		s = Math.min(x, Math.min(y, z)); // min сторона кирпича
		m = findAverage(x, y, z); // средняя сторона кирпича
		if ((Math.max(a, b) >= m) && (Math.min(a, b) >= s)) {
			System.out.println("Да");
		} else {
			System.out.println("Нет");
		}
		System.out.println("");
	}
	
	/*
	 * Метод используется для задачи 31. Возвращает среднее значение из 
	 * трех входных переменных
	 */
	public static int findAverage(int a, int b, int c) {
	    int x = Math.max(a, b);
	    int y = Math.max(a, b);
	    if (x == y) {
	        return Math.max(b, c);
	    } else {
	        return Math.min(x, y);
	    }
	}
	
	/*
	 * Задача 32. Написать программу, которая по заданным трем числам определяет,
	 * является ли сумма каких-либо двух из них положительной
	 */
	public static void run32() {
		int a;
		int b;
		int c;
		
		a = - 14;
		b = 6;
		c = -4;
		
		System.out.println("Задача 32");
		System.out.println("Даны числа: " + a + ", " + b + ", " + c + 
				". Cумма каких-либо двух из них  является положительной? ");
		if ((a + b > 0) || (a + c > 0) && (b + c > 0)) {
			System.out.println("Да");
		} else {
			System.out.println("Нет");
		}
		System.out.println("");
	}
	
	/*
	 * Задача 33. Написать программу, которая по паролю будет определять уровень 
	 * доступа сотрудника к секретной информации в базе данных. Доступ к базе 
	 * имеют только шесть человек, разбитых на три группы по степени доступа. 
	 * Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 
	 * 3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С
	 */
	public static void run33() {
		int x;
		
		x = 3331;
		
		System.out.println("Задача 33");
		System.out.println("Проверка пароля:");
		switch (x) {
		case 9583:
		case 1747:
			System.out.println("Вам доступны модули баз А, В, С");
			break;
			
		case 3331:
		case 7922:
			System.out.println("Вам доступны модули баз  В, С");
			break;
			
		case 9455:
		case 8997:
			System.out.println("Вам доступны модули баз С");
			break;
			
		default:
			System.out.println("Шпионам доступ запрещен!");
			break;
		}
		System.out.println("");		
	}
	
	/*
	 * Задача 34. Составить  программу,  реализующую  эпизод  применения  
	 * компьютера  в  книжном  магазине.  Компьютер запрашивает  стоимость  книг,
	 * сумму  денег,  внесенную  покупателем;  если  сдачи  не  требуется,  
	 * печатает  на  экране «спасибо»; если денег внесено больше, чем необходимо,
	 * то печатает «возьмите сдачу» и указывает сумму сдачи; если денег 
	 * недостаточно, то печатает сообщение об этом и указывает размер недостающей 
	 * суммы.
	 */
	public static void run34() {
		double cost;
		double money;
		
		cost = 12.53;
		money = 20.00;
		
		System.out.println("Задача 34");
		System.out.println("Стоимость покупки " + cost + " рублей, вы заплатили " 
						   + money + " рублей.");
		if (cost == money) {
			System.out.println("Спасибо");
		} else if (cost > money) {
			money = Math.round((cost - money) * 100);
			money  = money / 100;
			System.out.println("Вы ввели недостаточную сумму. Необходимо доплатить" 
							   + money);
		} else {
			money = Math.round((money - cost) * 100);
			money  = money / 100;
			System.out.println("Возьмите сдачу " + money);
		}
		System.out.println("");
	}
	
	/*
	 * Задача 35. Вычислить число и месяц в невисокосном году по номеру дня
	 */
	public static void run35() {
		int x;
		
		int day;
		
		x = 53;
		
		System.out.println("Задача 35");
		System.out.print(x + " день в високосном году это: ");
		if (x < 1) {
			System.out.println("Отрицательных дней не бывает");
		} else if (x <= 31) {
			System.out.println(x + " января");
		} else if (x <= 59) {
			day = x - 31;
			System.out.println(day + " февраля");
		} else if (x <= 90) {
			day = x - 59;
			System.out.println(day + " марта");
		} else if (x <= 120) {
			day = x - 90;
			System.out.println(day + " апреля");
		} else if (x <= 151) {
			day = x - 120;
			System.out.println(day + " мая");
		} else if (x <= 181) {
			day = x - 151;
			System.out.println(day + " июня");
		} else if (x <= 212) {
			day = x - 181;
			System.out.println(day + " июля");
		} else if (x <= 243) {
			day = x - 212;
			System.out.println(day + " августа");
		} else if (x <= 273) {
			day = x - 243;
			System.out.println(day + " сентября");
		} else if (x <= 304) {
			day = x - 273;
			System.out.println(day + " октября");
		} else if (x <= 334) {
			day = x - 304;
			System.out.println(day + " ноября");
		} else if (x <= 365) {
			day = x - 304;
			System.out.println(day + " декабря");
		} else {
			System.out.println("Столько дней в високосном году не бывает");
		}
		System.out.println("");
	}
	
	/*
	 * Задача 36. Вычислить значение функции
	 */
	public static void run36() {
		int x;
		
		int y;
		
		x = 4;
		
		System.out.println("Задача 36");
		System.out.println("x = " + x + ". Тогда результат выражения равен: ");
		
		if(x <= 3) {
			y = x * x - 3 * x + 9;
		} else {
			y = 1 / (x * x * x + 6);
		}
		
		System.out.println(y);
		System.out.println("");
	}
	
	/*
	 * Задача 37. Вычислить значение функции
	 */
	public static void run37() {
		int x;
		
		int y;
		
		x = 4;
		
		System.out.println("Задача 37");
		System.out.println("x = " + x + ". Тогда результат выражения равен: ");
		
		if(x >= 3) {
			y = - x * x + 3 * x + 9;
		} else {
			y = 1 / (x * x * x - 6);
		}
		
		System.out.println(y);
		System.out.println("");
	}
	
	/*
	 * Задача 38. Вычислить значение функции
	 */
	public static void run38() {
		int x;
		
		int y;
		
		x = 4;
		
		System.out.println("Задача 38");
		System.out.println("x = " + x + ". Тогда результат выражения равен: ");
		
		if( (x >= 0) && (x <= 3)) {
			y = x * x;
		} else {
			y = 4;
		}
		
		System.out.println(y);
		System.out.println("");
	}
	
	/*
	 * Задача 39. Вычислить значение функции
	 */
	public static void run39() {
		int x;
		
		int y;
		
		x = 4;
		
		System.out.println("Задача 39");
		System.out.println("x = " + x + ". Тогда результат выражения равен: ");
		
		if(x >= 8) {
			y = - x * x + x - 9;
		} else {
			y = 1 / (x * x * x * x - 6);
		}
		
		System.out.println(y);
		System.out.println("");
	}
	
	/*
	 * Задача 40. Вычислить значение функции
	 */
	public static void run40() {
		int x;
		
		int y;
		
		x = 4;
		
		System.out.println("Задача 40");
		System.out.println("x = " + x + ". Тогда результат выражения равен: ");
		
		if(x <= 13) {
			y = - x * x * x + 9;
		} else {
			y = - 3 / (x + 1);
		}
		
		System.out.println(y);
	}
}

