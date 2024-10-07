package tmsl.shirsak;

public class SetGetPerson{
    private String name, colour;
    private byte hands, legs;
    private float height;
    public void setName(String name) {
        this.name = name;
    }
    public void setHands(byte hands){
        this.hands = hands;
    }
    public void setLegs(byte legs){
        this.legs = legs;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public String getName(){
        return name;
    }
    public byte getHands(){
        return hands;
    }
    public byte getLegs(){
        return legs;
    }
    public float getHeight() {
        return height;
    }
    public String getColour(){
        return colour;
    }
    public void jobLocation(){
        if(getName().charAt(0) == 'S'){
            System.out.println("Hyderabad");
        }
        else{
            System.out.println("Mumbai");
        }
    }
    public void workerCondition(){
        if(getLegs() < 2 || getHands() < 2){
            System.out.println("Subsidised Worker");
        }
        else{
            System.out.println("Normal Worker");
        }
    }

    public static void main(String[] args) {
        SetGetPerson soumyadeep = new SetGetPerson();
        soumyadeep.setName("Soumyadeep");
        soumyadeep.setColour("Brown");
        soumyadeep.setHands((byte) 2);
        soumyadeep.setLegs((byte) 2);
        SetGetPerson shirsak = new SetGetPerson();
        shirsak.setName("Shirsak");
        shirsak.setColour("Brown");
        shirsak.setHands((byte) 2);
        shirsak.setLegs((byte) 2);
        soumyadeep.jobLocation();
        shirsak.jobLocation();
        soumyadeep.workerCondition();
        shirsak.workerCondition();
    }
}