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

  @Override
  public String toString(){
    return String.format("Человек по имени %s", name);
    }

    public String helloMan(){
    return String.format("Я родился!");
    }
}
