import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Elevator> elevatorList = new ArrayList<>();
        Elevator e1 = new Elevator(1,false,2);
        Elevator e2 = new Elevator(2, true, 10);
        Elevator e3 = new Elevator(3,false,3);
        Elevator e4 = new Elevator(4, true, 5);
        Elevator e5 = new Elevator(5,false,0);
        Elevator e6 = new Elevator(6, true, 1);
        elevatorList.addAll(Arrays.asList(e1,e2,e3,e4,e5,e6));

        System.out.println("Calling elevator number: "+callElevator(4,elevatorList));
    }

    private static int callElevator(int floor, List<Elevator> elevatorList) {
        List<Elevator> staticElevators = elevatorList.stream().filter(x -> !x.moving).collect(Collectors.toList());
        if(staticElevators.size() > 0){
            return getClosestElevator(staticElevators, floor);
        }else{
            return getClosestElevator(elevatorList, floor);
        }
    }

    private static int getClosestElevator(List<Elevator> elevatorList, int floor) {
        //assuming worst case scenario
        int result = elevatorList.size();
        Elevator resultElevator = null;
        for(Elevator elevator : elevatorList){
            int separation = Math.abs(elevator.getFloor()-floor);
            if(separation<result){
                result = elevator.getNumber();
                resultElevator = elevator;
            }
        }
        return resultElevator.number;
    }
}