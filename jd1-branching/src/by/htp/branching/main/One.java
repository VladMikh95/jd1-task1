package by.htp.branching.main;

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
	 *  Задача 1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2
	 *   – вывести на экран цифру 7, в противном случае – цифру 8.
	 */
	public static void run1() {
		double a;
		double b;
		
		a = 1.0;
		b = 3.4;
		
		System.out.println("Задача 1");
		System.out.print("первое число = " + a + ", второе = " + b
						 + ". Вывод = ");
		if (a < b) {
			System.out.println("7");
		} else {
			System.out.println("8");
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 
	 *  – вывести на экран слово «yes», в противном случае – слово «no»
	 */	
	public static void run2() {
		double a;
		double b;
		
		a = 32.0;
		b = 15.7;
		
		System.out.println("Задача 2");
		System.out.print(a + " < " + b + ". Ответ: ");
		if (a < b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 3. Составить программу сравнения введенного числа а и цифры 3.
	 *  Вывести на экран слово «yes», если число а меньше 3; если больше, 
	 *  то вывести слово «no».
	 */	
	public static void run3() {
		int a;
		
		a = - 5;
		
		System.out.println("Задача 3");
		System.out.print("Число а = " + a + ". a < 3? Ответ: ");
		if (a < 3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 4. Составить программу:  равны ли два числа а и b?
	 */	
	public static void run4() {
		int a;
		int b;
		
		a = 14;
		b = - 14;
		
		System.out.println("Задача 4");
		System.out.print("Число а = " + a + ", число b = " + b);
		System.out.print(". Число а = b? Ответ: ");
		if (a == b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 5. Составить программу: определения наименьшего из двух
	 *  чисел а и b
	 */	
	public static void run5() {
		int a;
		int b;
		
		a = 6;
		b = 12;
		
		System.out.println("Задача 5");
		System.out.print("Число а = " + a + ", число b = " + b);
		System.out.print(". Наименьшее из них = ");
		if (a < b) {
			System.out.println("a = " + a);
		} else if (b < a) {
			System.out.println("b = " + b);
		} else {
			System.out.println("a = b = " + a);
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 6. Составить программу: определения наибольшего из двух чисел а и b
	 */	
	public static void run6() {
		int a;
		int b;
		
		a = 19;
		b = 19;
		
		System.out.println("Задача 6");
		System.out.print("Число а = " + a + ", число b = " + b);
		System.out.print(". Наибольшее из них = ");
		if (a > b) {
			System.out.println("a = " + a);
		} else if (b > a) {
			System.out.println("b = " + b);
		} else {
			System.out.println("a = b = " + a);
		}
		System.out.println("");
	}
	
	/* 
	 * Задача 7. Составить программу нахождения модуля выражения a*x*x + b*x + c
	 *  при заданных значениях a, b, c и х
	 */	
	public static void run7() {
		int a;
		int b;
		int c;
		int x;
		
		int result;
		
		a = - 2;
		b = 5;
		c = 3;
		x = -3;
		
		System.out.println("Задача 7");
		System.out.print("Модуль выражения " + a + "x^2 + " + b + "x + " + c);
		System.out.print(" равен: ");
		result = a * x * x + b * x + c;
		if (result >= 0) {
			System.out.println(result);
		} else {
			System.out.println(- result);
		}
		System.out.println("");
	}
	
	/*
	 * Задача 8. Составить программу нахождения наименьшего из квадратов двух 
	 * чисел а и b
	 */	
	public static void run8() {
		int a;
		int b;
		
		a = 4;
		b = 3;
		
		System.out.println("Задача 8");
		System.out.print("Наименьший из квадратов двух чисел a = " + a);
		System.out.print(" и b = " + b + " равен: ");
		a = a * a;
		b = b * b;
		if (a < b) {
			System.out.println(a);
		} else if (b < a) { 
			System.out.println(b);
		} else {
			System.out.println("a = b = " + a);
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 9. Составить программу, которая определит по трем введенным
	 *  сторонам,  является  ли данный треугольник	равносторонним 
	 */
	public static void run9() {
		int a;
		int b;
		int c;
		
		a = 7;
		b = 13;
		c = 13;
		
		System.out.println("Задача 9");
		System.out.print("Является ли треугольник со сторонами ");
		System.out.print(a + ", " + b + ", " + c + " равносторонним: ");
		if ( (a == b) && (a == c)) {
			System.out.println("да");
		} else {
			System.out.println("нет");
		}
		System.out.println("");
	}
	
	/*
	 * Задача 10. Составить программу, которая определит площадь какого круга
	 * меньше
	 */	
	public static void run10() {
		double a;
		double b;
		
		a = 13.0;
		b = 15.0;
		
		System.out.println("Задача 10");
		System.out.print("Площадь круга a = " + a + ", a круга b = " + b);
		System.out.print(". Меньшая площадь у круга ");
		selectSquare(a, b);
	}
	
	/*
	 * Этот метод используется при решение 11 и 12 задач 
	 */
	public static void selectSquare(double a, double b) {
		if (a < b) {
			System.out.println(a);
		} else if (b < a) {
			System.out.println(b);
		} else {
			System.out.println(a = b);
		}
		System.out.println("");
	}
	
	/*
	 * Задача 11. Составить программу, которая определит площадь какого 
	 * треугольника больше
	 */
	public static void run11() {
		double a;
		double b;
		
		a = 8.4;
		b = 3.7;
		
		System.out.println("Задача 11");
		System.out.print("Площадь треугольника a = " + a + ", a треугольника b = ");
		System.out.print(b + ". Меньшая площадь у треугольника ");
		selectSquare(a, b);
	}
	
	/*
	 * Задача 12. Даны три действительных числа. Возвести в квадрат те из них,
	 * значения которых неотрицательны, и в четвертую степень — отрицательные 
	 */
	public static void run12() {
		double a;
		double b;
		double c;
		
		a = 4.3;
		b = 6.7;
		c = - 3.2;
		
		System.out.println("Задача 12");
		System.out.print("Даны три действительных числа:" + a + ", " + b); 
		System.out.print(", " + c + ". Результат равен: ");
		System.out.print(selectLv(a) + ", " + selectLv(b) + ", ");
		System.out.println(selectLv(c));
		System.out.println("");
	}
	
	/*
	 * метод выбирает в какую степень возвести передаваемое число
	 */
	public static double selectLv(double x) {
		if (x < 0) {
			x = Math.pow(x, 4.0);
		} else {
			x = Math.pow(x, 3.0);
		}
		return x;
	}
	
	/*
	 * Задача 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм,
	 *  определяющий, которая из точек находится ближе к началу координат.
	 */	
	public static void run13() {
		int x1;
		int y1;
		int x2;
		int y2;
		
		int result;
		
		x1 = 5;
		y1 = 3;
		x2 = 3;
		y2 = 5;
		
		result = (x1 * x1 + y1 * y1) - (x2 * x2 + y2 * y2);
		System.out.println("Задача 13");
		System.out.print("Даны две точки А(" + x1 + ", " + y1
						 + "), и B(" + x2 + ", " + y2 + ").");
		if (result < 0) {
			System.out.println(" Точка A ближе к началу координат");
		} else if (result > 0) {
			System.out.println(" Точка В ближе к началу координат");
		} else {
			System.out.println(" Обе точки находятся на одинаковом"
							   + " расстоянии от начала координат");
		}
		System.out.println("");		
	}
	
	/*
	 * Задача 14. Даны два угла треугольника (в градусах). Определить,
	 * существует ли такой треугольник, и если да, то будет ли он прямоугольным
	 */
	public static void run14() {
		int a;
		int b;
		
		a = 30;
		b = 150;
		
		System.out.println("Задача 14");
		System.out.print("Даны два угла треугольника (в градусах) " + a + ", " 
						 + b + ". Cуществует ли такой треугольник? ");
		if ((a + b) < 180) {
			System.out.print("Да. Он прямоугольный? ");
			if ((a + b) == 90) {
				System.out.println("Да");
			} else {
				System.out.println("Нет");
			}
		} else { 
			System.out.println("Нет");
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 15. Даны действительные числа х и у, не равные друг другу. Меньшее
	 *  из этих двух чисел заменить половиной их суммы, а большее — их удвоенным 
	 *  произведением
	 */	
	public static void run15() {
		double x;
		double y;
		
		double a;
		double b;
		
		x = 3.0;
		y = 8.0;
		
		a = (x + y) / 2;
		b = 2 * x * y;
		System.out.println("Задача 15");
		System.out.print("Число х = " + x + ", число y = " + y + ". Ответ: ");
		if (x < y) {
			System.out.println("x = " + a + ", y = " + b);
		} else {
			System.out.println("x = " + b + ", y = " + a);
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 16. На плоскости ХОY задана своими координатами точка А. Указать, 
	 *  где она расположена (на какой оси или в каком координатном угле)
	 */
	public static void run16() {
		int x;
		int y;
		
		x = 3;
		y = - 2;
		
		System.out.println("Задача 16");
		System.out.print("Задана точка А(" + x + ", " + y 
						 + ").  Она находится ");
		if (x == 0) {
			System.out.println("на оси Х");
		} else if (x > 0) {
			if(y == 0) {
				System.out.println("на оси Y");
			} else if (y > 0) {
				System.out.println("на I координатном угле");
			} else {
				System.out.println("на II координатном угле");
			}
		} else {
			if (y == 0) {
				System.out.println("на оси Y");
			} else if (y > 0) {
				System.out.println("на IV координатном угле");
			} else {
				System.out.println("на III координатном угле");
			}			
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 17. Даны целые числа m, n. Если числа не равны, то заменить каждое
	 *  из них одним и тем же числом, равным большему из исходных, а если равны, 
	 *  то заменить числа нулями
	 */	
	public static void run17() {
		int m;
		int n;
		
		m = 6;
		n = 3;
		
		System.out.println("Задача 17");
		System.out.print("Число m = " + m + ", число n = " + n 
						 + ". В результате получаем ");
		if (m == n) {
			System.out.println("m = 0, n = 0");
		} else if (m > n) {
			System.out.println("m = " + m + ", n = " + m);			
		} else {
			System.out.println("m = " + n + ", n = " + n);
		}
		System.out.println("");
	}
	
	/*
	 *  Задача 18. Подсчитать количество отрицательных среди чисел а, b, с
	 */
	public static void run18() {
		int a;
		int b;
		int c;
		
		a = 7;
		b = - 13;
		c = 56;
		
		System.out.println("Задача 18");
		System.out.print("a = " + a + ", b = "+ b + ", c = " + c + ". Количество"
						 + " отрицательных чисел среди них равно: ");
		System.out.println(count(a, b, c));
		System.out.println("");
	}
	
	/*
	 * Метод считает количество отрицательных чисел
	 */
	public static int count(int a, int b, int c) {
		int i = 0; 
		
		if (a < 0) {
			i++;
		}
		
		if (b < 0) {
			i++;
		}
		
		if (c < 0) {
			i++;
		}
		return i;
	}
	
	/*
	 *  Задача 19. Подсчитать количество положительных среди чисел а, b, с
	 */	
	public static void run19() {
		int a;
		int b;
		int c;
		
		a = - 7;
		b = - 13;
		c = 56;
		
		System.out.println("Задача 19");
		System.out.print("a = " + a + ", b = "+ b + ", c = " + c + ". Количество"
						 + " положительных чисел среди них равно: ");
		System.out.println(3 - count(a, b, c));
		System.out.println("");
	}
	
	/*
	 *  Задача 20.  Определить, делителем каких чисел а, b, с является число k
	 */
	public static void run20() {
		int a;
		int b;
		int c;
		int k;
		
		a = 35;
		b = 17;
		c = 8;
		k = 5;
		
		System.out.println("Задача 20");
		System.out.print("Даны числа: a =" + a + ", b = " + b + ", c = "+ c 
						 + ". Число " + k + " является делителем чисел ");
		if ( a % k == 0) {
			System.out.println("a, ");
		}
		
		if ( b % k == 0) {
			System.out.println("b, ");
		}
		
		if ( c % k == 0) {
			System.out.println("c");
		}
	}
	
}
