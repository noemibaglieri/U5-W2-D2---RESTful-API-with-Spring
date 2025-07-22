package noemibaglieri.services;

import noemibaglieri.entities.BlogPost;
import noemibaglieri.payloads.NewBlogPostPayload;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogPostsService {
    private List<BlogPost> postsDB = new ArrayList<>();

    public List<BlogPost> findAll() {
        return this.postsDB;
    }

    public BlogPost save(NewBlogPostPayload payload) {

    }
}
