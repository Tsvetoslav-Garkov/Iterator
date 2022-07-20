import java.util.List;

public class TopicIterator implements Iterator<Topic> {
    private List<Topic> topics;
    private int position;

    public TopicIterator(List<Topic> topics) {
        this.topics = topics;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if(position >= topics.size()){
            return false;
        }

        return true;
    }

    @Override
    public Topic getNext() {
        return topics.get(position++);
    }

    @Override
    public Topic currentItem() {
        return topics.get(position);
    }

    @Override
    public void reset() {
        position = 0;
    }
}
