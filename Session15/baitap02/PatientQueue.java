package Session15.baitap02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PatientQueue {
    Queue<Patient> queue =new LinkedList<>();
    public void addPatient(Patient patient) {
        queue.add(patient);
        System.out.println("Đã thêm bệnh nhân");
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public Patient callNextPatient() {
        if(isEmpty()){
            System.out.println("Danh sách trống");
            return null;
        }
        return queue.poll();
    }
    public Patient peekNextPatient() {
        if(isEmpty()){
            System.out.println("Danh sách trống");
            return null;
        }
        return queue.peek();
    }
    public void displayPatient() {
       if(isEmpty()){
           System.out.println("Danh sách rỗng!");
           return;
       }
       for(Patient patient : queue){
           System.out.println("Tên: "+ patient.getName() +" Tuổi: "+ patient.getAge());
       }
    }

}
