package org.react.reddit.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class RedditController {

    @GetMapping("/reddit")
    public String showForm() {
        return "reddit";
    }
}
