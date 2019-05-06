package com.supermarketbilling.invoice;

import com.supermarketbilling.models.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvoiceMaker {

    static Map<String,Item> items;

    public static void initData(){

        items=new HashMap<>();

                                Category produce=new Category();
                                produce.setName("produce");

        Category fruits=new Category();
        fruits.setName("Fruits");
        fruits.setParentCategory(produce);

                                                    Category veg=new Category();
                                                    produce.setName("Veg");
                                                    fruits.setParentCategory(produce);

        Item apple=new Item();
        apple.setName("Apple");
        apple.setParentCategory(fruits);
        apple.setPrice(BigDecimal.valueOf(50l));
        apple.setUom(UOM.KILO);

        Item orange=new Item();
        orange.setName("Orange");
        orange.setParentCategory(fruits);
        orange.setPrice(BigDecimal.valueOf(80l));
        orange.setUom(UOM.KILO);


                                                        Item potato=new Item();
                                                        potato.setName("Potato");
                                                        potato.setParentCategory(veg);
                                                        potato.setPrice(BigDecimal.valueOf(30l));
                                                        potato.setUom(UOM.KILO);

                                                        Item tomato=new Item();
                                                        tomato.setName("Tomato");
                                                        tomato.setParentCategory(veg);
                                                        tomato.setPrice(BigDecimal.valueOf(70l));
                                                        tomato.setUom(UOM.KILO);

                            Category dairy=new Category();
                            dairy.setName("Dairy");


        Category milk=new Category();
        milk.setName("Milk");
        milk.setParentCategory(dairy);

                                                        Category cheese=new Category();
                                                        cheese.setName("Cheese");
                                                        cheese.setParentCategory(dairy);


        Item cowMilk=new Item();
        cowMilk.setName("Cow Milk");
        cowMilk.setParentCategory(milk);
        cowMilk.setPrice(BigDecimal.valueOf(50l));
        cowMilk.setUom(UOM.LITRE);

        Item soyMilk=new Item();
        soyMilk.setName("Soy Milk");
        soyMilk.setParentCategory(milk);
        soyMilk.setPrice(BigDecimal.valueOf(40l));
        soyMilk.setUom(UOM.LITRE);


                                                            Item cheddar=new Item();
                                                            cheddar.setName("Cheddar");
                                                            cheddar.setParentCategory(cheese);
                                                            cheddar.setPrice(BigDecimal.valueOf(50l));
                                                            cheddar.setUom(UOM.KILO);

                                                            Item gouda=new Item();
                                                            gouda.setName("Gouda");
                                                            gouda.setParentCategory(cheese);
                                                            gouda.setPrice(BigDecimal.valueOf(80l));
                                                            gouda.setUom(UOM.KILO);


        items.put("apple",apple);
        items.put("orange",orange);
        items.put("potato",potato);
        items.put("tomato",tomato);
        items.put("cowmilk",cowMilk);
        items.put("soymilk",soyMilk);
        items.put("cheddar",cheddar);
        items.put("gouda",gouda);



    }

    public static void main(String... args){
        initData();

        IndividualItemInvoice appleInvoice=new IndividualItemInvoice(items.get("apple"),BigDecimal.valueOf(2));
        IndividualItemInvoice orangeInvoice=new IndividualItemInvoice(items.get("orange"),BigDecimal.valueOf(2));
        List<IndividualItemInvoice> individualItemInvoices=new ArrayList<>();
        individualItemInvoices.add(appleInvoice);
        individualItemInvoices.add(orangeInvoice);
        Invoice invoice=new Invoice(individualItemInvoices,"Ankesh");
        System.out.println(invoice.getTotalAmount());

    }
}
