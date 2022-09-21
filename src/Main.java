import DB.Facade;
import Entitet.Bog;
import MineUtil.BrugerInput;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
//Bog bog = new Bog("lille ole i skoven","ole hansen");
       // Facade.opretBog(bog);

        while(true){

            switch(BrugerInput.getString("hvad ønsker du svans")){
                case "opret bog":
                    Bog bog = new Bog(BrugerInput.getString("Angiv title"),
                            BrugerInput.getString("Angiv forfatter"));
                    System.out.println("du har nu oprettet bogen: " + Facade.opretBog(bog).toString());
            }
        }


    }
}
