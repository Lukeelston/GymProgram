
import java.util.Scanner;

public class GymTester1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // setting up an array and setting up the default values
        GymHall halls[] = new GymHall[10];
        halls[0] = new GymHall("Fitness Tennessee", 100, "Chattanooga");
        halls[1] = new GymHall("Cleveland iron", 100, "Cleveland");
        halls[2] = new GymHall("Memphis Muscle", 100, "Memphis");
        halls[3] = new GymHall("Collegedale Hustle", 100, "Collegedale");
        halls[4] = new GymHall("Red Bank Tank", 100, "Red Bank");
        halls[5] = new GymHall("Chattanooga Conditioning", 100, "Chattanooga");
        halls[6] = new GymHall("Gatlinburg Gains", 100, "Gatlinburg");
        halls[7] = new GymHall("Franklin Fitness", 100, "Franklin");
        halls[8] = new GymHall("Bristol Burn", 100, "Bristol");
        halls[9] = new GymHall("Knoxville Kinetics", 100, "Knoxville");

        // Setting some default trainers
        halls[0].getTrainers().add(new Trainer("John", "Group", halls[0].getLocation()));
        halls[0].getTrainers().add(new Trainer("Ross", "Personal", halls[0].getLocation()));
        halls[0].getTrainers().add(new Trainer("Ron", "kids", halls[0].getLocation()));
        halls[0].getTrainers().add(new Trainer("Gilbert Rodrigez", "group", halls[0].getLocation()));

        halls[1].getTrainers().add(new Trainer("Tom", "personal", halls[1].getLocation()));
        halls[1].getTrainers().add(new Trainer("Bomb", "kids", halls[1].getLocation()));
        halls[1].getTrainers().add(new Trainer("Skipper", "group", halls[1].getLocation()));
        halls[1].getTrainers().add(new Trainer("Richard", "group", halls[1].getLocation()));

        halls[2].getTrainers().add(new Trainer("Tom", "kids", halls[2].getLocation()));
        halls[2].getTrainers().add(new Trainer("Bomb", "personal", halls[2].getLocation()));
        halls[2].getTrainers().add(new Trainer("Skipper", "group", halls[2].getLocation()));
        halls[2].getTrainers().add(new Trainer("Richard", "Zumba", halls[2].getLocation()));

        // Setting up default classes
        halls[0].getClassOffered().add(new GymClass("Yoga", 1, halls[0].getTrainers().get(0), "Monday 9 AM"));
        halls[0].getClassOffered().add(new GymClass("Aerobics", 1, halls[0].getTrainers().get(1), "Wednesday 7 AM"));

        halls[1].getClassOffered().add(new GymClass("Pilates", 1, halls[1].getTrainers().get(0), "Tuesday 10 AM"));
        halls[1].getClassOffered().add(new GymClass("Kickboxing", 1, halls[1].getTrainers().get(1), "Friday 6 PM"));

        halls[2].getClassOffered().add(new GymClass("Spin Class", 1, halls[2].getTrainers().get(0), "Thursday 5 PM"));
        halls[2].getClassOffered().add(new GymClass("Crossfit", 1, halls[2].getTrainers().get(0), "Saturday 10 AM"));

        // setting up default members
        halls[0].getMembers().add(new GymMembers("Jim-Bob", 3, 1, 25));
        halls[0].getMembers().add(new GymMembers("Donny", 4, 10, 13));
        halls[0].getMembers().add(new GymMembers("Tilly", 1, 12, 30));
        halls[0].getMembers().add(new GymMembers("Jack", 17, 4, 17));

        halls[1].getMembers().add(new GymMembers("Robert", 3, 1, 25));
        halls[1].getMembers().add(new GymMembers("Dolly", 4, 10, 13));
        halls[1].getMembers().add(new GymMembers("Felicia", 1, 12, 30));
        halls[1].getMembers().add(new GymMembers("Carmen", 17, 4, 17));
        
        halls[2].getMembers().add(new GymMembers("Robert", 3, 1, 25));
        halls[2].getMembers().add(new GymMembers("Dolly", 4, 10, 13));
        halls[2].getMembers().add(new GymMembers("Felicia", 1, 12, 30));
        halls[2].getMembers().add(new GymMembers("Carmen", 17, 4, 17));
        
        halls[3].getMembers().add(new GymMembers("Robert", 3, 1, 25));
        halls[2].getMembers().add(new GymMembers("Dolly", 4, 10, 13));
        halls[2].getMembers().add(new GymMembers("Felicia", 1, 12, 30));
        halls[2].getMembers().add(new GymMembers("Carmen", 17, 4, 17));

        int num = 0;
        System.out.println("Welcome to the Gym Management System");
        System.out.println("---------------");

        do {
            System.out.println("1. view halls");
            System.out.println("2. Replace");
            System.out.println("3. Exit");
            System.out.print("Your Input: ");
            num = in.nextInt();
            switch (num) {
                case 1:
                    int num2;
                    for (int i = 0; i < halls.length; i++) {
                        System.out.println((i + 1) + " " + halls[i].getName() + ":" + " Capacity: " + halls[i].getCapacity() + "| Location: " + halls[i].getLocation());
                        System.out.println("------------------------------------------------------------------");
                        if (i == halls.length - 1) {
                            System.out.println("11. Exit");
                            System.out.println("------------------------------------------------------------------");
                        }
                    }
                    // Second do loop, controls hall inspection
                    do {
                        System.out.println("Which Hall do you want to inspect?");
                        System.out.print("Your Input ");
                        num2 = in.nextInt();
                        int num3;
                        System.out.println("Viewing hall " + num2);
                        System.out.println("------------------------------------------------------------------");
                        // Third do loop
                        do {
                            System.out.println("What information do you want to view?");
                            System.out.println("1. view Trainers");
                            System.out.println("2. view classes");
                            System.out.println("3. view members");
                            System.out.println("4. Exit");
                            System.out.print("Your Input; ");
                            num3 = in.nextInt();
                            switch (num3) {
                                case 1:
                                    int num4;
                                    System.out.println("Viewing Trainers");
                                    for (int i = 0; i < halls[num2 - 1].getTrainers().size(); i++) {
                                        System.out.println((i + 1) + "|" + halls[num2 - 1].getTrainers().get(i));
                                    }
                                    do {
                                        System.out.println("What action do you want to do?");
                                        System.out.println("1. add trainers");
                                        System.out.println("2. Delete trainers");
                                        System.out.println("3. Exit");
                                        num4 = in.nextInt();
                                        switch (num4) {
                                            case 1:
                                                System.out.println("Adding Trainers");
                                                System.out.println(num4);
                                                System.out.print("Enter a new Trainer name: ");
                                                String name = in.next();
                                                
                                                System.out.print("Enter " + name + " train type: ");
                                                String trainType = in.next();

                                                String hallName = halls[num2 - 1].getName();
                                                
                                                halls[num2 - 1].getTrainers().add(new Trainer(name, trainType, hallName));
                                                break;
                                            case 2:
                                                System.out.println("Deleting Trainer");
                                                System.out.println("Which trainer do you want to delete?");
                                                System.out.print("Your Input:");
                                                halls[num2 - 1].getTrainers().remove(in.nextInt() - 1);
                                                break;
                                            case 3:
                                                System.out.println("Goodbye");
                                        }
                                    } while (num4 != 3);

                                    break;
                                case 2:
                                    System.out.println("Viewing classes");
                                    for (int i = 0; i < halls[num2 - 1].getClassOffered().size(); i++) {
                                        System.out.println((i + 1) + "|" + "Name:" + halls[num2 - 1].getClassOffered().get(i).getClassName() + "| Trainer:" + halls[num2 -1].getClassOffered().get(i).trainer.getName());
                                    }
                                    do {
                                        System.out.println("What action do you want to do?");
                                        System.out.println("1. add classes");
                                        System.out.println("2. Delete classes");
                                        System.out.println("3. Exit");
                                        num4 = in.nextInt();
                                        switch (num4) {
                                            case 1:
                                                System.out.println("Adding Classes");
                                                System.out.println(num4);
                                                System.out.print("Enter a new Class name: ");
                                                String name = in.next();
                                                System.out.print("Enter " + name + " duration: ");
                                                int duration = in.nextInt();

                                                System.out.println("What Trainer will be leading this class?");
                                                for (int i = 0; i < halls[num2 - 1].getTrainers().size(); i++) {
                                                    System.out.println((i + 1) + "|" + halls[num2 - 1].getTrainers().get(i));
                                                }
                                                int trainer = in.nextInt();
                                                
                                                System.out.println("When will this class start?");
                                                String schedule = in.next();
                                                halls[num2 - 1].getClassOffered().add(new GymClass(name, duration, halls[num2 -1].getTrainers().get(trainer), schedule));
                                                break;
                                            case 2:
                                                System.out.println("Deleting Class");
                                                System.out.println("Which Class do you want to delete?");
                                                System.out.print("Your Input:");
                                                halls[num2 - 1].getClassOffered().remove(in.nextInt() - 1);
                                                break;
                                            case 3:
                                                System.out.println("Goodbye");
                                        }
                                    } while (num4 != 3);
                                    break;
                                case 3:
                                    System.out.println("Viewing members");
                                    for (int i = 0; i < halls[num2 - 1].getMembers().size(); i++) {
                                        System.out.println((i + 1) + "| " + halls[num2 - 1].getMembers().get(i));
                                    }
                                    do {
                                        System.out.println("What action do you want to do?");
                                        System.out.println("1. add members");
                                        System.out.println("2. Delete members");
                                        System.out.println("3. Exit");
                                        num4 = in.nextInt();
                                        switch (num4) {
                                            case 1:
                                                System.out.println("Adding member");
                                                System.out.println(num4);
                                                System.out.print("Enter a new member name: ");
                                                String name = in.next();
                                                System.out.print("Enter " + name + " tier: ");
                                                int tier = in.nextInt();

                                                System.out.print("Enter " + name + " start date: ");
                                                int startDate = in.nextInt();

                                                System.out.print("Enter " + name + " end date: ");
                                                int endDate = in.nextInt();
                                                halls[num2 - 1].getMembers().add(new GymMembers(name, tier, startDate, endDate));
                                                break;
                                            case 2:
                                                System.out.println("Deleting memember");
                                                System.out.println("Which member do you want to delete?");
                                                System.out.print("Your Input:");
                                                halls[num2 - 1].getMembers().remove(in.nextInt() - 1);
                                                break;
                                            case 3:
                                                System.out.println("Goodbye");
                                        }
                                    } while (num4 != 3);

                                    break;
                                case 4:
                                    System.out.println("Goodbye");
                            }
                        } while (num3 != 4);
                    } while (num2 != 11);
                    break;
                case 2:
                    System.out.println("Replacing a hall");
                    System.out.print("Which hall to replace?");
                    int selection = in.nextInt();

                    System.out.print("Enter the name of the new hall: ");
                    String newName = in.next();
                    System.out.print("Enter the capacity of the new hall: ");
                    int newCapacity = in.nextInt();
                    System.out.print("Enter the location of the new hall: ");
                    String newLocation = in.next();
                    halls[selection - 1] = new GymHall(newName, newCapacity, newLocation);
                    System.out.println("New hall added successfully!");
                    break;
                case 3:
                    System.out.println("Goodbye");

                    break;

            }
        } while (num != 3);

    }
}
