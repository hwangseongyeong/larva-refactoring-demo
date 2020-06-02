package com.larva.refactoring.demo.extractClass.after;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String title;
    private String isbn;
    private String price;
    private Author author;

    @Builder
    public Book(String title, String isbn, String price, String authorName, String authorMail){
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.author = Author.builder()
                .authorName(authorName)
                .authorMail(authorMail)
                .build();
    }

    public String toXml() {
        String author = tag("author", tag("name", this.author.getAuthorName()) + tag("mail", this.author.getAuthorMail()));
        String book = tag("book", tag("title", title) + tag("isbn", isbn) + tag("price", price) + author);
        return book;
    }

    private String tag(String element, String content) {
        return "<" + element + ">" + content + "</" + element + ">";
    }
}
