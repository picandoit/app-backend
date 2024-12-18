package com.example.kahootcl.repository;

import com.example.kahootcl.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Long> {
    Optional<Quiz> findById(long id);
}

