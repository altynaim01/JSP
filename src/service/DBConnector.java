package service;

import models.Item;
import models.News;
import models.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DBConnector {
    private static ArrayList<Item> items = new ArrayList<>();

    private static ArrayList<News> news = new ArrayList<>();

    private static ArrayList<Task> tasks = new ArrayList<>();

    private static int id = 6;

    private static int taskId = 11;
    
    static {
        items.add(new Item(1, "Smartphone", 699.99, 10));
        items.add(new Item(2, "Laptop", 1299.99, 5));
        items.add(new Item(3, "Smartwatch", 199.99, 20));
        items.add(new Item(4, "Tablet", 499.99, 15));
        items.add(new Item(5, "Wireless Earbuds", 149.99, 30));
    }


    static {
        news.add(new News(1L, "Championship Match Highlights",
                "The championship match ended in a thrilling draw, with both teams showcasing excellent skills.",
                "John Doe", "sport"));
        news.add(new News(2L, "Art Exhibition Opening",
                "The new art exhibition features works from local artists, highlighting the beauty of our culture.",
                "Jane Smith", "culture"));
        news.add(new News(3L, "Film Festival Success",
                "This year's film festival attracted record crowds, celebrating cinema from around the world.",
                "Mark Johnson", "cinema"));
        news.add(new News(4L, "Soccer Team Wins Championship",
                "The local soccer team won the championship, bringing home the trophy after a fantastic season.",
                "Emily Davis", "sport"));
        news.add(new News(5L, "Theater Performance Review",
                "The recent theater performance captivated the audience with its emotional depth and creativity.",
                "Chris Wilson", "culture"));
        news.add(new News(6L, "New Blockbuster Hits Theaters",
                "A highly anticipated blockbuster has hit theaters, drawing fans from all over.",
                "Sarah Brown", "cinema"));
        news.add(new News(7L, "Olympics Update",
                "The Olympics are approaching, and athletes from around the world are preparing to compete.",
                "David Lee", "sport"));
        news.add(new News(8L, "Cultural Festival Announced",
                "A cultural festival is set to take place next month, celebrating our diverse heritage.",
                "Laura Miller", "culture"));
        news.add(new News(9L, "Documentary Wins Award",
                "A powerful documentary about climate change won several awards at the recent film gala.",
                "Mike Taylor", "cinema"));
        news.add(new News(10L, "Football Season Preview",
                "The football season is just around the corner, and fans are excited for what’s to come.",
                "Sophia Martinez", "sport"));
        news.add(new News(11L, "Art Class Enrollment Open",
                "Enrollment for art classes is now open, providing opportunities for all ages to explore their creativity.",
                "James Anderson", "culture"));
        news.add(new News(12L, "Film Industry Changes",
                "The film industry is undergoing significant changes as streaming services gain popularity.",
                "Emily Johnson", "cinema"));
        news.add(new News(13L, "Basketball League Finals",
                "The finals of the basketball league promise to be an exciting showdown between the top teams.",
                "Liam White", "sport"));
        news.add(new News(14L, "Local Museum Renovation",
                "The local museum is set to undergo renovations to better showcase cultural artifacts.",
                "Olivia Harris", "culture"));
        news.add(new News(15L, "New Movie Releases This Month",
                "A variety of new movies are set to release this month, catering to all tastes.",
                "Daniel Lewis", "cinema"));
    }

    static {
       tasks.add(new Task(1, "Grocery Shopping", "Buy fruits and vegetables.", "2024-10-30"));
       tasks.add(new Task(2, "Project Meeting", "Discuss project updates with the team.", "2024-10-31"));
       tasks.add(new Task(3, "Gym Workout", "Attend yoga class.", "2024-10-29"));
       tasks.add(new Task(4, "Finish Assignment", "Complete the programming assignment for class.", "2024-11-05"));
       tasks.add(new Task(5, "Doctor Appointment", "Visit the dentist for a check-up.", "2024-11-02"));
       tasks.add(new Task(6, "Read a Book", "Finish reading 'The Great Gatsby'.", "2024-11-15"));
       tasks.add(new Task(7, "Clean the House", "Deep clean the living room and kitchen.", "2024-11-01"));
       tasks.add(new Task(8, "Car Maintenance", "Get the oil changed and tires checked.", "2024-11-03"));
       tasks.add(new Task(9, "Family Dinner", "Have dinner with family at 7 PM.", "2024-11-04"));
       tasks.add(new Task(10, "Plan Vacation", "Start planning the trip for the summer.", "2024-11-10"));


    }

    public static void addTask(Task task){
        task.setId(taskId);
        taskId++;
        tasks.add(task);
    }

    public static Task getTask(int id){
        return tasks.get(id);
    }

    public static ArrayList<Task> getAllTasks(){
        return tasks;
    }

    public static void deleteTask(int id){
        tasks.removeIf(a -> a.getId() == id);
    }

    public static ArrayList<Item> getItems() {
        return items;
    }

    public static void addItem(Item item){
        item.setId(id);
        id++;
        items.add(item);
    }

    public static Item getItemById(int id){
        return items.stream().filter(a -> a.getId() == id).findFirst().get();
    }

    public static ArrayList<News> getAllNews() {
        return news;
    }

    public static List<News> getNewsByCategory(String category) {
        if(category == null){ return news;}
        return news.stream().filter(a -> a.getCategory().equalsIgnoreCase(category)).collect(Collectors.toList());
    }
}
