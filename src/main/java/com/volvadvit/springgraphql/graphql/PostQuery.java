package com.volvadvit.springgraphql.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.volvadvit.springgraphql.model.Post;
import com.volvadvit.springgraphql.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PostQuery implements GraphQLQueryResolver {

    private final PostService service;

    public List<Post> getPosts() {
        return service.getAllPosts();
    }

    public Post getPost(Long id) {
        return service.getPost(id);
    }
}
