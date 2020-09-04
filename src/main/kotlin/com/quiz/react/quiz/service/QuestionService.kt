package com.quiz.react.quiz.service

import com.quiz.react.quiz.model.Question

interface QuestionService {
    fun getQuestions(): MutableIterable<Question>;
}