package ru.bulash;

import ru.bulash.animals.*;

/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
 */
public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[10];    // Далее подсчитаем количество реально созданных животных, не просто длину массива
		Cat cat = new Cat("Барсик");
		cat.run(100);
		cat.swim(50);
		animals[0] = cat;

		animals[1] = new Cat("Маруся");
		animals[1].run(300);    // Здесь будет отсечка = превышение максимума
		animals[1].swim(20);
		animals[2] = new Cat("Петрович");
		animals[2].run(50);
		animals[2].swim(30);
		animals[3] = new Cat("Василий");
		animals[3].run(83);
		animals[3].swim(22);

		System.out.println();

		animals[4] = new Dog("Шарик");
		animals[4].run(250);
		animals[4].swim(10);
		animals[5] = new Dog("Тузик");
		animals[5].run(300);
		animals[5].swim(20);
		animals[6] = new Dog("Барбос");
		animals[6].run(1050);
		animals[6].swim(100500);

		System.out.println();

		int[] count = new int[3];    // Количество котов, собак и вообще животных
		for (Animal animal : animals) {
			if(animal != null) {	// Без этого животных будет 10, что неверно
				count[2]++;
			}
			if (animal instanceof Cat) {
				count[0]++;
			} else if (animal instanceof Dog) {
				count[1]++;
			}
		}

		System.out.printf(
				"""
						Всего животных:
						\t- Котов: %d
						\t- Собак: %d
						\t- Всего: %d""",
				count[0], count[1], count[2]);
	}
}
