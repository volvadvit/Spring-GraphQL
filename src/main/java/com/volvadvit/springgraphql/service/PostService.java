package com.volvadvit.springgraphql.service;

import com.volvadvit.springgraphql.model.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getPost(Long id);
    Post createPost(String title, String author, String type);
}
