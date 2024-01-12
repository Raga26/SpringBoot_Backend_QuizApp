package com.example.springbootquizapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {

        @RequestMapping("allQuestions")
        public String getAllQuestions(){
            return "all questions";
        }
}
