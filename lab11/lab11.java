import java.util.Scanner;
	
public class lab11 { //основной класс

public static boolean isParsable(String s) { //функция для проверки возможности преобразования строки в число
    try {
			Integer.parseInt(s);
		}
		catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int x = 0, y = 0, z = 0, n, m, r; //переменные
		int x2, y2;
		String x1, y1,z1;
		String s1, s2, s3; //строки
		Scanner in = new Scanner(System.in);
		result res = new result();
		int a, b, c;
		System.out.println("Input information about the 1 book\n"); //ввод информации о книге
		System.out.printf("Input number of specials: ");
		n = in.nextInt();
		special[] spec_offer1 = new special[n]; //одномерный массив
		for(int i = 0; i < n; i++) //ввод одномерного массива
		{
			spec_offer1[i] = new special(); //вызов конструктора без параметров
			System.out.printf("\nInput number of bonuses for %d special: ", i + 1);
			x2 = in.nextInt();
			spec_offer1[i].change_bonus_num(x2);
			System.out.printf("Input continuation for %d special: ", i + 1);
			y2 = in.nextInt();
			spec_offer1[i].change_continuation(y2);
		}
		System.out.printf("\nInput title: ");
		s1 = in.next();
		System.out.printf("Input author: ");
		s2 = in.next();
		System.out.printf("Input genre: ");
		s3 = in.next();
		r = 0;
		while(r == 0) //проверка корректности ввода цены
		{
			System.out.printf("Input price: ");
			r = 1;
			x1 = in.next();
			try {
				if (!isParsable(x1)) //если цена - цифра
					throw new exceptions(1);
				x = Integer.parseInt(x1);
			}
			catch (exceptions e) {
				System.out.printf("Incorrect value\n"); //сообщение об ошибке
				r = 0;
			}
			if (r==1)
			{
				continue;
			}
		}
		r = 0;
		while(r == 0) //проверка корректности ввода количества на складе
		{
			System.out.printf("Input number in stock: ");
			r = 1;
			y1 = in.next();
			try {
				if (!isParsable(y1)) //если количество на складе - цифра
					throw new exceptions(1);
				y = Integer.parseInt(y1);
			}
			catch (exceptions e) {
				System.out.printf("Incorrect value\n"); //сообщение об ошибке
				r = 0;
			}
			if (r==1)
			{
				continue;
			}
		}
		r = 0;
		while(r == 0) //проверка корректности ввода популярности
		{
			System.out.printf("Input popularity: ");
			r = 1;
			z1 = in.next();
			try {
				if (!isParsable(z1)) //если популярность - цифра
					throw new exceptions(1);
				z = Integer.parseInt(z1);
			}
			catch (exceptions e) {
				System.out.printf("Incorrect value\n"); //сообщение об ошибке
				r = 0;
			}
			if (r==1)
			{
				continue;
			}
		}
		book_store book1 = new book_store(s1, s2, s3, x, y, z, n, spec_offer1); //вызов конструктора с параметрами
		book1.get_title();
		book1.get_author();
		book1.get_genre();
		book1.get_price();
		book1.get_num_stock();
		book1.get_popularity();
		book1.output(); //вывод
		book1.sell(); //продажа
		book1.output();
		book1.price_rise(); //повышение цены
		book1.output();
		book1.rearrange(); //перестановка
		book1.output();
		book1.archivate(); //отправка на склад
		book1.output();
		book1.reduce_bonus(); //уменьшение количества бонусов для одномерного массива
		book1.output();
		a = book1.predictable_profit();
		System.out.printf("\nPredictable profit (using func): %d", a); //возврат значения через функцию
		book1.predictable_profit(res);
		c=res.value;
		System.out.printf("\nPredictable profit (using class arg): %d", c);  //возврат значения через дополнительный класс
		System.out.printf("\n\nLength of the 'genre' (static method): %d\n", book_store.genre_len(book1));  //подсчет длины строки 'жанр' через статический метод
		book1.space_left = 50;
		System.out.printf("\nSpace left in the store (static field): %d\n", book1.space_left); //вывод оставшегося места в книжном магазине через статическое поле
		book1.title_author_compare(); //сравнение автора и названия
		//Scanner inp = new Scanner(System.in);
		System.out.println("Input information about the 2 book\n"); //ввод информации о книге
		System.out.printf("Input number of specials (n and m): ");
		n = in.nextInt();
		m = in.nextInt();
		special[][] spec_offer2 = new special[n][m]; //двумерный массив
		for(int i = 0; i < n; i++) //ввод двумерного массива
		{
			for(int j = 0; j < m; j++)
			{
				spec_offer2[i][j] = new special(); //вызов конструктора без параметров
				System.out.printf("\nInput number of bonuses for [%d][%d] special: ", i + 1, j + 1);
				x2 = in.nextInt();
				spec_offer2[i][j].change_bonus_num(x2);
				System.out.printf("Input continuation for [%d][%d] special: ", i + 1, j + 1);
				y2 = in.nextInt();
				spec_offer2[i][j].change_continuation(y2);
			}
		}
		System.out.printf("\nInput title: ");
		s1 = in.next();
		System.out.printf("Input author: ");
		s2 = in.next();
		System.out.printf("Input genre: ");
		s3 = in.next();
		r = 0;
		while(r == 0) //проверка корректности ввода цены
		{
			System.out.printf("Input price: ");
			r = 1;
			x1 = in.next();
			try {
				if (!isParsable(x1)) //если цена - цифра
					throw new exceptions(1);
				x = Integer.parseInt(x1);
			}
			catch (exceptions e) {
				System.out.printf("Incorrect value\n"); //сообщение об ошибке
				r = 0;
			}
			if (r==1)
			{
				continue;
			}
		}
		r = 0;
		while(r == 0) //проверка корректности ввода количества на складе
		{
			System.out.printf("Input number in stock: ");
			r = 1;
			y1 = in.next();
			try {
				if (!isParsable(y1)) //если количество на складе - цифра
					throw new exceptions(1);
				y = Integer.parseInt(y1);
			}
			catch (exceptions e) {
				System.out.printf("Incorrect value\n"); //сообщение об ошибке
				r = 0;
			}
			if (r==1)
			{
				continue;
			}
		}
		r = 0;
		while(r == 0) //проверка корректности ввода популярности
		{
			System.out.printf("Input popularity: ");
			r = 1;
			z1 = in.next();
			try {
				if (!isParsable(z1)) //если популярность - цифра
					throw new exceptions(1);
				z = Integer.parseInt(z1);
			}
			catch (exceptions e) {
				System.out.printf("Incorrect value\n"); //сообщение об ошибке
				r = 0;
			}
			if (r==1)
			{
				continue;
			}
		}
		book_store book2 = new book_store(s1, s2, s3, x, y, z, n, m, spec_offer2); //вызов конструктора с параметрами
		in.close();
		book2.get_title();
		book2.get_author();
		book2.get_genre();
		book2.get_price();
		book2.get_num_stock();
		book2.get_popularity();
		book2.output1(); //вывод
		book2.sell(); //продажа
		book2.output1();
		book2.price_rise(); //повышение цены
		book2.output1();
		book2.rearrange(); //перестановка
		book2.output1();
		book2.archivate(); //отправка на склад
		book2.output1();
		book2.reduce_bonus1(); //уменьшение количества бонусов для двумерного массива
		book2.output1();
		a = book2.predictable_profit();
		System.out.printf("\nPredictable profit (using func): %d", a); //возврат значения через функцию
		book2.predictable_profit(res);
		c=res.value;
		System.out.printf("\nPredictable profit (using class arg): %d", c);  //возврат значения через дополнительный класс
		System.out.printf("\n\nLength of the 'genre' (static method): %d\n", book_store.genre_len(book2));  //подсчет длины строки 'жанр' через статический метод
		book2.space_left = 50;
		System.out.printf("\nSpace left in the store (static field): %d\n", book2.space_left); //вывод оставшегося места в книжном магазине через статическое поле
		book2.title_author_compare(); //сравнение автора и названия
		
		special spec_offer3[] = new special[2];
		System.out.println("\nMassive using constructor with a single parameter\n");
		for(int i = 0; i < 2; i ++)
		{
			spec_offer3[i] = new special(10); //вызов конструктора с одним параметром для создания массива
		}
		System.out.println("\nSpecial offers\n");
		for(int i = 0; i < 2; i ++)
		{
			spec_offer3[i].output();
		}
	}
}

	