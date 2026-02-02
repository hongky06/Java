public class Program {
    public static void main(String[] args) {


        ClassRoom sv1 = new ClassRoom("An");
        ClassRoom sv2 = new ClassRoom("Bình");
        ClassRoom sv3 = new ClassRoom("Chi");


        sv1.contribute(100_000);
        sv2.contribute(150_000);
        sv3.contribute(200_000);


        ClassRoom.showClassFund();
    }
}
