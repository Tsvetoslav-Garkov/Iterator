import java.util.ArrayList;
import java.util.List;

public class TopicList implements CustomList<Topic> {
    private List<Topic> topics;

    public TopicList(Topic... topics) {
        this.topics = new ArrayList<>();

        //Add all topics to the collection
        for(Topic topic : topics){
            this.topics.add(topic);
        }
    }

    @Override
    public Iterator<Topic> iterator() {
        return new TopicIterator(topics);
    }

    @Override
    public Boolean add(Topic element) {
        return topics.add(element);
    }

    @Override
    public Topic remove(int index) {
        return topics.remove(index);
    }
}