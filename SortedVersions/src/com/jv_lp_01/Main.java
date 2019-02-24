package com.jv_lp_01;

import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        initStockList();
        Basket ivanBasket = new Basket("Ivan",stockList);
        Basket igorBasket = new Basket("Igor",stockList);
        Basket janBasket = new Basket("Jan",stockList);
        igorBasket.addToBasket(stockList.get("cup"),207);
        ivanBasket.addToBasket(stockList.get("cup"),50);
        janBasket.addToBasket(stockList.get("cup"),50);
        System.out.println(stockList);
        System.out.println(igorBasket);
        System.out.println(ivanBasket);
        System.out.println(janBasket);
        igorBasket.removeFromBasket(stockList.get("cup"),107);
        ivanBasket.addToBasket(stockList.get("cup"),50);
        janBasket.addToBasket(stockList.get("cup"),50);
        System.out.println(stockList);
        System.out.println(igorBasket);
        System.out.println(ivanBasket);
        System.out.println(janBasket);
        igorBasket.checkout();
        System.out.println(stockList);

//        System.out.println(stockList.toString());
//
//
//        Basket ivanBasket = new Basket("Ivan");
//        sellItem(ivanBasket,"car",1);
//        System.out.println(ivanBasket);
//        sellItem(ivanBasket,"car",1);
//        System.out.println(ivanBasket);
//        if(sellItem(ivanBasket,"car",1) != 1){
//            System.out.println("There are no more cars");
//        };
//        System.out.println(ivanBasket);
//        sellItem(ivanBasket,"spanner",2);
//        System.out.println(ivanBasket);
//        sellItem(ivanBasket,"juice",4);
//        sellItem(ivanBasket,"cup",12);
//        sellItem(ivanBasket,"bread",1);
//        System.out.println(ivanBasket);
//        System.out.println(stockList);
//        for(String s : stockList.Items().keySet()){
//            System.out.println(s);
//        }

//        temp = new StockItem("pen",1.12);
//        //stockList.Items().put(temp.getName(),temp);
//        stockList.Items().get("car").adjustStock(2000);
//        stockList.get("car").adjustStock(-1000);
//
//        System.out.println(stockList);
//        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()){
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }
    }

    public static int sellItem(Basket basket,String item, int quantity){
        /* retrieve the item from the stock list */
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell: " + item);
            return 0;
        }
        if(stockList.sellStock(item,quantity) !=0){
            //basket.addToBasket(stockItem,quantity);
            return quantity;
        }

        return 0;
    }


    public static void initStockList(){

        StockItem temp = new StockItem("bread",0.86,100);
        stockList.addStock(temp);

        temp = new StockItem("cake",1.10,7);
        stockList.addStock(temp);

        temp = new StockItem("car",12.250,2);
        stockList.addStock(temp);

        temp = new StockItem("chair",62.0,10);
        stockList.addStock(temp);

        temp = new StockItem("cup",0.50,200);
        stockList.addStock(temp);

        temp = new StockItem("cup",0.45,7);
        stockList.addStock(temp);

        temp = new StockItem("door",74.95,4);
        stockList.addStock(temp);

        temp = new StockItem("juice",22.5,36);
        stockList.addStock(temp);

        temp = new StockItem("phone",96.99,35);
        stockList.addStock(temp);

        temp = new StockItem("towel",2.40,80);
        stockList.addStock(temp);

        temp = new StockItem("vase",8.99,40);
        stockList.addStock(temp);

    }
}
