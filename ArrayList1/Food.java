package ArrayList1;

public class Food {
    private String name;
    private double price;
    private String desc;

    public Food(String name,double price,String desc){
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public Food(){

    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getDesc(){
        return desc;
    }

    public void setName(String name){
        this.name = name;
    } 

    public void setPrice(double price){
        this.price = price;
    } 

    public void setDesc(String desc){
        this.desc = desc;
    } 
}
