package instruments;

public abstract class Instrument {
    private String model;
    private String color;
    private String sound;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String model, String color, String sound, double buyPrice, double sellPrice) {
        this.model = model;
        this.color = color;
        this.sound = sound;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }


};
