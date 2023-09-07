package myWebApp.sprigBootblogwebApp.controller;

import myWebApp.sprigBootblogwebApp.dto.PostDto;
import myWebApp.sprigBootblogwebApp.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    // GET request  grazins model and view
    @GetMapping("/admin/posts")
    public String posts(Model model){
        List<PostDto>posts=postService.findAllPosts();
        model.addAttribute("posts", posts);
        return "/admin/posts";
    }
}
