package com.karamanmert.mypage.blog;

/**
 * @author karamanmert
 */
public record CreatePostRequest(
        Category category,
        String title,
        String content,
        String imageUrl
) {
}
