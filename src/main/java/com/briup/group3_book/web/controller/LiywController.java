package com.briup.group3_book.web.controller;

import com.briup.group3_book.bean.book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiywController {

    @GetMapping("/add")
    public book add(){
        book Book = new book();
        Book.setAutor("李曜维");
        Book.setAddress("兰理工");
        Book.setBook_id(2333);
        Book.setDesp("作业");
        return Book;
    }
}
