package com.example.springbootquizapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data  // no need to create getters and setters
@Entity
@Table(name = "questiondb")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String questionTitle;

    private String option1;
    private String option2;
    private String option3;
    private String option4;

    private String rightAnswer;

    private String difficultylevel;
    private String category;


}
