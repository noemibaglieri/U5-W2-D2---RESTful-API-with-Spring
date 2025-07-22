package noemibaglieri.entities;

import jakarta.persistence.*;
import lombok.*;
import noemibaglieri.enums.CategoryType;

@Entity
@Table(name = "posts")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @Enumerated
    private CategoryType categoryType;

    private String title;

    private String cover;

    private String content;

    @Column(name = "reading_time")
    private int readingTime;

    public BlogPost(CategoryType categoryType, String title, String content, int readingTime, String cover) {
        this.categoryType = categoryType;
        this.title = title;
        this.content = content;
        this.readingTime = readingTime;
        this.cover = cover;
    }
}
