package by.htp.line.main;

public class Two {

	public static void main(String[] args) {
		run16();
		run17();
		run18();
		run19();
		run20();
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
		
	}
	
	/*
	 * Задача 16. Найти произведение цифр заданного четырёхзначного числа
	 */
	public static void run16() {
		int number;
		
		int num;
		int digit;

		int result;
		result = 1;
		
		number = 1234;
		
		System.out.println("Задача 16");
		num = number;
		for(int i =0; i < 4; i++) {
			digit = number % 10;
			number = number / 10;
			result = result * digit;
		}
		System.out.println("Произведение цифр числа " + num + " равно: " 
						   + result);
		System.out.println("");
	}
	
	/*
	 * Задача 17. Даны два числа. Найти среднее арифметическое кубов этих чисел
	 * и среднее геометрическое модулей этих чисел
	 */
	public static void run17() {
		double x;
		double y;
		
		double ar;
		double geo;
		
		x = 3.0;
		y = 4.0;
		
		System.out.println("Задача 17");
		ar = (Math.pow( x, 3.0) + Math.pow( y, 3.0)) / 2;
		geo = Math.sqrt( Math.abs(x) * Math.abs(y));
		System.out.println("Даны два числа: " + x + ", " + y);
		System.out.println("Среднее арифметическое кубов этих чисел равно: " 
						   + ar);
		System.out.println("Среднее геометрическое модулей этих чисел равно: " 
						   + geo);
		System.out.println("");
	}
	
	/*
	 * Задача 18. Дана длина ребра куба. Найти площадь грани, площадь полной 
	 * поверхности куба, объем
	 */
	public static void run18() {
		double l;
		
		double squ;
		double square;
		double size;
		
		l = 6.0;
		
		squ = l * l;
		square = 6 * squ;
		size = l * l * l;
		System.out.println("Задача 18");
		System.out.println("Длина ребра равна: " + l);
		System.out.println("Площадь грани равна: " + squ);
		System.out.println("Площадь полной поверхности куба равна: " + square);
		System.out.println("Объем равен: " + size);
		System.out.println("");
	}
	
	/*
	 * Задача 19. Дана сторона равностороннего треугольника. Найти площадь этого 
	 * треугольника, его высоту радиусы вписанной и описанной окружностей
	 */
	public static void run19() {
		double a;
		
		double square;
		double h;
		double r;
		double rO;
		
		a = 4.3;
		
		h = Math.sqrt(3) * a / 2;
		square = h * a / 2;
		r = Math.sqrt(3) * a / 6;
		rO = r * 2;
		System.out.println("Задача 19");
		System.out.println("Дана сторона равностороннего треугольника: " + a);
		System.out.println("Площадь треугольника равна: " + square);
		System.out.println("Высота треугольника равна: " + h);
		System.out.println("Радиус вписанной в трегольник окружности: " + r);
		System.out.println("Радиус описанной окружности: " +rO);
		System.out.println("");
	}
	
	/*
	 * Задача 20. Известна длина окружности. Найти площадь круга, ограниченной 
	 * этой окружностью
	 */
	public static void run20() {
		double len;
		
		double square;
		
		len = 18.84;
		
		square  = len * len / 4 / Math.PI;
		System.out.println("Задача 20");
		System.out.println("Длина окружности равна: " + len 
						   + ", площадь этого круга равна: " + square);
		System.out.println("");
	}
	
	/*
	 * Задача 21. Дано действительно число R вида nnn.ddd. Поменять дробную и 
	 * целую части местами и вывести на экран
	 */
	public static void run21() {
		double n;
		
		double num;
		
		n = 111.222;
		
		num  = Math.round(n % 1 * 1000000 + n - n % 1); 
		num = num / 1000;
		System.out.println("Задача 21");
		System.out.println("Число равно: " + n +  ", после преобразования "
						   + "получаем новое число: " + num);
		System.out.println("");
	}
	
	/*
	 * Задача 22. Дано натуральное число T, которое представляет длительность 
	 * прошедшего времени в секундах. Вывести данное значение длительности в часах,
	 * минутах и секундах в следующей форме: ННч MMмин SSc.
	 */
	public static void run22() {
		int time;
		
		int h;
		int m;
		int s;
		
		time = 38067;
		
		h = time / 3600;
		time = time - h * 3600;
		m = time / 60;
		s = time - m * 60;
		System.out.println("Задача 22");
		System.out.println("Время равно " + time + " секунд. По новой форме время "
						 + "равно " + h + "ч " + m + "м " + s + "с" );
		System.out.println("");
	}
	
	/*
	 * Задача 23. Найти площадь кольца, внутренний радиус которого  равен r, 
	 * а внешний - R(R > r)
	 */
	public static void run23() {
		double r;
		double rR;
		
		double square;
		
		r = 4.0;
		rR = 5.4;
		
		square = Math.PI * (rR * rR - r * r);
		System.out.println("Задача 23");
		System.out.println("Внешний радиус кольца равен " + rR 
						   + ", внутренний - " + r);
		System.out.println("Площадь кольца равна " + square);
		System.out.println("");
	}
	
