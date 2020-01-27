package by.htp.line.main;

public class Three {
	
	public static void main(String[] args) {
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
	 * Задача 31. Составить программу для вычисления пути, пройденного лодкой,
	 * если ее скорость в стоячей воде v км/ч, скорость реки v1 км/ч, время
	 * движения по озеру t1 ч, а против движения реки - t2
	 */
	public static void run31() {
		double v;
		double v1;
		double t1;
		double t2;
		
		double s;
		
		v = 10.0;
		v1 = 1.4;
		t1 = 3.0;
		t2 = 1.5;
		
		s = v * t1 + (v - v1) * t2;
		System.out.println("Задача 31");
		System.out.println("скорость лодки в стоячей воде " + v + "км/ч, "
						 + "скорость реки " +  v1 + "км/ч, время движения "
						 + "по озеру " + t1  + "ч, ");
		System.out.println("а против движения реки - " + t2);
		System.out.println("Пройденный пут равен " + s + "км");
		System.out.println("");
	}
	
	/*
	 * Задача 32. Текущее показание электронных часов, m ч n мин k сек. 
	 * Какое время будут показывать часы через p ч q мин r сек?
	 */
	public static void run32() {
		int m;
		int n;
		int k;
		int p;
		int q; 
		int r;
		
		int a;
		int b;
		int c;
		
		String aa;
		String bb;
		String cc;
		
		m = 13;
		n = 25;
		k = 30;
		p = 10;
		q = 34;
		r = 30;
		
		int time = (m + p) * 3600 + (n + q) * 60 + k + r;
		if (time > 86399) {
			time = time - 86400; // 86400 максимальное время в секундах,
			                     // которое может показать часы 
		}
		a = time / 3600;
		if (a < 10) {
			aa = "0" + a;
		} else {
			aa = "" + a;
		}
		time = time - a * 3600;
		b = time / 60;
		if (b < 10) {
			bb = "0" + b;
		} else {
			bb = "" + b;
		}
		c = time - b * 60;
		if (c < 10) {
			cc = "0" + c;
		} else {
			cc = "" + c;
		}
		System.out.println("Задача 32");
		System.out.println("Текущее показание электронных часов " + m + "ч " 
						   + n + "мин " + k + "сек.");
		System.out.print("Через " + p + "ч " + q + "мин " + r 
				         + "сек часы покажут " + aa + "ч " + bb + "мин " 
				         + cc + "сек");
		System.out.println("");
	}
	
	/*
	 * Задача 33. Ввести любой символ и определить его порядковый номер, 
	 * а также указать предыдущий и последующий символы
	 */
	public static void run33() {
		char ch;
		
		int num;
		char prev;
		char next;
		
		ch = 'A';
		
		num  = (int) ch;
		prev = (char) (num - 1);
		next = (char) (num + 1);
		System.out.println("Задача 33");
		System.out.print("Дан символ " + ch + ". Его порядковый номер " + num 
				+ ", предыдущий символ " + prev + ", следующий - " + next);
		System.out.println("");
	}
	
	/*
	 * Задача 34. Дана величина А, выражающая объем в байтах. Перевести А в более
	 * крупные единицы измерения информации
	 */
	public static void run34() {
		double a;
		
		double k;
		double m;
		double g;
		
		a = 12345678912.0;
		
		k = Math.ceil(a / 1024 * 100);
		k = k / 100;
		m = Math.ceil(a / 1024 / 1024 * 100);
		m = m / 100;
		g = Math.ceil(a / 1024 / 1024 / 1024 * 100);
		g = g / 100;
		System.out.println("Задача 34");
		System.out.println(a + "B = " + k + "kB = " + m + "MB = " +  g + "GB");
		System.out.println("");
	}
	
	/*
	 * Задача 35. Даны натуральные числа M и N. Вывести старшую цифру дробной 
	 * части и младшую цифру целой части числа M/N
	 */
	public static void run35() {
		int m;
		int n;
		
		double a;
		int b;
		
		int old;
		int young;
		
		m = 149;
		n  = 7;
		
		a = (double) m / n;
		b = (int) a;
		young = b % 10;
		old =  (int) ((a- b) * 10);
		System.out.println("Задача 35");
		System.out.println("Даны натуральные числа M = " + m + " и N = " + n 
						   + ". Число M/n = " + a);
		System.out.println("Старшая цифра дробной части числа = " + old);
		System.out.println("Младшая цифра целой части числа = " + young);
		System.out.println("");
	}
	
	/*
	 * Задача 36. Найти частное произведений четных и нечетных цифр 
	 * четырехзначного числа
	 */
	public static void run36() {
		int number;
		
		int even = 1;
		int uneven = 1;
		int evenN = 0;		// Количество четных цифр
		int unevenN = 0;	// Количество нечетных цифр
		int num;
		
		double result;
		
		number = 2211;
		
		num = number;    // Эта переменная потребуется для вывода в консоль
		for(int a = 0; a < 4; a++) {
			int i = number % 10;
			if (i % 2 == 0) {
				evenN++;
				even = even * i;
			} else {
				unevenN++;
				uneven = uneven * i;
			}
			number = number / 10;	
		}
		if (evenN == 0) {
			even = 0;
		}
		
		if (unevenN == 0) {
			uneven = 0;
		}
		result = (double) even / uneven;
		System.out.println("Задача 36");
		System.out.println("Дано четырех значное число " + num);
		System.out.println("Частное произведений четных и нечетных цифр " 
						   + result);
		System.out.println("");
	}
	
	/*
	 * Задача 37. Составить линейную программу, печатающую значение true, 
	 * если указанное высказывание является истинным и false - в противном случае
	 */
	public static void run37() {
		System.out.println("Задача 37");
		decide1();
		decide2();
		decide3();
		decide4();
		decide5();
		decide6();
		decide7();
		decide8();
		decide9();
		System.out.println("");
	}
	
	/*
	 * Целое число N является четным двухзначным числом
	 */
	public static void decide1() {
		int x;
		
		x = 54;
		
		System.out.print("Целое число N = " + x 
						 + " является четным двухзначным числом = ");
		if ((x % 2 == 0) && (x < 100) && (x > 9)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	/*
	 * Сумма двух первых цифр заданного четырехзначного числа равна сумме двух 
	 * его последних цифр
	 */
	public static void decide2() {
		int x;
		 	
		int a;
		int b;
			
		x =1423;
					
		System.out.print("Целое число = " + x +" Сумма двух первых цифр "
		    			  + "заданного четырехзначного числа равна сумме "
						  + "двух его последних цифр = ");
		b = x % 10;
		x = x / 10;
		b = b + x % 10;
		x = x / 10;
		a = x % 10 + x / 10;
		if (a == b) {
		 	System.out.println("true");
		} else {
		 	System.out.println("false");
		}
	}
	 
	/*
	 * Сумма цифр данного трехзначного числа N является четным числом
	 */
	public static void decide3() {
		int x;
		 
		int a;
		 
		x = 234;
		 
		System.out.print("Сумма цифр числа N = " + x 
				 		  + " является четным числом = ");
		a = x % 10;
		x = x / 10;
		a = a + x % 10 + x / 10;
		if ( a % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	 
	/*
	 * Точка с координатами(x, y) принадлежит части плоскости, лежащей между
	 * прямыми x = m, x = n (m < n)
	 */
	public static void decide4() {
		int x;
		int y;
		int m;
		int n;
		 
		x = 3;
		y = 34;
		m = - 5;
		n = 4;
		System.out.print("Точка с координатами " + x + ", " + y + " принадлежит"
		 				 + " части плоскости, лежащей межды прямыми x =  " 
		 				 + m + ", x = " + n + " (m < n) = ");
		if( (x > m) && (x < n)) {
		 	System.out.println("true");
		} else {
			System.out.println("false");
		} 
	}
	 
	/*
	 * Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа
	 */
	public static void decide5() {
		int x;
		
		int a;
		int b;
		
		x = 123;
		
		System.out.print("Квадрат числа " + x 
						 + " равен кубу суммы цифр этого числа =");
		a = x % 10;
		b = x / 10;
		a = a + b % 10 + b / 10;
		if ( (x * x) == (a * a * a)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	/*
	 * Треугольник со сторонами a, b, c является равнобедренным
	 */
	public static void decide6() {
		int a;
		int b;
		int c;
		
		a = 4;
		b = 5;
		c = 4;
		
		System.out.print("Треугольник со сторонами a = " + a + ", b = " 
						 + b + ", c = " + c + " является равнобедренным = ");
		if ((a == b) || (a == c) || (b == c)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
    
	/*
	 * Сумма каких-либо двух цифр заданного трехзначного натурального числа N 
	 * равна третьей цифре
	 */
	public static void decide7() {
		int x;
		
		int a;
		int b;
		int c;
		
		x = 242;
		System.out.print("Сумма каких-либо двух цифр числа N = " + x 
						 + " равна третьей цифре = ");		
		a = x % 10;
		x = x / 10;
		b = x % 10;
		c = x / 10;
		if ((a + b == c) || (a + c == b) || (b + c == a)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
		
	/*
	 * Заданное число N является степенью числа а (показатель степени может 
	 * находиться в диапазоне от 0 до 4)
	 */
	public static void decide8() {
		int x;
		int a; 
		
		double b;
		
		x = 8;
		a = 2;
		
		System.out.print("Заданное число N = " + x + " является степенью числа "
						 + "а = " + a + " (показатель степени может находиться "
						 + "в диапазоне от 0 до 4)");
		b = Math.log(x)/Math.log(a);
		if ((b % 1 == 0) && (b <= 4) && (b >= 0)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	/*
	 * График функции y = ax^2 + bx + c проходит через заданную точку 
	 * с координатами (m, n)
	 */
	public static void decide9() {
		int a;
		int b;
		int c;
		int m;
		int n;
		
		double result;
		
		a = 1;
		b = 2;
		c = 1;
		m = - 1;
		n = 0;
		
		System.out.print("График функции y = " + a + "* x^2 + " + b + "* x + " 
						 + c + " проходит через заданную точку с координатами "
						 + "m = " + m + ", n = " + n + " = ");
		result = (double) a * m * m + b * m + c;
		if (result == n) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	/*
	 * Задача 38. Для данных областей составить программу, которая печатает true, 
	 * если точка с координатами (x, y) принадлежит закрашенной области, 
	 * и false - в противном случае
	 */
	public static void run38() {
		double x;
		double y;
		
		x = - 1.0;
		y = 1.0;
		
		System.out.println("Задача 38");
		runA(x, y);
		runB(x, y);
		runC(x, y);
		System.out.println("");
	}
	
	/*
	 * Метод для варианта а 38 задачи
	 */
	public static void runA(double m, double n) {
		System.out.print("Для варианта а получаем ");
		if ((n >= 0) && (n <= 4 + m) && (n <= 4 - m)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	/*
	 * Метод для варианта b 38 задачи
	 */
	public static void runB(double m, double n) {
		System.out.print("Для варианта b получаем ");
		if ((n >= 0) && (n <= 4 ) && (m <= 2) && (m >= -2)) {
			System.out.println("true");
		} else if ((n <= 0) && (n >= - 3) && (m <= 4) && (m >= - 4)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	/*
	 * Метод для варианта c 38 задачи
	 */
	public static void runC(double m, double n) {
		System.out.print("Для варианта с получаем ");
		if ((n >= 0) && (m >= 0) && (n <= (Math.sqrt(16 - m * m)))) {
			System.out.println("true");
		} else if ((n <= 0) && (m >= 0) && (n <= (Math.sqrt(25 - m * m)))) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	/*
	 * Задача 39. Дано действительное число x. Не пользуясь никакими другими 
	 * арифметическими операциями, кроме умножения сложения и вычитания, вычислите
	 * за минимальное число операций 2x^4 - 3x^3 + 4x^2 - 5x + 6
	 */
	public static void run39() {
		double x;
		
		double result;
		
		x = 2.0;
		
		result = (((2 * x - 3) * x + 4) * x - 5) * x + 6;
		System.out.println("Задача 39");
		System.out.println("Дано действительное число " + x 
						   + ". Результат выражения будет равен " + result);
		System.out.println("");
	}
	
	/*
	 * Задача 40. Дано значение х. Получить значения -2х + 3x^2 - 4x^3 
	 * и 1 + 2x + 3x^2 + 4x^3. Позаботьтесь об экономии операций
	 */
	public static void run40() {
		double x;
		
		double result;
		
		x = 3.0;
		System.out.println("Задача 40");
		System.out.println("х = " + x);
		// Найдем значение первого выражения
		result = ( (3 - 4 * x) * x - 2) * x;
		System.out.println("Результат первого выражения равен " + result);
		// Найдем значение второго выражения
		result = ( (4 * x + 3) * x + 2) * x + 1;
		System.out.println("Результат второго выражения равен " + result);
		System.out.println("");
	}
	
	

}
