# swagger2demo
Integrating Swagger2 in Spring Boot


1. Go to https://strt.spring.io/ and generate your spring boot project. 
2. Add these dependencies to your pom file.

  <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
  <dependency>
		     <groupId>io.springfox</groupId>
		     <artifactId>springfox-boot-starter</artifactId>
		     <version>3.0.0</version>
	</dependency>
  
 3. Create a configuration class for Swagger with the ff. code:
    
    @Configuration
    @EnableSwagger2
    public class SwaggerConfig {

      @Bean
      public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
          .apiInfo(apiInfo())
          .select()
          .apis(RequestHandlerSelectors.any())
          .paths(PathSelectors.any())
          .build();
      }

      private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Spring boot with Swagger 2 Demo")
            .description("Sample Spring boot application using Swagger2 ")
            .version("1.0.0")
            .build();
      }
    }
  
  4. Here we have a sample RestController with a User model and a User Response class.
  
    @RestController
    public class UserController {


      @GetMapping(value="/users")
      public UserResponse getUsers(HttpServletRequest request ) {
        return new UserResponse(HttpStatus.OK,new User());
      }
    }
    
  5. run your application and go to http://localhost:8080/swagger-ui/index.html
  
