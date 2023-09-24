package com.kshitizsaini113.Entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Question1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questionId;
    private String question;
    @OneToMany(mappedBy = "question")
    private List<Answer1> answers;

    public Question1() {
    }

    public Question1(int questionId, String question, List<Answer1> answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer1> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer1> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question1{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", answers=" + answers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question1 question1)) return false;
        return getQuestionId() == question1.getQuestionId() && Objects.equals(getQuestion(), question1.getQuestion()) && Objects.equals(getAnswers(), question1.getAnswers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestionId(), getQuestion(), getAnswers());
    }
}
