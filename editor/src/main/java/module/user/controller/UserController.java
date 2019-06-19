package module.user.controller;

import org.json.JSONObject;
import org.sonar.api.internal.google.gson.JsonObject;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for User Module
 * @author Yves Laurent
 * @version 1.0
 */

@RestController
@RequestMapping("/")
public class UserController {
	
   @RequestMapping(value="/demo", method = RequestMethod.GET, produces = "application/json")
   @ResponseBody
   public JSONObject showDemo(ModelMap model) {
	   JSONObject obj = new JSONObject();
	   obj.put("male", true);
	   obj.put("age", 21);
      //model.addAttribute("msgArgument", "Maven Java Web Application Project: Success!");
      return obj;
   }

}
