package topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public Topic addTopic(@RequestBody Topic topic) {
       return topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics")
    public Topic updateTopic(@RequestBody Topic topic) {
        return topicService.updateTopic(topic, topic.getId());
    }

}
