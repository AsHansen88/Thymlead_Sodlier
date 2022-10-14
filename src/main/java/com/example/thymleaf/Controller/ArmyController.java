package com.example.thymleaf.Controller;


import com.example.thymleaf.Repository.ArmyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ArmyController {

  ArmyRepository repo = new ArmyRepository();

  @GetMapping("/")
  public String getSoldier(Model model){

        model.addAttribute("soldierslist", repo.getAll());

    //Model = mælkekarton
    model.addAttribute("name", "Anders");
    model.addAttribute("age", "123");

    return "Soldier";

  }

}
