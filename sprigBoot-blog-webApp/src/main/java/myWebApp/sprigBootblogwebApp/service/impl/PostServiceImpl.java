package myWebApp.sprigBootblogwebApp.service.impl;

import myWebApp.sprigBootblogwebApp.dto.PostDto;
import myWebApp.sprigBootblogwebApp.entity.Post;
import myWebApp.sprigBootblogwebApp.mapper.PostMapper;
import myWebApp.sprigBootblogwebApp.repository.PostRepository;
import myWebApp.sprigBootblogwebApp.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;
//nenaudoju @Autowired naudoju constructor
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostDto> findAllPosts() {
        List<Post> posts=postRepository.findAll();
        return posts.stream().map( PostMapper::maToPostDto)
                .collect(Collectors.toList());
    }
}
