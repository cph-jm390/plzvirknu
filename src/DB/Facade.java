package DB;

import Entitet.Bog;

public class Facade {
    public static Bog opretBog(Bog bog){
        return BogMapper.opretBog();

    }



}
