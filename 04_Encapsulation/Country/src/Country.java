public class Country {
    String name;
    int population;
    double area;
    String capital;
    boolean sea = false;

    public Country(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getPopulation(){
        return population;
    }
    public double getArea(){
        return area;
    }
    public String getCapital() {
        return capital;
    }
    public boolean isSea() {
        return sea;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPopulation(int population){
        this.population = population;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setCapital(String capital){
        this.capital = capital;
    }
    public void setSea(boolean sea) {
        this.sea = sea;
    }



}
