package com.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entity.Quiz;
import com.quiz.repository.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService{

	@Autowired
	private QuizRepository quizRepository;
	
	@Autowired
	private QuestionClient questionClient;
	
	
	public QuizServiceImpl(QuizRepository quizRepository) {
		super();
		this.quizRepository = quizRepository;
	}

	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		List<Quiz> quizez = quizRepository.findAll();
		List<Quiz> newQuizList = quizez.stream().map(quiz -> {
			quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
			return quiz;
			}).toList();
		return newQuizList;
	}

	@Override
	public Quiz get(Long id) {
		Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz Not Found"));
		quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
		return quiz;
	}

}
