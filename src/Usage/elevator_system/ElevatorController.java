package Usage.elevator_system;

import java.util.PriorityQueue;

public class ElevatorController {

    // Applying lookup operation,
    // we cannot add below a floor while going uploads
    PriorityQueue<Integer> upMinPQ; // pehle humsa neech wale floor pe rukega upar jaate samy
    PriorityQueue<Integer> downMaxPQ; // pehle humesa upar wale floor pe rukega neech jaate samy like 8 to 6 floor to 8 pe pehle then 7 ..
    ElevatorCar elevatorCar;

    ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a, b) -> b - a);
    }

    public void submitExternalRequest(int floor, Direction direction) {
        if (direction == Direction.DOWN) {
            downMaxPQ.offer(floor);
        } else {
            upMinPQ.offer(floor);
        }
    }

    public void submitInternalRequest(int floor) {
    }

    public void controlElevator() {
        while (true) {
            if (elevatorCar.elevatorDirection == Direction.UP) {
            }
        }
    }

}
