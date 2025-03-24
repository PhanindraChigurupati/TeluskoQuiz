package com.example.telusko_quizz.service;

import com.example.telusko_quizz.dao.QuestionDAO;

import com.example.telusko_quizz.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {


    QuestionDAO questionDAO;

    @Autowired
    QuestionService(QuestionDAO questionDAO){
        this.questionDAO=questionDAO;
    }

    public List<Question> getAllQuestions(){
        return questionDAO.findAll();
    }

    public List<Question> getByCategory(String categories) {
        return questionDAO.getByCategory(categories);
    }
}
