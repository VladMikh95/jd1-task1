package by.htp.line.main;

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
	}
	
	/*
	 *  Задача 1. Даны два действительных числа x и y. Найти их сумму, разность,
	 *  произведение и частное
	 */
	public static void run1() {
		double x;
		double y;
		
		double result;
		
		x = 7.5;
		y = 2.4;
		
		System.out.println("Задача 1");
		result = x + y;
		System.out.println(x + " + " + y + " = " + result);
		
		result = x - y;
		System.out.println(x + " - " + y + " = " + result);
		
		result = x * y;
		System.out.println(x + " * " + y + " = " + result);
		
		result = x / y;
		System.out.println(x + " / " + y + " = " + result);
		System.out.println("");
	}
	
	/*
	 * Задача 2. Найдите значение функции: c = 3 + a;
	 */
	public static void run2() {
		double a;
		double c;
		
		a = 4.3;
		
		c = 3 + a;
		System.out.println("Задача 2");
		System.out.println("3 + " + a + " = " + c);
		System.out.println("");
	}
	
	/*
	 * Задача 3. Найдите значение функции: z = 2 * x + (y - 2) * 5;
	 */
	public static void run3() {
		double x;
		double y;
		
		double z;
		
		x = 1.3;
		y = 2.7;
		
		z = 2 * x + (y - 2) * 5;
		System.out.println("Задача 3");
		System.out.println("Если х = " + x + ", y = " + y + ", то z = " + z);
		System.out.println("");
	}
	
	/*
	 * Задача 4. Найдите значение функции: z = ((a - 3) * b / 2) + c;
	 */
	public static void run4() {
		double a;
		double b;
		double c;
		
		double z;
		
		a = 2.5;
		b = 4.3;
		c = 5.7;
		
		z = (a - 3) * b / 2 + c;
		System.out.println("Задача 4");
		System.out.println("Если a = " + a + ", b = " + b + ", c = " + c 
						   + ", то z = " + z);
		System.out.println("");
	}
	
	/*
	 * Задача 5/ Составить алгоритм нахождения среднего арифметического двух чисел
	 */
	public static void run5() {
		double x;
		double y;
		
		double z;
		
		x = 6.7;
		y = 8.3;
		
		System.out.println("Задача 5");
		z = (x + y) / 2;
		System.out.println("Если х = " + x + ", y = " + y + ", то z = " + z);
		System.out.println("");
	}
	
	/*
	 * Задача 6. Написать код решения задачи. В n малых бидонах 80л молока. 
	 * Сколько литров молока в m больших бидонах, если в каждом большом бидоне
	 * на 12л больше чем  в малом?
	 */
	public static void run6() {
		int n;
		int m;
		
		double result;
		
		n = 4;
		m = 5;
		
		System.out.println("Задача 6");
		result = (80 / n + 12) * 5;
		System.out.println("Если n = " + n + ", m = " + m + ", то result = " 
						   + result);
		System.out.println("");
	}
	
	/*
	 * Задача 7. Дан прямоугольник. Ширина прямоугольника в 2 раза меньше длины.
	 * Найдите площадь прямоугольника.
	 */
	public static void run7() {
		double len;
		
		double square;
		
		len = 16.0;
		
		System.out.println("Задача 7");
		square = len * len / 2;
		System.out.println("Если длина прямоугольника равна " + len 
						   + ", то его площадь равна " + square);
		System.out.println("");
	}
	
	/*
	 * Задача 8. Вычислить значение выражения по формуле
	 */
	public static void run8() {
		double a;
		double b;
		double c;
		
		double z;
		
		a = 1.0;
		b = 4.0;
		c = 5.0;
		
		System.out.println("Задача 8");
		z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 / a 
			- a * a * a * c + Math.pow(b, -2.0);
		System.out.println("Если a = " + a + ", b = " + b + ", c = " + c 
						   + ", то z = " + z);
		System.out.println("");
	}
	
	/*
	 * Задача 9. Вычислить значение выражения по формуле
	 */
	public static void run9() {
		double a;
		double b;
		double c;
		double d;
		
		double result;
		
		a = 3.0;
		b = 4.0;
		c = 2.0;
		d = 3.0;
		
		System.out.println("Задача 9");
		result = (a * b - a * b + c) / c / d;
		System.out.print("Если a = " + a + ", b = " + b + ", c = " + c);
		System.out.println(", d = " + d + ", то result = " + result);
		System.out.println("");
	}
	
	/*
	 * Задача 10. Вычислить значение выражения по формуле
	 */
	public static void run10() {
		double x;
		double y;
		
		double result;
		
		x = 32.0;
		y = 64.0;
		
		System.out.println("Задача 10");
		result = (Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(y))) 
				 / (Math.cos(Math.toRadians(x)) - Math.sin(Math.toRadians(y))) 
				 * Math.tan(Math.toRadians(x * y));
		System.out.println("Если х = " + x + ", y = " + y 
						   + ", то результат равен " + result);
		System.out.println("");
	}
	
	/*
	 * Задача 11. Вычислить периметр и площадь прямоугольника по длинам его катетов
	 */
	public static void run11() {
		double a;
		double b;
		
		double per;
		double sqw;
		
		a = 3.0;
		b = 4.0;
		
		System.out.println("Задача 11");
		per = a + b + Math.sqrt(a * a + b * b);
		sqw = a * b / 2;
		System.out.println("Если a = " + a + ", b = " + b + ", то периметр равен " 
							+ per + ", a  площадь равна " + sqw);
		System.out.println("");
	}
	
	/*
	 * Задача 12. Вычислить расстояние между двумя точками с данными 
	 * координатами(x1, y1), (x2, y2);
	 */
	public static void run12() {
		double x1;
		double x2;
		double y1;
		double y2;
		
		double len;
		
		x1 = 3.2;
		x2 = 2.2;
		y1 = 5.4;
		y2 = 7.4;
		
		System.out.println("Задача 12");
		len = Math.sqrt( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		System.out.println("Если х1 = " + x1 + ", x2 = " + x2 +", y1 = " + y1  
						   + ", y2 = " + y2 + ", то расстояние между точками "
						   + "равно " + len);
		System.out.println("");
	}
	
	/*
	 * Задача 13. Заданы координаты трех вершин треугольника найти его периметр 
	 * и площадь
	 */
	public static void run13() {
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		
		double per;
		double squ;
		
		x1 = 4.3;
		x2 = 3.2;
		x3 = 7.3;
		y1 = 1.2;
		y2 = 3.4;
		y3 = 5.6;
		
		System.out.println("Задача 13");
		squ = Math.abs( (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
		// длина первой стороны треугольника
		double a = Math.sqrt( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		// длина второй стороны треугольника
		double b = Math.sqrt( Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		// длина третьей стороны треугольника
		double c = Math.sqrt( Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)); 
		
		per = a + b + c;
		System.out.println("Если х1 = " + x1 + ", x2 = " + x2 + ", x3 = " + x3
							+ ", y1 = " + y1  + ", y2 = " + y2 + ", y3 = " + y3
							+ ", то периметр равен " + per + ", а площадь - " 
							+ squ);
		System.out.println("");
	}
	
	/*
	 * Задача 14. Вычислить длину окружности и площадь круга одного и того же 
	 * заданного радиуса R
	 */
	public static void run14() {
		double r;
		
		double len;
		double square;
		
		r = 15.4;
		
		System.out.println("Задача 14");
		len = 2 * Math.PI * r;
		square = Math.PI * r * r;
		System.out.println("Если радиус круга равен " + r +  ", то длина "
						 + "окружнасти равна " + len
						 + ", а площадь круга равна " + square);
		System.out.println("");
	}
	
	/*
	 * Задача 15. Написать программу, которая выводит на экран первые 4 степени
	 * числа PI
	 */
	public static void run15() {
		double result = 1;
		
		System.out.println("Задача 15");
		for (int i  = 1; i <= 4; i++) {
			result  = result * Math.PI;
			System.out.println(i + " степень числа PI равна: " + result);
		}
	}
}
