package com.example.demo;

import com.example.demo.book.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Autowired
	private DataSource dataSource;



/* @Bean(initMethod = "migrate")
	public Flyway flyway() {
		Flyway flyway = Flyway
				.configure()
				.dataSource(dataSource)
				.locations("classpath:sql/migrations")
				.load();
		return flyway;

	}*/

	@Bean
	public CommandLineRunner runner(BookRepository repository)
	{
		return r -> System.out.println(repository.findAll().toString());
	}

}
