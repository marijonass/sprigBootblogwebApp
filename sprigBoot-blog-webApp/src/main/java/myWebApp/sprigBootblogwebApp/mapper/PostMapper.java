package myWebApp.sprigBootblogwebApp.mapper;

import myWebApp.sprigBootblogwebApp.dto.PostDto;
import myWebApp.sprigBootblogwebApp.entity.Post;

public class PostMapper {
    //map Post entity to PostDto
    public static PostDto maToPostDto(Post post){
        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .shortDescription(post.getShortDescription())
                .createdOn(post.getCreatedOn())
                .updatedOn(post.getUpdatedOn())
                .build();
    }
    //map  PostDto to Post entity
    public static Post mapToPost(PostDto postDto){
        return Post.builder()
                .id(postDto.getId())
                .title(postDto.getTitle())
                .content(postDto.getContent())
                .shortDescription(postDto.getShortDescription())
                .createdOn(postDto.getCreatedOn())
                .updatedOn(postDto.getUpdatedOn())
                .build();
    }



}
