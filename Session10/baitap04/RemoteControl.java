package Session10.baitap04;

public interface RemoteControl {
    void powerOn();
    default void checkBattery() {
        System.out.println("Pin ổn định");
    }
}
