package com.mysql.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {
	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(MysqlApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(dataSource.getConnection().toString());
		System.out.println(dataSource.toString());
		jdbcTemplate.execute("create table test(a varchar(20) primary key )");
	}
}
