package com.example.task;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@EnableTask
@EnableBatchProcessing
@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		for (String s : args)
        {
			System.out.println("args  ............."+s);
        }
		SpringApplication.run(TaskApplication.class, args);
	}

}
