package com.karamanmert.mypage.blog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author karamanmert
 */
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final AppProperties properties;
    private final PostService postService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("page", getPageInfo());
        return "pages/home";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("page", getPageInfo());
        return "pages/contact";
    }

    @GetMapping("/posts")
    public String posts(Model model) {
        model.addAttribute("posts", getAllPosts());
        model.addAttribute("page", getPageInfo());
        return "pages/posts";
    }

    private Page getPageInfo() {
        return new Page(properties.getTitle(), properties.getDescription());
    }

    private List<Post> getAllPosts(){
        return postService.getAllPosts();
    }
}
