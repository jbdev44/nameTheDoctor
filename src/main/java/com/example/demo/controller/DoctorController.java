package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.lang.Integer.parseInt;

@Controller
public class DoctorController {
    @GetMapping("/doctor/")
    @ResponseBody
/*    public String index() {
        System.out.println("je suis dans le controleur");
        return "hello le wolrd";
    }*/

    public String index(@RequestParam String id) {
        System.out.println("je suis dans le controleur");
        Integer numberDoctor = parseInt(id) ;
        String name = "je suis dans une erruer";
        switch (numberDoctor) {
            case 1:
                name = "William Hartnell";
                break;
            case 2:
                name = "Patrick Troughton";
                break;
            case 3:
                name = "Jon Pertwee";
                break;
            case 4:
                name = "Tom baker";
            break;
            case 5:
                name = "Peter Davidson";
            break;
            case 6:
                name = "Colin Baker";
            break;
            case 7:
                name = "Sykvester McCoy";
            break;
            case 8:
                name = "Paul McGann";
            break;
            case 9:
                name = "Christopher Eccleston";
            break;
            case 10:
                name = "David Tennant";
            break;
            case 11:
                name = "Math Smith";
            break;
            case 12:
                name = "Peter Capaldi";
            break;
            case 13:
                name = "Jodie Whittaker";
            break;
        }
    return name ;
    }


}
