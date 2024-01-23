package com.example.B2B.Entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MailStructure {
    private String subject;
    private String message;

    public MailStructure(String subject, String message) {
        this.subject = subject;
        this.message = message;
    }
}