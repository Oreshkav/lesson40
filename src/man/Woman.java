package man;

public class Woman extends Man {

  public Woman(String name){
    super(name);
  }

  public void helloMan() {
    System.out.printf("Женщина по имени %s%n", name);
  }

  public void haveBorn() {
    System.out.println("Я родилась!");
  }

}
