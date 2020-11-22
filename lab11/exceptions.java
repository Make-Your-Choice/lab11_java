class exceptions extends Exception { //класс для обработки исключений
	private int type; //тип исключения
	exceptions(int a) { //конструктор
		type = a;
	}
	public String toString() { //вывод ошибки
		if(type==1)
			return "Incorrect value\n";
		else
			return "Unexpected error\n";
	}
}