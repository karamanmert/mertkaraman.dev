package com.karamanmert.mypage.blog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author karamanmert
 */
@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository blogRepository;

    void savePost(CreatePostRequest request) {
        validateBlogCreation(request);
        Post blog = mapRequestToEntity(request);
        blogRepository.save(blog);
    }

    private Post mapRequestToEntity(CreatePostRequest request) {
        return Post.builder()
                .title(request.title())
                .content(request.content())
                .category(Category.valueOf(request.category().name()))
                .imageUrl(request.imageUrl())
                .build();
    }

    private void validateBlogCreation(CreatePostRequest request) {
        // todo
    }

    public List<Post> getAllPosts() {
        return blogRepository.findAll();
    }
}
