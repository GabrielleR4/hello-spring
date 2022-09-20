package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")

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
// @GetMapping("hello/{name}")
       //  @ResponseBody
 //public String helloWithPathParam(@PathVariable String name) {
  //      return "Hello," + name + "!";

 //}

//lives at /hello/form
   @GetMapping
   public String helloForm()

    {
      String html =   "<html>" +
                "<body>" +
                "<form method ='get' action= '/hello'>" + //submit a request to /hello
                "<input type ='text' name ='name'/>" +
                "<input type = 'submit' value= 'Greet me! />" +
                "</form>" +
                "</body>" +
                "</html>";
      return html;
    }
 }







