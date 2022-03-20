package com.cydeo.controller;

import com.cydeo.enums.GENDER;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/another")
public class AnotherController {

    @RequestMapping("/table")   // localhost:8080/another/table
    public String mentorPractice(Model model){
        List<Mentor> list=new ArrayList<>();
        list.add(new Mentor("Mike","Smith",45, GENDER.MALE));
        list.add(new Mentor("Tom","Hanks",65, GENDER.MALE));
        list.add(new Mentor("Ammy","Bryan",25, GENDER.FEMALE));
        list.add(new Mentor("Simai","Hashim",26, GENDER.MALE));

        model.addAttribute("mentors",list);


        return "mentor/mentor-list";
    }

}
