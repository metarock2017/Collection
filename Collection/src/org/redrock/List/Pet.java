package org.redrock.List;

/**
 * Created by wang on 2017/8/6.
 */
public class Pet{
    private String name;
    private int weight;

    public Pet(){

    }

    public Pet(String name,int weight){
        this.name = name;
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Pet(String name) {this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
//    }
}
