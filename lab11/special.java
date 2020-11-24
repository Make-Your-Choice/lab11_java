public class special {
	int bonus_num; //число бонусов
	int continuation; //длительность в днях
	public special() { //конструктор без параметров
		this.bonus_num = 5;
		this.continuation = 1;
	}
	public special(int a) { //конструктор с параметром для создания массива
		this.bonus_num = a;
		this.continuation = 1;
	}
	public void change_bonus_num (int a) { //изменение числа бонусов
		this.bonus_num = a;
	}
	public void change_continuation(int a) { //изменение длительности
		this.continuation = a;
	}
	public void output() { //вывод 
		System.out.printf("Number of bonuses: %d\nContinuation: %d\n", bonus_num, continuation);
	}
	public void reduce_bonus() { //сокращение числа бонусов
		System.out.println("\nDecreasing number of bonuses");
		this.bonus_num = bonus_num - 2;
		System.out.println("Number of bonuses decreased on 2");
	}
	public void set_default() { //установка значений по умолчанию
		this.bonus_num = 5;
		this.continuation = 1;
	}
}