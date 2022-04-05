package by.epam.laskin.basics_of_software_code_development;

import java.util.Scanner;

public class Task_1_19 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int numberTask;
		String info;

		info = "Выберете задание:\n";
		info += "Линейные программы (1-6).\n";
		info += "Ветвления (7-11).\n";
		info += "Циклы (12-19).\n";
		info += "Выход (0).\n";
		info += " >> ";

		numberTask = -1;

		while (numberTask != 0) {

			numberTask = inputCansole(info);
			taskMenu(numberTask);
		}
	}

	public static int inputCansole(String text) {

		int value;

		do {
			System.out.print(text);

			while (!scan.hasNextInt()) {
				System.out.print(text);
				scan.nextLine();
			}
			value = scan.nextInt();

		} while (value < 0 && value > 19);

		return value;
	}

	public static double inputDouble(String text) {

		double value;

		System.out.print(text);

		while (!scan.hasNextDouble()) {
			System.out.print(text);
			scan.nextLine();
		}

		value = scan.nextDouble();

		return value;
	}

	public static double inputDoublePositive(String text) {

		double value;

		do {
			System.out.print(text);

			while (!scan.hasNextDouble()) {
				System.out.print(text);
				scan.nextLine();
			}
			value = scan.nextDouble();
		} while (value < 0);

		return value;
	}

	public static int inputInt(String text) {

		int value;

		System.out.print(text);

		while (!scan.hasNextInt()) {
			System.out.print(text);
			scan.nextLine();
		}

		value = scan.nextInt();

		return value;
	}

	public static int inputIntPositive(String text) {

		int value;

		do {
			System.out.print(text);

			while (!scan.hasNextInt()) {
				System.out.print(text);
				scan.nextLine();
			}

			value = scan.nextInt();
		} while (value < 0);

		return value;
	}

	public static void taskMenu(int numberTask) {

		switch (numberTask) {
		case 1:
			taskOne();
			break;
		case 2:
			taskTwo();
			break;
		case 3:
			taskThree();
			break;
		case 4:
			taskFour();
			break;
		case 5:
			taskFive();
			break;
		case 6:
			taskSix();
			break;
		case 7:
			taskSeven();
			break;
		case 8:
			taskEight();
			break;
		case 9:
			taskNine();
			break;
		case 10:
			taskTen();
			break;
		case 11:
			taskEleven();
			break;
		case 12:
			taskTwelve();
			break;
		case 13:
			taskThirteen();
			break;
		case 14:
			taskFourteen();
			break;
		case 15:
			taskFifteen();
			break;
		case 16:
			taskSixteen();
			break;
		case 17:
			taskSeventeen();
			break;
		case 18:
			taskEighteen();
			break;
		case 19:
			taskNineteen();
			break;
		case 0:
			exit();
			break;
		default:
			System.out.println("Ошибка выбора задания!");
		}
	}

	/*
	 * Линейные программы (1 - 6).
	 */

	public static void taskOne() {

		/*
		 * Задание 1 (1): Найдите значение функции:z = ((a – 3) * b / 2) + c.
		 */

		double a;
		double b;
		double c;
		double z;

		System.out.println();

		a = inputDouble("a >> ");
		b = inputDouble("b >> ");
		c = inputDouble("c >> ");

		z = ((a - 3) * b / 2) + c;

		System.out.println("Полученое z= " + z + "\n");
	}

	public static void taskTwo() {

		/*
		 * Задание 2 (2): Вычислить значение выражения по формуле (все переменные
		 * принимают действительные значения): z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a
		 * * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(1 / b, 2);
		 */

		double a;
		double b;
		double c;
		double z;

		System.out.println();

		a = inputDouble("a >> ");
		b = inputDouble("b >> ");
		c = inputDouble("a >> ");

		z = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		z /= (2 * a);
		z -= Math.pow(a, 3) * c;
		z += Math.pow(1 / b, 2);

		System.out.println("Полученое z = " + z + "\n");
	}

	public static void taskThree() {

		/*
		 * Задание 3 (3): Вычислить значение выражения по формуле (все переменные
		 * принимают действительные значения): z = (Math.sin(x) + Math.cos(y)) /
		 * (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
		 */

		double x;
		double y;
		double z;

		System.out.println();

		x = inputDouble("x >> ");
		y = inputDouble("y >> ");
		z = inputDouble("z >> ");

		z = Math.sin(x) + Math.cos(y);
		z /= (Math.cos(x) - Math.sin(y));
		z *= Math.tan(x * y);

		System.out.println("Полученое z=" + z + "\n");
	}

	public static void taskFour() {

		/*
		 * Задание 4 (4): Дано действительное число R вида nnn.ddd (три цифровых разряда
		 * в дробной и целой частях). Поменять местами дробную и целую части числа и
		 * вывести полученное значение числа.
		 */

		double r;
		double count;

		System.out.println();

		r = inputDouble("Введите действительное число формата (nnn,ddd) x >> ");

		count = Math.ceil((r % 1) * 1000);
		count += Math.floor(r) / 1000;

		System.out.println("Перевернутое значение =" + count + "\n");
	}

	public static void taskFive() {

		/*
		 * Задание 5 (5): Дано натуральное число Т, которое представляет длительность
		 * прошедшего времени в секундах. Вывести данное значение длительности в часах,
		 * минутах и секундах в следующей форме: ННч ММмин SSc.
		 */

		int t;
		int hours;
		int minutes;
		int seconds;

		System.out.println();

		t = inputInt("Введите время в секундах T >> ");

		hours = t / 60 / 60;

		minutes = (t / 60) - (hours * 60);

		seconds = t - (hours * 60 * 60) - (minutes * 60);

		System.out.println("Время:" + hours + "ч " + minutes + "мин " + seconds + "с" + "\n");
	}

	public static void taskSix() {

		/*
		 * Задание 6 (6): Для данной области составить линейную программу, которая
		 * печатает true, если точка с координатами (х, у) принадлежит закрашенной
		 * области, и false — в противном случае:
		 */

		int x;
		int y;
		boolean xy;

		System.out.println();

		x = inputInt("Введите координату x >> ");
		y = inputInt("Введите координату y >> ");

		xy = (((x <= 4) && (x >= -4) && (y < 0) && (y <= -3)) || ((x <= 2) && (x >= -2) && (y > 0) && (y <= 4))) ? true
				: false;

		System.out.println("Координаты точки (x, y) относиться к области?\n" + xy + "\n");
	}

	/*
	 * Ветвеления (7 - 11).
	 */

	public static void taskSeven() {

		/*
		 * Задание 1 (7): Даны два угла треугольника (в градусах). Определить,
		 * существует ли такой треугольник, и если да, то будет ли он прямоугольным.
		 */

		int x;
		int y;

		System.out.println();

		x = inputIntPositive("Введите координаты точки x >> ");
		y = inputIntPositive("Введите координаты точки y >> ");

		if ((180 - (x + y) > 0) && (180 - (x + y) == 90)) {
			System.out.println("Треугольник существует и он прямоугольный.\n");
		} else if ((180 - (x + y)) > 0) {
			System.out.println("Треугольник существует.\n");
		} else {
			System.out.println("Треугольник не существует.\n");
		}
	}

	public static void taskEight() {

		/*
		 * Задание 2 (8): Найти max{min(a, b), min(c, d)}.
		 */

		int a;
		int b;
		int d;
		int c;

		int min;
		int max;

		System.out.println();

		a = inputInt("Введите число a >> ");
		b = inputInt("Введите число b >> ");
		c = inputInt("Введите число c >> ");
		d = inputInt("Введите число d >> ");

		if (a < b) {
			min = a;
		} else {
			min = b;
		}

		if (c < d) {
			max = (min > c) ? min : c;
		} else {
			max = (min > d) ? min : d;
		}

		System.out.println("max{ min(" + a + ", " + b + "), min(" + c + ", " + d + ") }=" + max + "\n");
	}

	public static void taskNine() {

		/*
		 * Задание 3 (9): Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить,
		 * будут ли они расположены на одной прямой.
		 */

		int x1;
		int x2;
		int x3;

		int y1;
		int y2;
		int y3;

		System.out.println();

		x1 = inputInt("Введите координату точки А(x1,y1) x1 >> ");
		y1 = inputInt("Введите координату точки А(x1,y1) y1 >> ");

		x2 = inputInt("Введите координату точки B(x2,y2) x2 >> ");
		y2 = inputInt("Введите координату точки B(x2,y2) y2 >> ");

		x3 = inputInt("Введите координату точки C(x3,y3) x3 >> ");
		y3 = inputInt("Введите координату точки C(x3,y3) y3 >> ");

		if ((x1 == x2) && (x1 == x3) && (y1 == y2) && (y1 == y3)) {
			System.out.println("Точки A,B,C имеют одинаковые координаты.\n");

		} else if ((y1 == y2) && (y1 == y3)) {
			System.out.println("Точки A,B,C находятся на одно прямой.\n");

		} else if ((x1 == x2) && (x1 == x3)) {
			System.out.println("Точки A,B,C находятся на одно прямой.\n");

		} else {
			System.out.println("Точки A,B,C не находятся на одной прямой.\n");
		}
	}

	public static void taskTen() {

		/*
		 * Задание 4 (10): Заданы размеры А, В прямоугольного отверстия и размеры х, у,
		 * z кирпича. Определить, пройдет ли кирпич через отверстие.
		 */

		int x;
		int y;

		int z;
		int a;
		int b;

		System.out.println();

		a = inputInt("Введите значение высоты прямоугольного отверстия A >> ");
		b = inputInt("Введите значение ширины прямоугольного отверстия B >> ");

		z = inputInt("Введите значение высоты кирпича z >> ");
		y = inputInt("Введите значение ширины кирпича y >> ");
		x = inputInt("Введите значение длинны кирпича x >> ");

		if (((a > z) || (a > y) || (a > x)) && ((b > z) || (b > y) || (b > x))) {
			System.out.println("Кирпич проходит через отверстие A, B.\n");

		} else {
			System.out.println("Кирпич не проходит через отверстие A, B.\n");
		}
	}

	public static void taskEleven() {

		/*
		 * Задание 5 (11): Вычислить значение функции: F(x)= {x^2 - 3x + 9, если x <= 3}
		 * {1 / (x^3 + 6), если x > 3}
		 */

		double x;

		System.out.println();

		x = inputDouble("Введите значение x >> ");

		if (x <= 3) {
			x = (x * x) - 3 * x + 9;

		} else {
			x = 1 / ((x * x * x) + 6);
		}

		System.out.print("F(x)=" + x + "\n");
	}

	/*
	 * Циклы (12 - 19).
	 */

	public static void taskTwelve() {

		/*
		 * Задание 1 (12): Напишите программу, где пользователь вводит любое целое
		 * положительное число. А программа суммирует все числа от 1 до введенного
		 * пользователем числа.
		 */

		int x;
		long sum;

		System.out.println();

		sum = 0;

		do {
			x = inputIntPositive("Введите значение x >> ");
		} while ((x == 0) || (x == 1));

		for (int i = 1; i <= x; i++) {
			sum += i;
		}

		System.out.println("Cумма всех чисел от 1 до " + x + " равна:" + sum + "\n");
	}

	public static void taskThirteen() {

		/*
		 * Задание 2 (13): Вычислить значения функции на отрезке [а,b] c шагом h: y =
		 * {x, если x > 2} {-x, если x <= 2}
		 */

		int a;
		int b;
		int h;
		int x;
		int y;

		System.out.println();

		a = inputInt("Введите начало отрезка [a,b] a = ");
		b = inputInt("Введите конец отрезка [a,b] b = ");
		h = inputIntPositive("Введите шаг h = ");

		for (int i = a; i <= b; i += h) {

			x = i;
			y = (x > 2) ? x : (x * -1);

			System.out.print("y=" + y + "; ");
		}
		System.out.println("\n");
	}

	public static void taskFourteen() {

		/*
		 * Задание 3 (14): Найти сумму квадратов первых ста чисел.
		 */

		int sum;

		sum = 0;

		for (int i = 1; i <= 100; i++) {

			sum += (i * i);
		}
		System.out.println("Cумма всех квадратов чисел от 1 до 100 равна:" + sum);
	}

	public static void taskFifteen() {

		/*
		 * Задание 4 (15): Составить программу нахождения произведения квадратов первых
		 * двухсот чисел.
		 */

		long sum;
		long maxNumber;

		int count;

		count = 0;
		maxNumber = 0;
		sum = 1;

		for (int i = 1; i <= 200; i++) {

			maxNumber = sum;
			sum *= (i * i);

			if (sum <= 0) {

				System.out.println("Привышен максимальный диапазон long!" + maxNumber);
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println("Произведение первых 200 чисел = " + sum);
		} else {
			System.out.println("Последнее число не привышающее значение long = " + sum);
		}

		/*
		 * Решение задачи с использованием класса BigInteger:
		 * 
		 * BigInteger sum = BigInteger.valueOf(1);
		 * 
		 * for (int i = 1; i <= 200; i++) {
		 * 
		 * sum = sum.multiply(BigInteger.valueOf(i * i)); }
		 * 
		 * System.out.print("Произведение всех квадратов чисел от 1 до 200 равна:" +
		 * maxNumber);
		 */
	}

	public static void taskSixteen() {

		/*
		 * Задание 5 (16): Даны числовой ряд и некоторое число е. Найти сумму тех членов
		 * ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
		 * an = 1 / 2^n + 1 / 3^n.
		 */

		double e;
		double a;
		double numberSeries;
		double sum;

		sum = 0;

		System.out.println();

		e = inputDouble("Введите число e = ");

		numberSeries = inputDoublePositive("Введите числовой ряд = ");

		for (int i = 1; i <= numberSeries; i++) {

			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

			if ((Math.abs(a)) >= e) {
				sum += a;
			}
		}
		System.out.println("|a| >= e Сумма равна:" + sum);
	}

	public static void taskSeventeen() {

		/*
		 * Задание 6 (17): Вывести на экран соответствий между символами и их численными
		 * обозначениями в памяти компьютера.
		 */

		System.out.println();

		for (int i = 32; i <= 126; i++) {

			System.out.println("Символ: '" + (char) i + "' Код символа: " + i);
		}
	}

	public static void taskEighteen() {

		/*
		 * Задание 7 (18): Для каждого натурального числа в промежутке от m до n вывести
		 * все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
		 */

		int m;
		int n;

		System.out.println();

		m = inputIntPositive("Введите промежуток от m до n m = ");
		n = inputIntPositive("Введите промежуток от m до n n = ");

		for (int i = m; i <= n; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					System.out.println("Делится " + i + " на " + j + ";");
				}
			}
		}
		System.out.println();
	}

	public static void taskNineteen() {

		/*
		 * Задание 8 (19): Даны два числа. Определить цифры, входящие в запись как
		 * первого так и второго числа.
		 */

		int m;
		int n;
		int x;
		int y;

		System.out.println();

		n = inputIntPositive("Введите число n = ");
		m = inputIntPositive("Введите число m = ");
		;

		System.out.print("Входящие в запись первого и втрого числа цифры: ");

		for (int i = m; i != 0; i /= 10) {

			x = i % 10;

			for (int j = n; j != 0; j /= 10) {

				y = j % 10;

				if (x == y) {

					System.out.print(x + " ");
				}
			}
		}
		System.out.println();
	}

	public static void exit() {

		System.out.print("Выход из программы");
		scan.close();
	}
}
