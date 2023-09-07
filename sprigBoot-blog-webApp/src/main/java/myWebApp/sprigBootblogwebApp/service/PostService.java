package myWebApp.sprigBootblogwebApp.service;

import myWebApp.sprigBootblogwebApp.dto.PostDto;

import java.util.List;

public interface PostService {
    List<PostDto> findAllPosts();

}
