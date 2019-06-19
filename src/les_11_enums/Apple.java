package les_11_enums;

public enum Apple {
    GOLDEN(100,Season.WINTER), RED(15,Season.AUTUMN), WINE(30,Season.SUMMER);

    private int price;
    private Season season;

    Apple(int price, Season season) {
        this.price = price;
        this.season = season;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Season getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return name()+"{" +
                "price=" + getPrice() +
                ", season=" + getSeason() +
                '}';
    }
}
