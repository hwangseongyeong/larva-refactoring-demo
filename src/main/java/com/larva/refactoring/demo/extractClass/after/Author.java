package com.larva.refactoring.demo.extractClass.after;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author {
    private String authorName;
    private String authorMail;

    @Builder
    public Author(String authorName, String authorMail){
        this.authorName = authorName;
        this.authorMail = authorMail;
    }
}
