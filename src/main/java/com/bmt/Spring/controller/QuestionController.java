package com.bmt.Spring.controller;

import com.bmt.Spring.model.Question;
import com.bmt.Spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/question")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    // ✅ Only ADMIN can add question
    @PostMapping("/add")
    @PreAuthorize("hasRole('ADMIN')")
    public String addQuestion(@RequestBody Question question) {
        questionRepository.save(question);
        return "Question added.";
    }

    // ✅ STUDENT and ADMIN both can get questions (no restriction needed)
    @GetMapping
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
}
