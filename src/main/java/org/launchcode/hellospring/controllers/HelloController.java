package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/hello")

public class HelloController {
//Handles request at path /hello
   // @GetMapping("hello")

 /* @ResponseBody
 public String hello()   {
     return "Hello, Spring!";
 }*/
//lives at /hello/goodbye
    @GetMapping("goodbye")

    public String goodbye()   {
        return "Goodbye Spring";
    }


    // Handles request of the form hello?name=LaunchCode
   //Responds to get and post at /hello?name=LaunchCoder
    @RequestMapping ( method = {RequestMethod.GET, RequestMethod.POST})
//live at /hello/hello
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }
//Handles requests of the form /hello/LaunchCode
 // @GetMapping("{name}")
       //  @ResponseBody
 //public String helloWithPathParam(@PathVariable String name) {
   //    return "Hello," + name + "!";

// }

//lives at /hello/form
    @RequestMapping(value = "hello", method= RequestMethod.GET)
   @GetMapping()
   public String helloForm()

    {
      String html =   "<html>" +
                "<body>" +
                "<form method = 'post'> " +
             // " action= '/hello'>" + //submit a request to /hello
                "<input type ='text' name ='name'/>" +
              "</br></br>"+
              "<select name= 'language' id='lang'>"+
               "<option value = 'Fi'>Finnish</option>" +
              "<option value = 'Sp'> Spanish</option>" +
              "<option value = 'Ta'>Tagalog</option> " +
              "<option value = 'Po'>Polish</option> " +
              "<option value = 'Ir'>Irish</option>" +
             " <option value = 'Si'>Sinhala</option>"+
              "</br></br>" +
                "<input type = 'submit' value= 'Greet me!' />" +
                "</form>" +
                "</body>" +
                "</html>";
      return html;
    }
    @RequestMapping(method = RequestMethod.POST, value = "hello")
    public static String createMessage(@RequestParam String name,@RequestParam String language){
        if(name.equals("")){
            name = "World";
        }

        String greeting = "";
        if(language.equals("Fi")){
            greeting = "Moi, ";
        }
        else if (language.equals("Sp")){
            greeting = "Hola, ";
        }
        else if (language.equals("Ta")){
            greeting = "Kumusta, ";
        }
        else if (language.equals("Po")){
            greeting = " Siema, ";
        }
        else if (language.equals("Ir")){
            greeting = "Dia duit, ";
        }
        else if (language.equals("Si")){
            greeting= "Subha davasak, ";
        }
        return greeting + name + "!";
    }
 }







