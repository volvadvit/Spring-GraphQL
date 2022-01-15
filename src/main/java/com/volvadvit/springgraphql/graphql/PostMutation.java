package com.volvadvit.springgraphql.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.volvadvit.springgraphql.model.Post;
import com.volvadvit.springgraphql.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PostMutation implements GraphQLMutationResolver {

    private final PostService service;

    public Post createPost(String title, String author, String type) {
        return service.createPost(title, author, type);
    }
}
