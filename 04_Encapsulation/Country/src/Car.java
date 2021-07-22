public class Car {

    String name;
    int maxSpeed;
    double weight;
    int yearOfIssue;

    public Car(String name, int maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    public String getName(){
        return name;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public double getWeight(){
        return weight;
    }
    public int getYearOfIssue(){
        return yearOfIssue;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setYearOfIssue(int yearOfIssue){
        this.yearOfIssue = yearOfIssue;
    }

}