	/*
	 * Задача 24. Найти площадь равнобедренной трапеции с основаниями a и b 
	 * и углом  y при большем основании a;
	 */
	public static void run24() {
		double a;
		double b;
		double y;
		
		double square;
		
		a = 5.0;
		b = 3.0;
		y = 30.0;
		
		double h = Math.tan(Math.toRadians(y)) * (a - b) / 2;
		square  = (a + b) * h / 2;
		System.out.println("Задача 24");
		System.out.print("Основания равнобедренной трапеции равны " + a + " и " 
						 + b + ", а угол при большем основании " + y);
		System.out.println("Площадь трапеции равна " + square);
		System.out.println("");
	}
	
	/* 
	 * Задача 25. Вычислить корни квадратного уравнения
	 */
	public static void run25() {
		double a;
		double b;
		double c;
		
		double one;
		double two;
		
		a = 1;
		b = 5;
		c = 6;
		
		double d = b * b - 4 * a * c;		
		one = ( - b + Math.sqrt(d)) / 2;
		two = (- b - Math.sqrt(d)) / 2;
		System.out.println("Задача 25");
		System.out.println("Дано квадратное уровнения: " + a + " * x^2 + " + b 
							+ " * x + " + c + " = 0");
		System.out.println("Корни квадратного уравнения равны: ");
		System.out.println(one + two);
		System.out.println("");
	}
	
	/* 
	 * Задача 26. Найти площадь трегольника две стороны которого равны a  и b, 
	 * а угол между этими сторонами равен y;
	 */
	public static void run26() {
		double a;
		double b;
		double y;
		
		double square;
		
		a = 5.0;
		b = 4.5;
		y = 30.0;
		
		square = Math.sin(Math.toRadians(y)) * a * b / 2;
		square = Math.ceil(square * 100);
		square = square / 100;
		System.out.println("Задача 26");
		System.out.println("Стороны треугольника равны " + a + " и " + b 
						   +  ", угол " + y);
		System.out.println("Площадь треугольника равна " + square);
		System.out.println("");
	}
	
	/* 
	 * Задача 27. Дано значение а. Не используя никаких функций и никаких операций, 
	 * кроме умножения, получить значение // a^8 за 3 операции и а^10 за четыре 
	 * операции
	 */
	public static void run27() {
		double a;
		
		double result;
		
		a = 2.0;
		
		System.out.println("Задача 27");
		System.out.println("Дано значение а: " + a);
		a = a * a;					// 1-ая операция 
		result = a * a;				// 2-ая операция
		result = result * result;	// 3-я операция
		System.out.println("За 3 операции получаем а^8: " + result);
		
		result = result * a;		// 4-ая операция
		System.out.println("За 4 операции получаем а^10: " + result);
		System.out.println("");
	}
	
	/*
	 * Задача 28. Составить программу перевода радианной меры угла в градусы, 
	 * минуты и секунды
	 */
	public static void run28() {
		double rad;
		
		rad = 5.0;
		
		System.out.println("Задача 28");
		convert(rad);
		System.out.println("");
	}
	
	/*
	 * Метод используется при решении 28 и 29 задач. Преобразует радианы 
	 * в градусы
	 */
	public static void convert(double d) {	
		double grad;
		int g;
		int m;
		int s;
		
		grad = d * 180 / Math.PI;
		g = (int) grad;
		grad = grad - g;
		m  = (int) (grad * 60);
		grad = grad * 60 - m;
		s = (int) (grad * 60);
		System.out.println(d + " радиан  = " + g + "градус(ов) " + m 
						   + "минут(ы) " + s + "секунд(ы)");
	}
	
	/*
	 * Задача 29. Найти (в радианах в градусах) все углы треугольника 
	 * со сторонами a, b, c.
	 */
	public static void run29() {
		double a;
		double b;
		double c;
		
		a = 2.0;
		b = 1.0;
		c = Math.sqrt(3);
		
		System.out.println("Задача 29");
		System.out.println("Даны стороны треугольника: " + a + ", " + b + ", " + c);
		calculate(a, b, c, "Первый");
		calculate(a, c, b, "Второй");
		calculate(c, b, a, "Третий");
		System.out.println("");
	}
	
	/*
	 * Метод используется при решении 29 задачи. Расчитывае угол треугольника 
	 * принимая значение его сторон и название угла 
	 */
	public static void calculate(double x, double y, double z, String s) {
		double cos;
		double acos;
		
		System.out.print(s + " угол треугольника = ");
		cos = (x * x + y * y - z * z) / 2 / x / y;
		acos = Math.acos(cos);
		convert(acos);		 
	}
	
	/*
	 * Задача 30. Три сопротивления соединены паралельно. 
	 * Найти сопративление соединения
	 */
	public static void run30() {
		double a;
		double b;
		double c;
		
		double result;
		
		a = 2.0;
		b = 4.0;
		c = 6.0;
		
		result = a * b * c / (a * b + a * c + b * c);
		System.out.println("Задача 30");
		System.out.println("Дано три сопротивления: " + a + ", " + b + ", " + c);
		System.out.println("Сопротивление соединения = " + result);
		System.out.println("");
	}
}
