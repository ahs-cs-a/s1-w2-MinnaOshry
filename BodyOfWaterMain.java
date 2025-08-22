public class BodyOfWaterMain {
    public static void main(String[] args) {
        //public BodyOfWater(String n, int l, int d, String s)
        BodyOfWater b = new BodyOfWater("pacific ocean", 10000, 500, "yes");
        BodyOfWater b1 = new BodyOfWater("atlantic", 5000);
        BodyOfWater b2 = new BodyOfWater("ocean", 6);
        b.printState();
        b1.printState();
        b2.setName("lake");
        b2.printState();
    }
}
