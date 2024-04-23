
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joshu
 */
public class GymHall {
    private String name;
    private int capacity;
    private String location;
    private ArrayList<GymClass> classesOffered; //List to store classesOffered
    private ArrayList<Trainer> trainers; //List to store trainers
    private ArrayList<GymMembers> members;  // List to store members

    /**
     * Constructs a new Gym Hall with specified name, capacity, and location.
     * Initializes lists to manage classes, trainers, and members within the hall.
     *
     * @param name Name of the hall.
     * @param capacity Maximum number of people the hall can accommodate.
     * @param location Physical location of the hall.
     */
    public GymHall(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;
        this.classesOffered = new ArrayList<>();
        this.trainers = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    /**
     * Adds a class to the hall's schedule.
     *
     * @param className Name of the class to be added.
     */
    /**
     * public void addClass(String className) {
        classesOffered.add(className);
    } */

    /**
     * Removes a class from the hall's schedule.
     *
     * @param className Name of the class to be removed.
     */
    /**public void removeClass(String className) {
        classesOffered.remove(className);
    } */

    /**
     * Adds a member to the hall.
     *
     * @param member A GymMembers object representing the member to be added.
     */
    public void addMember(GymMembers member) {
        members.add(member);
    }

    /**
     * Removes a member from the hall.
     *
     * @param member A GymMembers object representing the member to be removed.
     */
    public void removeMember(GymMembers member) {
        members.remove(member);
    }

    /**
     * Retrieves the name of the gym hall.
     *
     * @return A string representing the name of the gym hall.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the gym hall.
     *
     * @param name New name for the gym hall.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the capacity of the gym hall.
     *
     * @return The maximum number of people that the hall can accommodate.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the capacity of the gym hall.
     *
     * @param capacity New capacity for the gym hall.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Retrieves the location of the gym hall.
     *
     * @return A string representing the physical location of the gym hall.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location of the gym hall.
     *
     * @param location New physical location for the gym hall.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Retrieves the list of classes offered at the gym hall.
     *
     * @return An ArrayList of strings, each representing a class offered at the hall.
     */
    /** public ArrayList<String> getClassesOffered() {
        return new ArrayList<>(classesOffered);
    } */

    /**
     * Retrieves the list of trainers available at the gym hall.
     *
     * @return An ArrayList of strings, each representing a trainer at the hall.
     */
    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    /**
     * Retrieves the list of members subscribed to the gym hall.
     *
     * @return An ArrayList of GymMembers, each representing a member of the hall.
     */
    public ArrayList<GymMembers> getMembers() {
        return members;
    }
    
    public ArrayList<GymClass> getClassOffered() {
        return classesOffered;
    }
}
