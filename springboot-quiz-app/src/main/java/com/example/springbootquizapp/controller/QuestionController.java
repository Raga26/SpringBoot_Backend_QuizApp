package com.example.springbootquizapp.controller;

import com.example.springbootquizapp.model.Question;
import com.example.springbootquizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
        @RequestMapping("allQuestions")
        public List<Question> getAllQuestions(){

            var value =  questionService.getAllQuestions();
            return value ;
        }
}
