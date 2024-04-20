
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
public class GymTester {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        // setting up an array and setting up the default values
        GymHall halls[] = new GymHall[10];
        halls[0] = new GymHall("Fitness Tennessee", 100, "Chattanooga");
        halls[1] = new GymHall("Cleveland iron", 100, "Chattanooga");
        halls[2] = new GymHall("badbok nepotism", 100, "Chattanooga");
        halls[3] = new GymHall("goobermen tilly", 100, "Chattanooga");
        halls[4] = new GymHall("Fscally wag", 100, "Chattanooga");
        halls[5] = new GymHall("dooberman", 100, "Chattanooga");
        halls[6] = new GymHall("ib", 100, "Chattanooga");
        halls[7] = new GymHall("jib", 100, "Chattanooga");
        halls[8] = new GymHall("rib", 100, "Chattanooga");
        halls[9] = new GymHall("lib", 100, "Chattanooga");
       
        // Setting some default trainers
        halls[0].trainers.add(new Trainer("John", "Zumba", halls[0].getLocation()));
        halls[0].trainers.add(new Trainer("Doth", "Zumba", halls[0].getLocation()));
        halls[0].trainers.add(new Trainer("Ron", "Zumba", halls[0].getLocation()));
        halls[0].trainers.add(new Trainer("Gilbert Rodrigez", "Zumba", halls[0].getLocation()));
        
        halls[1].trainers.add(new Trainer("Tom", "Zumba", halls[0].getLocation()));
        halls[1].trainers.add(new Trainer("Bomb", "Zumba", halls[0].getLocation()));
        halls[1].trainers.add(new Trainer("Skippg", "Zumba", halls[0].getLocation()));
        halls[1].trainers.add(new Trainer("Rigerd", "Zumba", halls[0].getLocation()));
        
        // setting up default members
        halls[0].members.add(new GymMembers("Jill Bob", 3, 1, 25 ));
        halls[0].members.add(new GymMembers("Donny", 4, 10, 13 ));
        halls[0].members.add(new GymMembers("Tally", 1, 12, 30 ));
        halls[0].members.add(new GymMembers("Jack", 17, 4, 17 ));
        
        halls[1].members.add(new GymMembers("Bobert", 3, 1, 25 ));
        halls[1].members.add(new GymMembers("Doly", 4, 10, 13 ));
        halls[1].members.add(new GymMembers("Flipion", 1, 12, 30 ));
        halls[1].members.add(new GymMembers("Contake", 17, 4, 17 ));
        
        int num = 0;
        System.out.println("Gym Management");
        System.out.println("---------------");
        System.out.println("1. view halls");
        System.out.println("2. add halls");
        System.out.println("3. Delete halls");
        System.out.println("4. Exit");
        do {
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
                    do {
                        System.out.println("Which Hall do you want to inspect?Zz");
                        System.out.print("Your Input; ");
                        num2 = in.nextInt();
                        switch (num2) {
                            case 1:
                                System.out.println("Viewing hall 1");
                                System.out.println("------------------------------------------------------------------");
                                System.out.println("What information do you want to view?");
                                System.out.println("1. view Trainers");
                                System.out.println("2. view classes");
                                System.out.println("3. view members");
                                System.out.println("4. Exit");
                                do {
                                    System.out.print("Your Input; ");
                                    num = in.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Viewing Trainers");
                                            for (int i = 0; i < halls[num2 -1].trainers.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].trainers.get(i).getName());
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Viewing classes");
                                            break;
                                        case 3:
                                            System.out.println("Viewing members");
                                            for (int i = 0; i < halls[num2 -1].members.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].members.get(i).getName());
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Goodbye");
                                    }
                                } while (num != 4);
                                break;
                            case 2:
                                System.out.println("Viewing hall 2");
                                 System.out.println("Viewing hall 1");
                                System.out.println("------------------------------------------------------------------");
                                System.out.println("What information do you want to view?");

