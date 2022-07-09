package topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topicList = new ArrayList<Topic>(Arrays.asList(new Topic("Spring", "Spring Framework", "Let Spring manage your Project"),
            new Topic("Java", "Java 8", "Let Spring manage your Project")));

    public List<Topic> getAllTopics(){
        return topicList;
    }

    public Topic getTopic(String id){
        return topicList.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public Topic addTopic(Topic topic) {
        topicList.add(topic);
        return topic;
    }

    public Topic updateTopic(Topic topic, String id) {
        for(Topic sourceTopic : topicList){
            if(sourceTopic.getId().equals(id)){
                topicList.set(topicList.indexOf(sourceTopic), topic);
            }
        }
        return topic;
    }
}
