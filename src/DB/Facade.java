package DB;

import Entitet.Bog;

import java.sql.SQLException;
import java.util.List;

public class Facade {
    public static List<Bog> hentBøger() throws SQLException {
        return BogMapper.hentBøger();
    }

    public static Bog opretBog(Bog bog) throws SQLException {
        return BogMapper.opretBog(bog);

    }



}