                                System.out.println("1. view Trainers");
                                System.out.println("2. view classes");
                                System.out.println("3. view members");
                                System.out.println("4. Exit");
                                do {
                                    System.out.print("Your Input; ");
                                    num = in.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Viewing Trainers");
                                            for (int i = 0; i < halls[num2 -1].trainers.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].trainers.get(i).getName());
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Viewing classes");
                                            break;
                                        case 3:
                                            System.out.println("Viewing members");
                                            for (int i = 0; i < halls[num2 -1].members.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].members.get(i).getName());
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Goodbye");
                                    }
                                } while (num != 4);
                                break;
                            case 3:
                                System.out.println("Viewing hall 3");
                                 System.out.println("Viewing hall 1");
                                System.out.println("------------------------------------------------------------------");
                                System.out.println("What information do you want to view?");

                                System.out.println("1. view Trainers");
                                System.out.println("2. view classes");
                                System.out.println("3. view members");
                                System.out.println("4. Exit");
                                do {
                                    System.out.print("Your Input; ");
                                    num = in.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Viewing Trainers");
                                            for (int i = 0; i < halls[num2 -1].trainers.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].trainers.get(i).getName());
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Viewing classes");
                                            break;
                                        case 3:
                                            System.out.println("Viewing members");
                                            for (int i = 0; i < halls[num2 -1].members.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].members.get(i).getName());
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Goodbye");
                                    }
                                } while (num != 4);
                                break;
                            case 4:
                                System.out.println("Viewing hall 4");
                                 System.out.println("Viewing hall 1");
                                System.out.println("------------------------------------------------------------------");
                                System.out.println("What information do you want to view?");

                                System.out.println("1. view Trainers");
                                System.out.println("2. view classes");
                                System.out.println("3. view members");
                                System.out.println("4. Exit");
                                do {
                                    System.out.print("Your Input; ");
                                    num = in.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Viewing Trainers");
                                            for (int i = 0; i < halls[num2 -1].trainers.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].trainers.get(i).getName());
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Viewing classes");
                                            break;
                                        case 3:
                                            System.out.println("Viewing members");
                                            for (int i = 0; i < halls[num2 -1].members.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].members.get(i).getName());
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Goodbye");
                                    }
                                } while (num != 4);
                            case 5:
                                System.out.println("Viewing hall 5");
                                 System.out.println("Viewing hall 1");
                                System.out.println("------------------------------------------------------------------");
                                System.out.println("What information do you want to view?");

                                System.out.println("1. view Trainers");
                                System.out.println("2. view classes");
                                System.out.println("3. view members");
                                System.out.println("4. Exit");
                                do {
                                    System.out.print("Your Input; ");
                                    num = in.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Viewing Trainers");
                                            for (int i = 0; i < halls[num2 -1].trainers.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].trainers.get(i).getName());
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Viewing classes");
                                            break;
                                        case 3:
                                            System.out.println("Viewing members");
                                            for (int i = 0; i < halls[num2 -1].members.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].members.get(i).getName());
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Goodbye");
                                    }
                                } while (num != 4);
                                break;
                            case 6:
                                System.out.println("Viewing hall 6");
                                 System.out.println("Viewing hall 1");
                                System.out.println("------------------------------------------------------------------");
                                System.out.println("What information do you want to view?");

                                System.out.println("1. view Trainers");
                                System.out.println("2. view classes");
                                System.out.println("3. view members");
                                System.out.println("4. Exit");
                                do {
                                    System.out.print("Your Input; ");
                                    num = in.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Viewing Trainers");
                                            for (int i = 0; i < halls[num2 -1].trainers.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].trainers.get(i).getName());
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Viewing classes");
                                            break;
                                        case 3:
                                            System.out.println("Viewing members");
                                            for (int i = 0; i < halls[num2 -1].members.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].members.get(i).getName());
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Goodbye");
                                    }
                                } while (num != 4);
                            case 7:
                                System.out.println("Viewing hall 7");
                                 System.out.println("Viewing hall 1");
                                System.out.println("------------------------------------------------------------------");
                                System.out.println("What information do you want to view?");

                                System.out.println("1. view Trainers");
                                System.out.println("2. view classes");
                                System.out.println("3. view members");
                                System.out.println("4. Exit");
                                do {
                                    System.out.print("Your Input; ");
                                    num = in.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Viewing Trainers");
                                            for (int i = 0; i < halls[num2 -1].trainers.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].trainers.get(i).getName());
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Viewing classes");
                                            break;
                                        case 3:
                                            System.out.println("Viewing members");
                                            for (int i = 0; i < halls[num2 -1].members.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].members.get(i).getName());
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Goodbye");
                                    }
                                } while (num != 4);
                                break;
                            case 8:
                                System.out.println("Viewing hall 8");
                                 System.out.println("Viewing hall 1");
                                System.out.println("------------------------------------------------------------------");
                                System.out.println("What information do you want to view?");

                                System.out.println("1. view Trainers");
                                System.out.println("2. view classes");
                                System.out.println("3. view members");
                                System.out.println("4. Exit");
                                do {
                                    System.out.print("Your Input; ");
                                    num = in.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Viewing Trainers");
                                            for (int i = 0; i < halls[num2 -1].trainers.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].trainers.get(i).getName());
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Viewing classes");
                                            break;
                                        case 3:
                                            System.out.println("Viewing members");
                                            for (int i = 0; i < halls[num2 -1].members.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].members.get(i).getName());
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Goodbye");
                                    }
                                } while (num != 4);
                                break;
                            case 9:
                                System.out.println("Viewing hall 9");
                                 System.out.println("Viewing hall 1");
                                System.out.println("------------------------------------------------------------------");
                                System.out.println("What information do you want to view?");

                                System.out.println("1. view Trainers");
                                System.out.println("2. view classes");
                                System.out.println("3. view members");
                                System.out.println("4. Exit");
                                do {
                                    System.out.print("Your Input; ");
                                    num = in.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Viewing Trainers");
                                            for (int i = 0; i < halls[num2 -1].trainers.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].trainers.get(i).getName());
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Viewing classes");
                                            break;
                                        case 3:
                                            System.out.println("Viewing members");
                                            for (int i = 0; i < halls[num2 -1].members.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].members.get(i).getName());
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Goodbye");
                                    }
                                } while (num != 4);
                            case 10:
                                System.out.println("Viewing hall 10");
                                 System.out.println("Viewing hall 1");
                                System.out.println("------------------------------------------------------------------");
                                System.out.println("What information do you want to view?");

                                System.out.println("1. view Trainers");
                                System.out.println("2. view classes");
                                System.out.println("3. view members");
                                System.out.println("4. Exit");
                                do {
                                    System.out.print("Your Input; ");
                                    num = in.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Viewing Trainers");
                                            for (int i = 0; i < halls[num2 -1].trainers.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].trainers.get(i).getName());
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Viewing classes");
                                            break;
                                        case 3:
                                            System.out.println("Viewing members");
                                            for (int i = 0; i < halls[num2 -1].members.size(); i++) {
                                                System.out.println("Name:" + halls[num2 -1].members.get(i).getName());
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Goodbye");
                                    }
                                } while (num != 4);
                                break;
                            case 11:
                                System.out.println("______");

                        }
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
