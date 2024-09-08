package CRUD.ru.netology.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import CRUD.ru.netology.controller.PostController;
import CRUD.ru.netology.repository.PostRepository;
import CRUD.ru.netology.service.PostService;

@Configuration
public class JavaConfig {
    @Bean
    public PostController controller(PostService service) {
        return new PostController(service);
    }

    @Bean
    public PostService service(PostRepository repository) {
        return new PostService(repository);
    }

    @Bean
    public PostRepository repository() {
        return new PostRepository();
    }
}
