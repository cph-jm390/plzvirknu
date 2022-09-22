import DB.Facade;
import Entitet.Bog;
import MineUtil.BrugerInput;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        List <Bog> bogList = new ArrayList<>();


        while(true){

            switch(BrugerInput.getString("hvad ønsker du svans")){
                case "opret bog":
                    Bog bog = new Bog(BrugerInput.getString("Angiv title"),
                            BrugerInput.getString("Angiv forfatter"));
                    System.out.println("du har nu oprettet bogen: " + Facade.opretBog(bog).toString());
                    break;
                case "hent bøger":
                    bogList=Facade.hentBøger();
                    udskriv(bogList);
            }
        }


    }

    public static void udskriv (List <Bog> objectList){
    for (Bog bog:objectList){
        System.out.println(bog.toString());
    }
    }
}
