package com.example.thymleaf.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ArmyController {


  @GetMapping("/")
  public String getSoldier(Model model){

    //arrayliste der kommer fra db -> repository -> Serivce  -> Controller
    List<String> Soldiers = new ArrayList<>();
    Soldiers.add("Anders");
    Soldiers.add("Peter");
    Soldiers.add("Pia");

    model.addAttribute("soldierslist", Soldiers);

    //Model = mælkekarton
    model.addAttribute("name", "Anders");
    model.addAttribute("age", "123");

    return "Soldier";

  }

}
