package com.carlosoliveira.jpasecurity.repositories;

import com.carlosoliveira.jpasecurity.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
