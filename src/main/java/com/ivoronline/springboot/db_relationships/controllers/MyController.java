package com.ivoronline.springboot.db_relationships.controllers;

import com.ivoronline.springboot.db_relationships.entities.AuthorEntity;
import com.ivoronline.springboot.db_relationships.entities.BookEntity;
import com.ivoronline.springboot.db_relationships.repositories.AuthorRepository;
import com.ivoronline.springboot.db_relationships.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  //======================================================================
  // ENTITIES
  //======================================================================
  @Autowired BookEntity   bookEntity;
  @Autowired AuthorEntity authorEntity;

  //======================================================================
  // REPOSITORIES
  //======================================================================
  @Autowired BookRepository   bookRepository;
  @Autowired AuthorRepository authorRepository;

  //======================================================================
  // METHOD: ADD BOOK
  //======================================================================
  @ResponseBody
  @RequestMapping("/addBook")
  public String addBook(@RequestParam Integer id, @RequestParam String title) {

    //CREATE PERSON
    bookEntity.setId(id);
    bookEntity.setTitle(title);

    System.out.println("id = " + id);

    //STORE PERSON
    bookRepository.save(bookEntity);

    //RETURN
    return "Book added to DB";

  }

  //======================================================================
  // METHOD: ADD AUTHOR
  //======================================================================
  @ResponseBody
  @RequestMapping("/addAuthor")
  public String addAuthor(@RequestParam Integer id, @RequestParam String name) {

    //CREATE PERSON
    authorEntity.setId(id);
    authorEntity.setName(name);

    //STORE PERSON
    authorRepository.save(authorEntity);

    //RETURN
    return "Author added to DB";

  }

}

