
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joshu
 */
public class GymTester1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        // setting up an array and setting up the default values
        GymHall halls[] = new GymHall[10];
        halls[0] = new GymHall("Fitness Tennessee", 100, "Chattanooga");
        halls[1] = new GymHall("Cleveland iron", 100, "Chattanooga");
        halls[2] = new GymHall("Memphis Muscle", 100, "Chattanooga");
        halls[3] = new GymHall("Collegedale Hustle", 100, "Chattanooga");
        halls[4] = new GymHall("Red Bank Tank", 100, "Chattanooga");
        halls[5] = new GymHall("Chattanooga Conditioning", 100, "Chattanooga");
        halls[6] = new GymHall("Gatlinburg Gains", 100, "Chattanooga");
        halls[7] = new GymHall("Franklin Fitness", 100, "Chattanooga");
        halls[8] = new GymHall("Bristol Burn", 100, "Chattanooga");
        halls[9] = new GymHall("Knoxville Kinetics", 100, "Chattanooga");

        // Setting some default trainers
        halls[0].trainers.add(new Trainer("John", "Zumba", halls[0].getLocation()));
        halls[0].trainers.add(new Trainer("Ross", "Zumba", halls[0].getLocation()));
        halls[0].trainers.add(new Trainer("Ron", "Zumba", halls[0].getLocation()));
        halls[0].trainers.add(new Trainer("Gilbert Rodrigez", "Zumba", halls[0].getLocation()));

        halls[1].trainers.add(new Trainer("Tom", "Zumba", halls[0].getLocation()));
        halls[1].trainers.add(new Trainer("Bomb", "Zumba", halls[0].getLocation()));
        halls[1].trainers.add(new Trainer("Skippg", "Zumba", halls[0].getLocation()));
        halls[1].trainers.add(new Trainer("Rigerd", "Zumba", halls[0].getLocation()));

        // setting up default members
        halls[0].members.add(new GymMembers("Jill Bob", 3, 1, 25));
        halls[0].members.add(new GymMembers("Donny", 4, 10, 13));
        halls[0].members.add(new GymMembers("Tilly", 1, 12, 30));
        halls[0].members.add(new GymMembers("Jack", 17, 4, 17));

        halls[1].members.add(new GymMembers("Bobert", 3, 1, 25));
        halls[1].members.add(new GymMembers("Dolly", 4, 10, 13));
        halls[1].members.add(new GymMembers("Felicia", 1, 12, 30));
        halls[1].members.add(new GymMembers("Carmen", 17, 4, 17));

        int num = 0;
        System.out.println("Welcome to the Gym Management System");
        System.out.println("---------------");

        do {
            System.out.println("1. view halls");
            System.out.println("2. add halls");
            System.out.println("3. Delete halls");
            System.out.println("4. Exit");
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
                        System.out.print("Your Input; ");
                        System.out.println("  ");
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
                                    System.out.println("Viewing Trainers");
                                    for (int i = 0; i < halls[num2 - 1].trainers.size(); i++) {
                                        System.out.println("Name:" + halls[num2 - 1].trainers.get(i).getName());
                                    }
                                    System.out.println("  ");
                                    break;
                                case 2:
                                    System.out.println("Viewing classes");
                                    break;
                                case 3:
                                    int num4;
                                    System.out.println("Viewing members");
                                    for (int i = 0; i < halls[num2 - 1].members.size(); i++) {
                                        System.out.println("Name:" + halls[num2 - 1].members.get(i).getName());
                                    }
                                    do {
                                        System.out.println("What action do you want to do?");
                                        System.out.println("1. add members");
                                        System.out.println("2. Delete members");
                                        System.out.println("3. Exit");
                                        num4 = in.nextInt();
                                        switch (num4) {
                                            case 1:
                                                System.out.println("Adding memember");
                                                System.out.println(num4);
                                                System.out.print("Enter a new member name: ");
                                                String name = in.next();
                                                System.out.print("Enter " + name + " tier: ");
                                                int tier = in.nextInt();

                                                System.out.print("Enter " + name + " start date: ");
                                                int startDate = in.nextInt();

                                                System.out.print("Enter " + name + " end date: ");
                                                int endDate = in.nextInt();
                                                halls[0].members.add(new GymMembers(name, tier, startDate, endDate));
                                                break;
                                            case 2:
                                                System.out.println("Deleting memember");
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
                    System.out.println("Hall added");
                    break;
                case 3:
                    System.out.println("Hall deleted");
                    break;
                case 4:
                    System.out.println("Goodbye");
            }
        } while (num != 4);

        if (in.nextInt() == 2) {
            System.out.println("Success2");
        }
    }
}
