package Service;

import Entity.Client;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ClientService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Client> clients = new ArrayList<>();

    public void clientCreation() {

        System.out.println(">>>Enter your ID number");
        int id = read.nextInt();
        System.out.println(">>>Enter your name");
        String name = read.next();
        System.out.println(">>>Enter your age");
        int age = read.nextInt();
        System.out.println(">>>Enter your height");
        double height = read.nextDouble();
        System.out.println(">>>Enter your weight");
        double weight = read.nextDouble();
        System.out.println(">>>Enter your target");
        String target = read.next();

        Client c = new Client(id, name, age, height, weight, target);
        clients.add(c);
    }

    public void getClients() {
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(clients.get(i));
        }
    }

    public void updateClient(int id) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {
                Client c = clients.get(i);
                int response;
                do {
                    System.out.println("would you like to update this client?");
                    System.out.println("1. update name");
                    System.out.println("2. update age");
                    System.out.println("3. update height");
                    System.out.println("4. update weight");
                    System.out.println("5. update target");
                    System.out.println("0. exit.");
                    response = read.nextInt();

                    switch(response){
                        case 1:
                            System.out.println("Enter the name to update");
                            c.setName(read.next());
                            break;
                        case 2:
                            System.out.println("Enter the age to be updated");
                            c.setAge(read.nextInt());
                            break;
                        case 3:
                            System.out.println("Enter the height to be updated");
                            c.setHeight(read.nextDouble());
                            break;
                        case 4:
                            System.out.println("Enter the weight to be updated");
                            c.setWeight(read.nextDouble());
                            break;
                        case 5:
                            System.out.println("Enter the taget to be updated");
                            c.setTarget(read.next());
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("the number is invalid");
                            break;

                    }
                }while (response!=0);
            }else {
                System.out.println("The ID does not exist");
            }
        }
    }

    
    public void removeClient(int id) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {
                clients.remove(i);
            }
        }
    }
}
