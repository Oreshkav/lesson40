package man;

public class Men extends Man {

  public Men(String name){
    super(name);
  }

  public void helloMan() {
    System.out.printf("Mужчина по имени %s%n", name);
  }
}
