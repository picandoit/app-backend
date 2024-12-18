package com.example.kahootcl.Service;

import com.example.kahootcl.entity.Quiz;

public interface QuizService {

    Quiz save(Quiz quiz);

    Quiz getQuizById(long id);
}
