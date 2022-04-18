package jason.pracEnum;

public class Main {


    public static void main(String[] args) {


        for(Fruit fruit: Fruit.values()){
            System.out.println(fruit.getColor());
        }
    }
}
