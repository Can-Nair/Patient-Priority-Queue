import java.util.Comparator;

public class PatientComparator  implements Comparator<Patient> {


    @Override
    public int compare(Patient o1, Patient o2) {
        if(o1.getPriority() > o2.getPriority())
            return 1;
        else if (o1.getPriority() == o2.getPriority()) {
            if(o1.getArrivalOrder() > o2.getArrivalOrder())
                return -1;
            else if(o1.getArrivalOrder()<o2.getArrivalOrder())
                return 1;
            else
                return 0;
        }
        else if(o1.getPriority() < o2.getPriority())
            return -1;
        else
            return 0;
    }
}
