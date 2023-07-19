package Main;

import Entity.Routine;
import Service.ClientService;
import Service.RoutineService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ClientService cs = new ClientService();
        RoutineService rs=new RoutineService();
        Routine routine=new Routine();
        int option;

        do {
            System.out.println("----GYM APP----");
            System.out.println("MENU:");
            System.out.println("1.Create client");
            System.out.println("2.Show client details");
            System.out.println("3.Update client details");
            System.out.println("4.Remove client");
            System.out.println("5.Create routine");
            System.out.println("6.Show routine details");
            System.out.println("7.Update routine details");
            System.out.println("8.Remove croutine");
            System.out.println("0.Exit");
            option = read.nextInt();
            int idUpdate;
            int idRemove;
            switch (option) {
                case 1:
                    cs.clientCreation();
                    break;
                case 2:
                    cs.getClients();
                    break;
                case 3:
                    System.out.println("Enter the id to be updated");
                    idUpdate= read.nextInt();
                    cs.updateClient(idUpdate);
                    break;
                case 4:
                    System.out.println("Enter the id to be removed");
                    idRemove= read.nextInt();
                    cs.removeClient(idRemove);
                    break;
                case 5:
                    rs.routineCreation(routine);
                    break;
                case 6:
                    rs.getRoutines();
                    break;
                case 7:
                    System.out.println("Enter the id to be updated");
                    idUpdate= read.nextInt();
                    rs.updateRoutine(idUpdate);
                    break;
                case 8:
                    System.out.println("Enter the id to be removed");
                    idRemove= read.nextInt();
                    rs.removeRoutine(idRemove);
                default:
                    System.out.println("Enter a valid number");
            }
        }while (option!=0);

    }
}
