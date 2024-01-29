package mx.com.switz.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import mx.com.switz.dto.Book;

@Component
public class BookServiceClient {

    private final String apiUrl = "http://localhost:8082/api/books";

    public List<Book> getBooks() {
        RestTemplate restTemplate = new RestTemplate();
     
        Book[] empArray = restTemplate.getForObject(apiUrl, Book[].class);
        List<Book> books= Arrays.asList(empArray);
        return books;
    }
}
