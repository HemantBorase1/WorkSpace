package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class Studentdao {

    private final JdbcTemplate j;

    public Studentdao(JdbcTemplate j) {
        this.j = j;
    }

    public int insertStudent(Student s) {
        String sql = "insert into Student(name,city,percentage) values(?,?,?)";

        return j.update(sql,
                s.getName(),
                s.getCity(),
                s.getPercentage());
    }
}
