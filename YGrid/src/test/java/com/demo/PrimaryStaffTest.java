package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.model.PrimaryStaff;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PrimaryStaffTest {

    @Test
    public void testPrimaryStaff(){

        PrimaryStaff primaryStaff = new PrimaryStaff();

        int primaryId =1;
        String producers = "Steve Spilberg";
        String cinematogs = "Disney";
        String directors  = "Clint";
        String actors = "Denzel";

        primaryStaff.setPrimaryId(primaryId);
        primaryStaff.setProducers(producers);
        primaryStaff.setCinematogs(cinematogs);
        primaryStaff.setDirectors(directors);
        primaryStaff.setActors(actors);

        assertEquals(
            "PrimaryStaff [primaryId=" + primaryId + ", producers=" + producers + ", cinematogs="+cinematogs +", directors=" +directors+ ", actors="+actors +"]", 
            primaryStaff.toString()
            );
    }


}
