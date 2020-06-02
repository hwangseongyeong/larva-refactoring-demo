package com.larva.refactoring.demo.extractClass.before;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String title;
    private String isbn;
    private String price;
    private String authorName;
    private String authorMail;

    @Builder
    public Book(String title, String isbn, String price, String authorName, String authorMail){
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.authorName = authorName;
        this.authorMail = authorMail;
    }

    public String toXml() {
        String author = tag("author", tag("name", authorName) + tag("mail", authorMail));
        String book = tag("book", tag("title", title) + tag("isbn", isbn) + tag("price", price) + author);
        return book;
    }

    private String tag(String element, String content) {
        return "<" + element + ">" + content + "</" + element + ">";
    }

}
