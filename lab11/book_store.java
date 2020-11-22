public class book_store {
	special[] spec_offer = new special[10]; //бонусы
	int n =0;
	String title; //название
	String author; //автор
	String genre; //основной жанр
	int price=0; //цена
	int num_stock=0; //количество в магазине
	int popularity=0; //популярность
	static int space_left; //статическое поле отавшееся в магазине место
	public book_store(special spec_offer[]){ //конструктор с параметром
		n = 2;
		for (int i=0; i<n; i++)
		{
			this.spec_offer[i] = spec_offer[i];
		}
		System.out.printf("Empty book created\n");
	}
	public book_store(String str1, String str2, String str3, int a, int b, int c, int d, special spec_offer[]) { //конструктор с параметрами
		this.title = str1;
		this.author = str2;
		this.genre = str3;
		this.price = a;
		this.num_stock = b;
		this.popularity = c;
		this.n = d;
		for (int i = 0; i < n; i++)
		{
			this.spec_offer[i] = spec_offer[i];
		}
	}
	public String get_title() { //получение названия
		return title;
	}
	
	public String get_author() { //получение автора
		return author;
	}
	
	public String get_genre() { //получение жанра
		return genre;
	}
	
	public int get_price() { //получение цены
		return price;
	}
	
	public int get_num_stock() { //получение количества в магазине
		return num_stock;
	}
	
	public int get_popularity() { //получение популярности
		return popularity;
	}
	
	public void input(String str1, String str2, String str3, int a, int b, int c, int d) { //ввод
		title = str1;
		author = str2;
		genre = str3;
		price = a;
		num_stock = b;
		popularity = c;
		n = d;
	}
	void output() { //вывод
		System.out.println("\nYour book\n");
		System.out.printf("\nTitle: %s\nAuthor: %s\nGenre: %s\nPrice: %d\nNumber in stock: %d\nPopularity: %d", title, author, genre, price, num_stock, popularity);
		//System.out.printf("\nNumber of bonuses: ");
		for(int i = 0; i < n; i++)
		{
			spec_offer[i].output();
			//System.out.printf("%d ", spec_offer[i].bonus_num);
		}
		//System.out.printf("\n");
	}
	void sell() { //продажа
		System.out.println("\nPutting book on sale");
		num_stock = num_stock - 1;
		popularity = popularity + 5;
		System.out.println("Ony copy sold, popularity increased on 5");
	}
	void price_rise() { //повышение цены
		System.out.println("\nRising the price");
		price = price + 50;
		System.out.println("Price risen on 50");
	}
	void rearrange() { //перестановка
		System.out.println("\nRearranging books");
		popularity = popularity + 10;
		System.out.println("Books rearranged, popularity increased on 10");
	}
	void archivate() { //отправка на склад
		System.out.println("\nSending 4 books to the archive");
		num_stock = num_stock - 4;
		System.out.println("4 books now stored in archive");
	}
	void reduce_bonus() { //уменьшение числа бонусов
		for( int i = 0; i < n; i++)
		{
			this.spec_offer[i].reduce_bonus();
		}
	}
	int predictable_profit() { //подсчет ожидаемой прибыли через функцию
		return num_stock*price;
	}
	void predictable_profit(result a) { //подсчет ожидаемой прибыли через дополнительный класс
		a.value=num_stock*price;
	}
	static int genre_len(book_store book) { //статический метод подсчета длины строки 'жанр'
		return book.genre.length();
	}
	void title_author_compare() { //сравнение автора и названия
		if(title.equalsIgnoreCase(author))
			System.out.printf("\nTitle and author are the same\n");
		else
			System.out.printf("\nTitle and author are different\n");
	}
}
