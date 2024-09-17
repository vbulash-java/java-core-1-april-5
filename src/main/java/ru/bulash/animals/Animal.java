package ru.bulash.animals;

/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
 */
public abstract class Animal {
	private String name;

	protected int maxRun = 0;
	protected int maxSwim = 0;

	public int getMaxRun() {
		return maxRun;
	}

	public int getMaxSwim() {
		return maxSwim;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		this.setName(name);
	}

	public void run(int distance) {
		System.out.printf("%s пробежал(а) %d м.\n", name, Math.min(distance, getMaxRun()));
	}

	public void swim(int distance) {
		System.out.printf("%s проплыл(а) %d м.\n", name, Math.min(distance, getMaxSwim()));
	}
}
