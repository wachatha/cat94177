package com.cat.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

    @Component
    public class RestTesting implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            RestTemplate restTemplate  = new RestTemplate();

            ResponseEntity<List<Student>> response = restTemplate.exchange(
                    "http://10.51.10.111:1000/registrations",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<Student>>(){});
            List<Student> student = response.getBody();

            for(Student Student : student){
                System.out.println(student.toString());
            }

            System.err.println("Find One(GET)--------------------------------");

            Student Student = restTemplate.getForObject(
                    "http://10.51.10.111:1000/registrations/2",
                    Student.class);
            System.out.println(student.toString());

            System.err.println("Creating(POST)______________________________");
            Student newStudent = new Student("Wachatha Kabuthu","94177");

            Student createdStudent = restTemplate.postForObject(
                    "http://10.51.10.111:1000/registrations",
                    newStudent, Student.class);
            System.out.println(createdStudent.toString());

            System.err.println("____________________________________");
            String createUnitUrl = "http://10.51.10.111:1000/units/"
                    +createdStudent.getId()+"/units";

            Unit newUnit = new Unit("Object Oriented Programming");
            Unit createdCourse = restTemplate.postForObject(
                    createUnitUrl,
                    newUnit, Unit.class);
            System.out.println(createdCourse.toString());

        }
    }

