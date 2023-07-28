package com.imroz.condinbotfun.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imroz.condinbotfun.lib.entity.MyBookList;


public interface MyBookRepository extends JpaRepository<MyBookList,Integer>{

}
