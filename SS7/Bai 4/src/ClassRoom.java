class ClassRoom {
    static double classFund;
    String instance;

    public ClassRoom(String studentName) {
        this.instance = studentName;
    }

    public void contribute(double amount) {
        classFund += amount;
        System.out.println(instance + " đã đóng " + amount);
    }

    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp: " + classFund);
    }
}
