package com.practise.spirngPractise.repository;

import com.practise.spirngPractise.model.Course;
import com.practise.spirngPractise.model.Topic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {

    public List<Course> findByTopicId(String topicId);
}
