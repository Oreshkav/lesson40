package man;

public class Men extends Person {

  public Men(String name){
    super(name);
  }

  @Override
  public void helloPerson() {
    System.out.printf("Mужчина по имени %s%n", name);
  }
}
