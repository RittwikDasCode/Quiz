package com.question.service;

import java.util.List;

import com.question.entity.Question;

public interface QuestionService {

	//create
	Question create(Question question);
	
	//get
	List<Question> get();
	
	//getById
	Question getById(Long id);
	
	List<Question> getQuestionsOFQuiz(Long quizId);
}
