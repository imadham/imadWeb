package imad.imad.imadWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import imad.imad.imadWeb.repositories.AuthorRepository;

@Controller

public class AutherController {
    private AuthorRepository authorRepository;

    public AutherController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors", authorRepository.findAll());
        return "authors";

    }
}
