package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "books")
public class Book {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )

    private Long id;
    private String name;
    private int yearPublished;

    public Book() {
    }

    public Book(Long id, String name, int yearPublished) {
        this.id = id;
        this.name = name;
        this.yearPublished = yearPublished;
    }

    public Book(String name, int yearPublished) {
        this.name = name;
        this.yearPublished = yearPublished;
    }
}
