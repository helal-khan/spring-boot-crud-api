package com.crud;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.crud.repository.CategoryRepository;

class CategoryControllerTests {
	
	private CategoryRepository repository = Mockito.mock(CategoryRepository.class);
	

	@Test
    @DisplayName("Should Retrieve Post by Id")
    public void shouldFindPostById() {
 
//        PostService postService = new PostService(postRepository, subredditRepository, userRepository, authService, postMapper);
// 
//        Post post = new Post(123L, "First Post", "http://url.site", "Test",
//                0, null, Instant.now(), null);
//        PostResponse expectedPostResponse = new PostResponse(123L, "First Post", "http://url.site", "Test",
//                "Test User", "Test Subredit", 0, 0, "1 Hour Ago", false, false);
// 
//        Mockito.when(postRepository.findById(123L)).thenReturn(Optional.of(post));
//        Mockito.when(postMapper.mapToDto(Mockito.any(Post.class))).thenReturn(expectedPostResponse);
// 
//        PostResponse actualPostResponse = postService.getPost(123L);
// 
//        Assertions.assertThat(actualPostResponse.getId()).isEqualTo(expectedPostResponse.getId());
//        Assertions.assertThat(actualPostResponse.getPostName()).isEqualTo(expectedPostResponse.getPostName());
    }
	
	
//    @Test
//    @DisplayName("Should Retrieve Post by Id")
//    public void shouldFindPostById() {
// 
//        PostService postService = new PostService(postRepository, subredditRepository, userRepository, authService, postMapper);
// 
//        Post post = new Post(123L, "First Post", "http://url.site", "Test",
//                0, null, Instant.now(), null);
//        PostResponse expectedPostResponse = new PostResponse(123L, "First Post", "http://url.site", "Test",
//                "Test User", "Test Subredit", 0, 0, "1 Hour Ago", false, false);
// 
//        Mockito.when(postRepository.findById(123L)).thenReturn(Optional.of(post));
//        Mockito.when(postMapper.mapToDto(Mockito.any(Post.class))).thenReturn(expectedPostResponse);
// 
//        PostResponse actualPostResponse = postService.getPost(123L);
// 
//        Assertions.assertThat(actualPostResponse.getId()).isEqualTo(expectedPostResponse.getId());
//        Assertions.assertThat(actualPostResponse.getPostName()).isEqualTo(expectedPostResponse.getPostName());
//    }

}
