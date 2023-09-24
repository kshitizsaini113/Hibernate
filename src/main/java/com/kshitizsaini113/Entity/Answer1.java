package com.kshitizsaini113.Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Answer1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int answerId;
    private String answer;
    @ManyToOne
    @JoinColumn(name = "question")
    private Question1 question;

    public Answer1() {
    }

    public Answer1(int answerId, String answer, Question1 question) {
        this.answerId = answerId;
        this.answer = answer;
        this.question = question;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question1 getQuestion() {
        return question;
    }

    public void setQuestion(Question1 question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", answer='" + answer + '\'' +
                ", question=" + question +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answer answer1)) return false;
        return getAnswerId() == answer1.getAnswerId() && Objects.equals(getAnswer(), answer1.getAnswer()) && Objects.equals(getQuestion(), answer1.getQuestion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAnswerId(), getAnswer(), getQuestion());
    }
}
