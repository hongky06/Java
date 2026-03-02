package Session15.baitap02;

public class Main {
    public static void main(String[] args) {
        PatientQueue patientQueue = new PatientQueue();
        patientQueue.addPatient(new Patient("1", 19,"Đỗ Khắc Quyền"));
        patientQueue.addPatient(new Patient("2", 19,"KKK"));
        patientQueue.addPatient(new Patient("3", 19,"QQQQ"));
        patientQueue.displayPatient();
        System.out.println("Gọi Khám: ");
        System.out.println(patientQueue.callNextPatient().getName());
        System.out.println("Bệnh nhân tiếp theo: ");
        System.out.println(patientQueue.peekNextPatient().getName());

    }
}
