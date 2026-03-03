public abstract class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        if (id == null || name == null) {
            throw new IllegalArgumentException("Id và Name không được null");
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateFinalPrice();

    public void displayInfo() {
        System.out.println("Mã: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Giá gốc" + price);
    }
}

