package com.practise.spirngPractise.service;

import com.practise.spirngPractise.model.Topic;
import com.practise.spirngPractise.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;


    /*public List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "mvn"),
            new Topic("spring1", "mvn1"),
            new Topic("spring2", "mvn2"))
    );*/

    public List<Topic> getAllTopics() {

//        return (List<Topic>) topicRepository.findAll();
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id) {
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id);
    }


    public void addTopic(Topic topic) {
//        topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {

//        System.out.println(topics.stream().filter(topic1 -> topic1.getId().equals(id)));

/*
        for (Topic t : topics) {
            if (t.getId().equals(id)) {
                t.setId(topic.getId());
                t.setName(topic.getName());
            }

        }
*/
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
//        topics.removeIf(topic -> topic.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
