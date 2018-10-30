package com.practise.spirngPractise.repository;

import com.practise.spirngPractise.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {
}
