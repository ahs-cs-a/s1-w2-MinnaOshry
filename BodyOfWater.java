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
    public BodyOfWater(String n,  int d){
        name = n;
        aveDepth = d;
    
    }
    public void setName(String n){
        name = n;
    }
    public void setlargestDiameter(int l){
        largestDiameter = l;
    }
    public void name(){
        System.out.println("My name is: " + name );
    }
    public void printState(){
        System.out.println("My name is: " + name );
        System.out.println("The largest diameter is: " + largestDiameter);

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
