package com.karamanmert.mypage.blog;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author karamanmert
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/posts/v1")
@Validated
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody CreatePostRequest request) {
        postService.savePost(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("all")
    // todo post dto.. + pageable
    public ResponseEntity<List<Post>> getAll() {
        return ResponseEntity.ok(postService.getAllPosts());
    }
}
