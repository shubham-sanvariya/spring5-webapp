package ronit.springframework.springSwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ronit.springframework.springSwebapp.repositories.BookRepository;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        // this model is going to get the list of books from the bookRepository and give a copy to view
        model.addAttribute("books",bookRepository.findAll());
        return "books";
    }
}
