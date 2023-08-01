package org.example;

public class WineClient {
    private RedWine redWine;
    void setWine(RedWine redWine){
        this.redWine = redWine;
    }

    public void drinkWine(){
        System.out.println("I am drinking " + redWine.getColor() + " wine");
    }

    public static void main(String[] args) {
        WineClient client = new WineClient();
        RedWine wine = new RedWine();
        client.setWine(wine);
        client.drinkWine();
    }
}
