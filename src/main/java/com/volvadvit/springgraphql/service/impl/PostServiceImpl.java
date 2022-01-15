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
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Post createPost(String title, String author, String type) {
        return repository.save(new Post(title, author, type, LocalDate.now()));
    }
}
