package viev;

import java.util.*;
import classes.*;
public class BuyersViev {
    List<Buyer> buyers;

    public BuyersView(List<Buyer> buyers) {
        this.buyers = buyers;
    }

    public void ShowTable() {
        //Вывести в консоль таблицу игрушек
        System.out.println("\nТаблица Покупатели (Участники розыгрыша)\n---------------");
        for (Buyer item : buyers) {
            System.out.println(item.toString());
        }
    }
}
