public class Coffee extends Drink{
    protected boolean hasMilk;
    public Coffee(int id, String name, double price,boolean hasMilk) {
        super(id, name, price);
        this.hasMilk=hasMilk;
    }

    @Override
    double calculatePrice() {
        double allprice=0;
        if(hasMilk==true){
            allprice=price+5000;
        }else {
            allprice=price;
        }
        return allprice;
    }
    @Override
    void displayinfo(){
        super.displayinfo();
        System.out.println(hasMilk?"co sua":"Den da");
    }
}
