package com.example.thymleaf.Repository;

import java.util.ArrayList;
import java.util.List;

public class ArmyRepository {

  private List<String> Soldiers = new ArrayList<>();

  public ArmyRepository() {


    Soldiers.add("Anders");
    Soldiers.add("Peter");
    Soldiers.add("Pia");
    Soldiers.add("Karen");
  }

  public List<String> getAll(){

    return Soldiers;
  }

}
