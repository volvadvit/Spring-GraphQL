package com.volvadvit.springgraphql.service.impl;

import com.volvadvit.springgraphql.model.Post;
import com.volvadvit.springgraphql.repository.PostRepository;
import com.volvadvit.springgraphql.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository repository;

    public List<Post> getAllPosts() {
        return repository.findAll();
    }

    public Post getPost(Long id) {
        if (id != null) {
            return repository.getById(id);
        } else {
            System.err.println("Post ID is null!");
            return null;
        }
    }

    public Post createPost(String title, String author, String type) {
        final Post post = new Post();
        post.setTitle(title.isEmpty() ? "title" : title);
        post.setAuthor(author.isEmpty() ? "author" : author);
        post.setType(type.isEmpty() ? "type" : type);
        post.setCreatedDate(LocalDate.now());
        return repository.save(post);
    }
}
