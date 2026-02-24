public class Main {
    public static void main(String[] args) {
        Drink [] drinks=new Drink[3];
        drinks[0]=new Coffee(1,"Bac siu",30000,true);
        drinks[1]=new FruitJuice(2,"Nuoc cam",40000,10);
        drinks[2]=null;
        for (int i=0;i<3;i++){
            if(drinks[i]==null){
                System.out.println("nuoc khong ton tai");
            }
            drinks[i].displayinfo();
            System.out.println("tong tien:"+drinks[i].calculatePrice());
            if(drinks[i] instanceof FruitJuice){
                ((FruitJuice) drinks[i]).mix();
            }
        }

    }
}
