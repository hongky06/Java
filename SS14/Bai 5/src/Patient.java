class Patient {
    String name;
    int severity;
    int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        String muc;
        if (severity == 1) {
            muc = "Mức 1 - Nguy kịch";
        } else if (severity == 2) {
            muc = "Mức 2 - Trung bình";
        } else {
            muc = "Mức 3 - Nhẹ";
        }
        return name + " (" + muc + ")";
    }
}