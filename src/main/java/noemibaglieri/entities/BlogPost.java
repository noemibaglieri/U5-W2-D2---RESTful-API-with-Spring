package noemibaglieri.entities;


import lombok.*;
import noemibaglieri.enums.CategoryType;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BlogPost {

    @Setter(AccessLevel.NONE)
    private long id;

    private CategoryType categoryType;

    private String title;

    private String cover;

    private String content;

    private int readingTime;

    public BlogPost(CategoryType categoryType, String title, String content, int readingTime, String cover) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 10000);
        this.categoryType = categoryType;
        this.title = title;
        this.content = content;
        this.readingTime = readingTime;
        this.cover = cover;
    }
}
