public class Keyboard {


    private final String type;
    private final boolean illumination;
    private final double weight;

    public Keyboard(String type, boolean illumination, double weight) {
        this.type = type;
        this.illumination = illumination;
        this.weight = weight;
    }


    public Keyboard setType(String type) {
        return new Keyboard(type, illumination, weight);
    }

    public Keyboard setIllumination(boolean illumination) {
        return new Keyboard(type, illumination, weight);
    }

    public Keyboard setWeight(double weight) {
        return new Keyboard(type, illumination, weight);
    }

    public String getType() {
        return type;
    }

    public boolean isIllumination() {
        return illumination;
    }

    public double getWeight() {
        return weight;
    }


    public String toString() {
        return "\nТип клавиатуры : " + type +
                "\nНаличие подсветки : " + illumination +
                "\nВес клавиатуры : " + weight + " гр";
    }
}
