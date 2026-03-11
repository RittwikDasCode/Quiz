package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entity.Question;
import com.question.service.QuestionService;

@RestController
@RequestMapping("/api/question")
public class QuestionController {

	@Autowired
	QuestionService questionService;
	
	@PostMapping
	public Question create(@RequestBody Question question) {
		return questionService.create(question);
	}
	
	@GetMapping
	public List<Question> getAll(){
		return questionService.get();
	}
	
	@GetMapping("questionId")
	public Question getById(@PathVariable Long questionId){
		return questionService.getById(questionId);
	}
	
	//get questions of specific quiz
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionOfQuiz(@PathVariable Long quizId){
		return questionService.getQuestionsOFQuiz(quizId);
	}
}
