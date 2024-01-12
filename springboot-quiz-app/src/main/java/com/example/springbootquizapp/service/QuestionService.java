package com.example.springbootquizapp.service;

import com.example.springbootquizapp.dao.QuestionDao;
import com.example.springbootquizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questiondao;
 public List<Question> getAllQuestions(){
    return questiondao.findAll();
 }
}
