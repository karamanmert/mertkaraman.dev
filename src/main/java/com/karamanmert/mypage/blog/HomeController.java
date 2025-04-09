package com.karamanmert.mypage.blog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author karamanmert
 */
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final AppProperties properties;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("page", new Page(properties.getTitle(), properties.getDescription()));
        return "index";
    }
}
