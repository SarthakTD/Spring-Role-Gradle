package com.bmt.Spring.controller;

import com.bmt.Spring.model.Answer;
import com.bmt.Spring.model.Question;
import com.bmt.Spring.model.User;
import com.bmt.Spring.repository.AnswerRepository;
import com.bmt.Spring.repository.QuestionRepository;
import com.bmt.Spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/answer")
public class AnswerController {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private UserRepository userRepository;

    // ✅ Student submits an answer
    @PostMapping
    public ResponseEntity<String> submitAnswer(@RequestParam Long questionId,
                                               @RequestBody String answerText,
                                               Authentication authentication) {
        Question question = questionRepository.findById(questionId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid question ID"));

        User user = userRepository.findByUsername(authentication.getName())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        Answer answer = new Answer();
        answer.setAnswer(answerText);
        answer.setQuestion(question);
        answer.setUser(user);
        answerRepository.save(answer);
        return ResponseEntity.ok("Answer submitted.");
    }

    // ✅ Admin views all answers
    @GetMapping("/all")
    public ResponseEntity<List<Answer>> getAllAnswers() {
        return ResponseEntity.ok(answerRepository.findAll());
    }
}
