package man;

public class Person {
  String name;

  public Person(String name){
    this.name = name;
  }

  public void setName(String name){
    this.name = name;
  }

    public String getName(){
    return name;
    }

  public void helloMan() {
    System.out.printf("Человек по имени %s%n", name);
  }

  public void haveBorn() {
    System.out.println("Я родился!");
  }
}