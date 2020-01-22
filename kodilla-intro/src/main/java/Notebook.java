public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
            }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
            }
    public void checkWeight() {
        if(this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if(this.weight > 1000 && this.weight < 2000) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println ("This notebook is heavy.");
        }
            }
    public void checkPriceToYear() {
        if(this.year < 2012 && this.price <= 500) {
            System.out.println("This notebook is very old but cheap.");
        } else if(this.year < 2012) {
            System.out.println("You must be crazy. This notebook is old and expensive.");
        } else if(this.year <= 2015 && this.price <= 500) {
            System.out.println("This notebook is old but great priced.");
        } else if(this.year > 2015 && this.price <= 500) {
            System.out.println("The price is too good to be true.");
        } else if(this.year > 2015 && this.price <= 1500) {
            System.out.println("This notebook's class and price are well balanced.");
        } else if(this.year > 2015 && this.year < 2020) {
            System.out.println("Nice. This notebook is quite new and expensive.");
        } else {
            System.out.println("Lucky you! You pay a lot for the most modern notebook.");
        }
        }
    }