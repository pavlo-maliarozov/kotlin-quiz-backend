package com.quiz.react.quiz.service

import com.quiz.react.quiz.model.Question
import com.quiz.react.quiz.repository.QuestionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class QuestionServiceImpl : QuestionService {

    @Autowired
    lateinit var questionRepository: QuestionRepository;

    override fun getQuestions(): MutableIterable<Question> {
        val questions = questionRepository.findAll();

        return questions;
    }


}
