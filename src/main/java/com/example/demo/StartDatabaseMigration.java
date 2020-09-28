package com.example.demo;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartDatabaseMigration
{


    @Autowired
    private Flyway flyway;


    @GetMapping("/startmigration")
    public int startMigration()
    {

        return flyway.migrate();
    }
}
