
package edu.ap.eightball.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import edu.ap.eightball.models.Question;
import org.springframework.context.annotation.Scope;
import edu.ap.eightball.redis.RedisService;

@Controller
@Scope("session")
public class eightballController {

   private RedisService service; // pattern : "movies":movieName:GenreName:Grade

   @Autowired
   public void setRedisService(RedisService service) {
      this.service = service;
   }

   @GetMapping("/")
   public String index() {
      return "redirect:/home";
   }

}
