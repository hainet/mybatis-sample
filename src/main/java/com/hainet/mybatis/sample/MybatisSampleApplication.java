package com.hainet.mybatis.sample;

import com.hainet.mybatis.sample.domain.Person;
import com.hainet.mybatis.sample.mapper.PersonMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MybatisSampleApplication {

    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = SingletonSqlSessionFactory.create();

        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);

            Person person = new Person();
            person.setName("hainet");
            person.setAge(24);

            personMapper.insert(person);
            System.out.println(personMapper.findAll());
        }
    }
}
