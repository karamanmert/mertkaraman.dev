package com.karamanmert.mypage.blog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author karamanmert
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
