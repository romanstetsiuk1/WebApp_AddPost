package com.romanstetsiuk.dao;

import com.romanstetsiuk.model.Post;

import java.util.List;

public interface PostDao {

    List<Post> findAll();

    boolean create(Post post);
}
