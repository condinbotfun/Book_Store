package com.imroz.condinbotfun.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.imroz.condinbotfun.lib.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>  {

}
