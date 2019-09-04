package edu.ap.eightball.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import antlr.collections.List;

@Entity
public class Question {

    @Column
    private String[] answer = { "It is certain", "It is decidedly so.", "Without a doubt.", "Yes - definitely.",
            "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.",
            "Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.",
            "Concentrate and ask again.", "Don't count on it.", "My reply is no.", "My sources say no.",
            "Outlook not so good.", "Very doubtful" };

    public Question() {
    }

    public Question(String question) {sdsad
        this.answer = answer;

    }

    public String[] getAnswer() {
        return answer;
    }
}
