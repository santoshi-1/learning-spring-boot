package com.santoshi.springboot.learningspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(new Course(1, "Learn AWA", "in28Minutes"),
                new Course(1, "Learn AWA", "in28Minutes"),
                new Course(2, "Azure", "in28Minutes"),
                new Course(3, "GCP", "in28Minutes"),
                new Course(4, "Learn Spring", "in28Minutes"));
    }

}
