package man;

public class Woman extends Person {

  public Woman(String name){
    super(name);
  }

  @Override
  public void helloPerson() {
    System.out.printf("Женщина по имени %s%n", name);
  }

  @Override
  public void haveBorn() {
    System.out.println("Я родилась!");
  }

}
