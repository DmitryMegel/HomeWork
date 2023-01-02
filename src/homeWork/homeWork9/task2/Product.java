package homeWork.homeWork9.task2;

/**
 * Характеристики товара.
 *
 * @author Mehel_DS created 02.01.2023
 */
public class Product {

    /**
     * Тип товара (1 - молочный, 2 - кондитерский, 3 - электроника)
     */
    private int type;

    /**
     * Название товара
     */
    private String name;

    /**
     * Вес товара
     */
    private double weight;

    public Product(int type, String name, double weight) {
        this.type = type;
        this.name = name;
        this.weight = weight;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getProductInfo(){
        return "тип: " + this.type + ", название: " + this.name + ", вес: " + this.weight;
    }
}
