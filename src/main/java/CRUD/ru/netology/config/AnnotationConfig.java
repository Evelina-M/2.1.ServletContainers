package CRUD.ru.netology.config;

import CRUD.ru.netology.controller.PostController;
import CRUD.ru.netology.repository.PostRepository;
import CRUD.ru.netology.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
    @Bean
    public PostRepository postRepository() {
        return new PostRepository();
    }

    @Bean
    public PostService postService() {
        return new PostService(postRepository());
    }

    @Bean
    public PostController postController() {
        return new PostController(postService());
    }
}
