package noemibaglieri.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import noemibaglieri.enums.CategoryType;

@Getter
@Setter
@AllArgsConstructor
public class NewBlogPostPayload {

    private CategoryType categoryType;
    private String title;
    private String content;
    private int readingTime;

    @Override
    public String toString() {
        return "categoryType='" + categoryType + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", readingTime=" + readingTime + " min";
    }

}
