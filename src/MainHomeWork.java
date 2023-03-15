import man.Person;
import man.Men;
import man.Woman;

import java.util.ArrayList;
import java.util.List;

public class MainHomeWork {
  public static void main(String[] args) {
   //Создайте класс "Человек", конструктор которого принимает
    // имя.
    //При попытке вывести объект этого класса на экран должна
    // выводиться строка "Человек по имени …".

    //Добавьте в класс "Человек" метод "приветствие", который
    // будет выводить строку: "Я родился!"

    //Создайте классы "Мужчина" и "Женщина", которые будут
    // наследниками класса "Человек".
    //Попытка вывести их на экран должна приводить к выводу
    // строки "Мужчина по имени …" или "Женщина по имени …"
    //Метод "приветствие" класса "Женщина" должен выводить
    // строку: "Я родилась!"

    List<Person> people = new ArrayList<>();

    Person women = new Woman("Veronica");
    people.add(women);

    Person men = new Men("Stiv");
    people.add(men);

    Person child = new Person("Chelovek");
    people.add(child);

    for (Person person : people){
      person.helloMan();
      person.haveBorn();
    }


  }
}