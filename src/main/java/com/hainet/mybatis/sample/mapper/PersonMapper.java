package com.hainet.mybatis.sample.mapper;

import com.hainet.mybatis.sample.domain.Person;

import java.util.List;

public interface PersonMapper {

    List<Person> findAll();

    int insert(Person person);
}
