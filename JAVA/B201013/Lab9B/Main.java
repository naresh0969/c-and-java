/*5. Write a Program using Threads for the following case study: Train Reservation system
To reserve a berth the following process need to be followed, at first check the number of
available berths with the requested berths, if the number of requested berths are less than
or equal to availabe berths then allot berth and print ticket or else display no berths are
available.
Assume that N persons are trying to reserve the berth, display their sequence of
reservation status along with the number of available berths.
Note : The person can print ticket only if berth is confirmed. */
package B201013.Lab9B;

class TrainReservationSystem {
    private int availableBerths;

    public TrainReservationSystem(int availableBerths) {
        this.availableBerths = availableBerths;
    }

    public synchronized void reserveBerth(int requestedBerths, int personId) {
        if (requestedBerths <= availableBerths) {
            availableBerths -= requestedBerths;
            System.out.println("Person " + personId + " reserved " + requestedBerths + " berth(s). Available berths: " + availableBerths);
            System.out.println("Ticket printed for person " + personId);
        } else {
            System.out.println("Sorry, Person " + personId + ". No berths available.");
        }
    }
}

class Person extends Thread {
    private TrainReservationSystem reservationSystem;
    private int requestedBerths;
    private int personId;

    public Person(TrainReservationSystem reservationSystem, int requestedBerths, int personId) {
        this.reservationSystem = reservationSystem;
        this.requestedBerths = requestedBerths;
        this.personId = personId;
    }

    public void run() {
        reservationSystem.reserveBerth(requestedBerths, personId);
    }
}

public class Main {
    public static void main(String[] args) {
        TrainReservationSystem reservationSystem = new TrainReservationSystem(10); // Assuming 10 available berths
        int numPersons = 15; // Number of persons trying to reserve berth

        // Creating and starting threads for each person
        for (int i = 1; i <= numPersons; i++) {
            int requestedBerths = (int) (Math.random() * 5) + 1; // Randomly assigning requested berths between 1 and 5
            new Person(reservationSystem, requestedBerths, i).start();
        }
    }
}

