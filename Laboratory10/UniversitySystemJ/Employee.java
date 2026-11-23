import java.util.Date;

public abstract class Employee {

	public int ssNo;
	public String name;
	public String email;
	public static int counter;

	public static void main(String[] args) {

		University uni = new University();
		Faculty f1 = new Faculty();
		Institute inst = new Institute();
		AdministrativeEmployee dean = new AdministrativeEmployee();
		Lecturer lec = new Lecturer();
		Course c = new Course();
		Project p = new Project();
		Participation part = new Participation();

		uni.name = "Воронежский государственный университет";

		f1.name = "Факультет компьютерных наук";

		inst.name = "ПиИТ";
		inst.address = "г. Воронеж, Университетская площадь, 1";

		dean.ssNo = 1001;
		dean.name = "Крыловецкий А.А.";
		dean.email = "dean@cs.vsu.ru";
		counter++;

		lec.ssNo = 2001;
		lec.name = "Нужных А.В.";
		lec.email = "nyzhnix@cs.vsu.ru";
		lec.fieldOfStudy = "Linux";
		counter++; // Увеличиваем счетчик сотрудников

		c.name = "Основы Linux";
		c.id = 101;
		c.hours = 4.0f;

		p.name = "Разработка сценариев bash";
		p.start = new Date();
		p.end = new Date(System.currentTimeMillis() + 86400000L * 30);

		part.hours = 120;

		f1.dean = dean;
		lec.teaches.add(c);


		System.out.println("==================================================");
		System.out.println("        УНИВЕРСИТЕТСКАЯ ИНФОРМАЦИОННАЯ СИСТЕМА      ");
		System.out.println("==================================================");
		System.out.println("Университет: " + uni.name);
		System.out.println("Факультет:   " + f1.name);
		System.out.println("Декан:       " + f1.dean.name + " (ID: " + f1.dean.ssNo + ")");
		System.out.println("Кафедра:     " + inst.name);
		System.out.println("Адрес:       " + inst.address);
		System.out.println("--------------------------------------------------");
		System.out.println("Сотрудник:   " + lec.name + " (ID: " + lec.ssNo + ")");
		System.out.println("Email:       " + lec.email);
		System.out.println("Исследования:" + lec.fieldOfStudy);
		System.out.println("Ведет курсы: " + lec.teaches.size() + " (Курс: \"" + c.name + "\", " + c.hours + " ч/нед)");
		System.out.println("Участие в проекте: \"" + p.name + "\" (" + part.hours + " часов)");
		System.out.println("--------------------------------------------------");
		System.out.println("Общее количество сотрудников в системе: " + counter);
		System.out.println("==================================================");

	}
}
