import java.util.Comparator;

class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {


        if (p1.severity != p2.severity) {
            return p1.severity - p2.severity;
        }


        return p1.arrivalTime - p2.arrivalTime;
    }
}