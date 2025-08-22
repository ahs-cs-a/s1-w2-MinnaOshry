public class BodyOfWater {
    private String name;
    private int largestDiameter;
    private int aveDepth;
    private String isSaltWater;

    public BodyOfWater(String n, int l, int d, String s){
        name = n;
        largestDiameter = l;
        aveDepth = d;
        isSaltWater = s;
    }

    public void name(){
        System.out.println("My name is: " + name );
    }

    public void largestDiameter(){
        System.out.println("The largest diameter is: " + largestDiameter);
    }

    public void aveDepth(){
        System.out.println("the average depth is: " + aveDepth);
    }

    public void isSaltWater(){
        System.out.println("is it salt water? :" + isSaltWater);
    }
}
