package com.example.kahootcl.controller;

import com.example.kahootcl.Service.QuizServiceImpl;
import com.example.kahootcl.entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizServiceImpl quizService;

    @Autowired
    public QuizController(QuizServiceImpl quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz saveQuiz(@RequestBody Quiz requestQuiz){
      return  quizService.save(requestQuiz);
    }
}
