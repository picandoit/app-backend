package com.example.kahootcl.Service;

import com.example.kahootcl.entity.Quiz;
import com.example.kahootcl.exception.ApiException;
import com.example.kahootcl.repository.QuizRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;

    @Autowired
    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Transactional
    @Override
    public Quiz save(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Transactional
    @Override
    public Quiz getQuizById(long id) {
        return quizRepository.findById(id).orElseThrow(()-> new ApiException("Quiz not found with ID: " + id, HttpStatus.NOT_FOUND));
    }

    //TODO: create dto and change the return types.
}
