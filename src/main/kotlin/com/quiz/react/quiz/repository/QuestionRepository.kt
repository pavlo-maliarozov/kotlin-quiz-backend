package com.quiz.react.quiz.repository

import com.quiz.react.quiz.model.Question
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface QuestionRepository: CrudRepository<Question, Long> {

}

