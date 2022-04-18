package jason.pracEnum;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Fruit {


    APPLE("red"), PEACH("pink"), BANANA("yellow");


//    Fruit(String color){
//        this.color=color;
//    }

    String color;

}
