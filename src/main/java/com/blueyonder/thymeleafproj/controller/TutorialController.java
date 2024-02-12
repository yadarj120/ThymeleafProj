package com.blueyonder.thymeleafproj.controller;


import com.blueyonder.thymeleafproj.model.Tutorial;
import com.blueyonder.thymeleafproj.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class TutorialController {

        @Autowired
        private TutorialService tutorialService;

        @GetMapping("/")
        public String tutorial(Model model) {
                List<Tutorial> tutorials = tutorialService.getAllTutorials();
                model.addAttribute("tutorials", tutorials);
                return "index";
        }

        @GetMapping("/new")
        public String newTutorial(Model model) {
//            model.addAttribute("editMode", NullValue.class);
//            return "new";
                return "test";
        }

//        @GetMapping("/edit/{title}")
//        public String editTutorial() {
//            // get the data from the database for the current title
//            // and fill the form with the data
//            // and return new template with the given data filled in the form
//
//        }
//
//        @GetMapping("/delete/{title}")
//        public String deleteTutorial() {
//            // delete the tutorial with the given title
//            // and redirect to the /tutorial
//        }
//
//        @PostMapping("/save")
//        public String saveTutorial() {
//            // save the tutorial to the database
//            // and redirect to the /tutorial
//        }


}
