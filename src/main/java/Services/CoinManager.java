package Services;

import Model.Coin;

public class CoinManager {
    public static Coin CoinMaker(){
        return new Coin("Euro",10.0);
    }
}
