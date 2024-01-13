package project2;

public abstract  class Car {
    double carPrice;
         String color;

        public Car(double carPrice, String color) {
            this.carPrice = carPrice;
            this.color = color;
        }

        public abstract double calculateSalePrice();

    public static class Truck extends Car {
        private double weight;

        public Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        @Override
        public double calculateSalePrice() {

            if (weight > 2000) {
                return carPrice * 0.90;
            } else {
                return carPrice * 0.80;
            }
        }
    }

    public static class Sedan extends Car {
        private double length;

        public Sedan(double carPrice, String color, double length) {
            super(carPrice, color);
            this.length = length;
        }

        @Override
        public double calculateSalePrice() {

            if (length > 20) {
                return carPrice * 0.95;
            } else {
                return carPrice * 0.90;
            }
        }
    }
}


