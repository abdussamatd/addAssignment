package Componenets;

import Componenets.Builder.StandardHouseBuilder;
import Componenets.Directors.*;
import Componenets.Rooms.House;

public class Main {
    public static void main(String[] args) {

        StandardHouseBuilder standard = new StandardHouseBuilder();
        DoubleBedroomHouseBuildDirector twoBedroom = new DoubleBedroomHouseBuildDirector(standard);
        twoBedroom.constructHouse();
        House house = standard.getHouse();

        ManualHouseBuilder counting = new ManualHouseBuilder();


    }
}
