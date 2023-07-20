
package Service;

import Entity.Client;
import Entity.Routine;

import java.util.ArrayList;
import java.util.Scanner;

public class RoutineService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Routine> routines = new ArrayList<>();

    public void instanciarRutina(){
        Routine routine=new Routine();
        routineCreation(routine);
    }

    public void routineCreation(Routine routine) {

        System.out.println(">>>Enter your ID number");
        routine.setId(read.nextInt());
        System.out.println(">>>Enter the routine name");
        routine.setName(read.next());
        System.out.println(">>>Enter the routine duration");
        routine.setDuration(read.nextDouble());
        System.out.println(">>>Enter the difficulty");
        routine.setLevelDifficulty(read.nextInt());
        System.out.println(">>>Enter the routine description");
        routine.setDescription(read.next());

        routines.add(routine);
    }

    public void getRoutines() {
        for (int i = 0; i < routines.size(); i++) {
            System.out.println(routines.get(i));
        }
    }

    public void updateRoutine(int id) {
        for (int i = 0; i < routines.size(); i++) {
            if (routines.get(i).getId() == id) {
                Routine r = routines.get(i);
                int response;
                do {
                    System.out.println("would you like to update this routine?");
                    System.out.println("1. update name");
                    System.out.println("2. update duration");
                    System.out.println("3. update difficulty level");
                    System.out.println("4. update description");
                    System.out.println("0. exit.");
                    response = read.nextInt();

                    switch(response){
                        case 1:
                            System.out.println("Enter the name to update");
                            r.setName(read.next());
                            break;
                        case 2:
                            System.out.println("Enter the duration to be updated");
                            r.setDuration(read.nextDouble());
                            break;
                        case 3:
                            System.out.println("Enter the difficulty level to be updated");
                            r.setLevelDifficulty(read.nextInt());
                            break;
                        case 4:
                            System.out.println("Enter the description to be updated");
                            r.setDescription(read.next());
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

    public void removeRoutine(int id) {
        for (int i = 0; i < routines.size(); i++) {
            if (routines.get(i).getId() == id) {
                routines.remove(i);
            }
        }
    }
     
}
