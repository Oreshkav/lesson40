package man;

import java.security.PublicKey;

public class Man {
  String name;

  public Man(String name){
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
