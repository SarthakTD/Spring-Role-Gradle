package com.bmt.Spring.repository;

import com.bmt.Spring.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
