class Patient {
    String ten;
    int tuoi;
    String khoa;

    public Patient(String ten, int tuoi, String khoa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return ten + " (" + tuoi + " tuổi)";
    }
}