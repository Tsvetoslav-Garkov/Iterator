public class Main {
    public static void main(String[] args) {
        CustomList<Topic> topics = new TopicList();

        topics.add(new Topic("Java", "Java related posts are here."));
        topics.add(new Topic("C#", "C# related posts are here."));
        topics.add(new Topic("PHP", "PHP related posts are here."));
        topics.add(new Topic("Python", "Python related posts are here."));
        topics.add(new Topic("Go", "Go related posts are here."));

        Iterator<Topic> iterator = topics.iterator();

        while (iterator.hasNext()) {
            Topic topic = iterator.getNext();
            System.out.printf("%s -> %s%n", topic.getName(), topic.getDescription());
        }
    }
}
