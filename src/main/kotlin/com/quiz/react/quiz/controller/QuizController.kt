package com.quiz.react.quiz.controller

import com.quiz.react.quiz.service.QuestionServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class QuizController {

    @Autowired
    lateinit var questionService: QuestionServiceImpl;

    @GetMapping("/questions")
    fun questions(model: Model): ResponseEntity<Any> {
        return ResponseEntity.ok(questionService.getQuestions().toCollection(mutableListOf()));
    }
}