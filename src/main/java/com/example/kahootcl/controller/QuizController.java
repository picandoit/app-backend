package com.example.kahootcl.controller;

import com.example.kahootcl.Service.QuizServiceImpl;
import com.example.kahootcl.entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable Long id){
        return quizService.getQuizById(id);
    }
    //TODO: create dto and change the return types.
}
