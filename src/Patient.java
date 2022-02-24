public class Patient implements Comparable<Patient> {
    private String name;
    private int priority;
    private int arrivalOrder;
public Patient (String name, int priority, int order) {
    this.name = name;
    this.priority = priority;
    this.arrivalOrder =  order;
}

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", arrivalOrder=" + arrivalOrder +
                '}';
    }

    @Override
    public int compareTo(Patient p) {
        if(this.priority >p.priority)
            return 1;
        else if(this.priority == p.priority)
            return 0;
        else
            return -1;
    }


    public int getArrivalOrder() {
        return arrivalOrder;
    }



    public int getPriority() {
        return priority;
    }


}
