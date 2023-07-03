package com.example.project1301.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.project1301.Adapter.FoodListAdapter;
import com.example.project1301.Domain.FoodDomain;
import com.example.project1301.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterFoodList;
    private RecyclerView recyclerViewFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerview();
        bottomNavigation();
    }

    private void bottomNavigation() {
        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout cartBtn=findViewById(R.id.cartBtn);

        homeBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,MainActivity.class)));

        cartBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,CartActivity.class)));
    }

    private void initRecyclerview() {
        ArrayList<FoodDomain> items=new ArrayList<>();
        items.add(new FoodDomain("Cheese Burger","Desfrute de um CheeseBurger deliciose e suculento, \n" +
                "perfeito para satisfazer suas vontades de um sabor autêntico.\n" +
                " Nosso cheeseburger é preparado com um hamburger \n" +
                " suculento e grelhado no ponto perfeito,\n" +
                " wcoberto com uma generosa fatia de queijo cheddar derretido.\n" +
                " O Lanche perfeito para qualquer ocasião.","fast_1",25,30,120,4));
        items.add(new FoodDomain("Pizza Peperoni","A pizza de pepperoni é uma variedade ítalo-americana apimentada do salame seco, feita de carne de porco e bovina, incluindo algumas vezes toucinho. O processo de produção tem como tempero principal a páprica e etapas de fermentação e cozimento gradual do produto"
                ,"fast_2",14,25,200,5));
        items.add(new FoodDomain("Pizza Vegetariana","A pizza vegetariana é uma opção saudável e deliciosa para quem não come carne. Existem diversas receitas de pizza vegetariana, mas uma das mais comuns é a que leva tomate, cebola, pimentão e orégano. Outra opção é a pizza de brócolis com queijo e alho."
                ,"fast_3",22,30,100,4.5));
        items.add(new FoodDomain("Macarrão de Chapa","O macarrão de chapa é uma deliciosa especialidade culinária que consiste em macarrão cozido e grelhado em uma chapa quente. Geralmente feito com fios de macarrão longos, como espaguete ou talharim, ele é preparado em alta temperatura para criar uma crosta dourada e levemente crocante"
                ,"fast_4",19,40,140,4.3));
        items.add(new FoodDomain("X Dog Street","O cachorro-quente é um lanche clássico e popular em muitas culturas ao redor do mundo. Consiste em uma salsicha cozida e envolta em um pão macio. Além da salsicha, o cachorro-quente pode ser acompanhado por uma variedade de ingredientes, como molho de tomate, mostarda, ketchup, maionese, cebola picada, picles e queijo ralado."
                ,"fast_5",13,20,80,4.8));
        items.add(new FoodDomain("Coxinha de Frango","A coxinha de frango é um salgado tradicional da culinária brasileira. Com uma massa macia e crocante, ela é recheada com uma mistura suculenta de frango desfiado temperado com ervas e especiarias. Deliciosamente dourada, a coxinha de frango é uma opção irresistível para aqueles que desejam saborear um petisco saboroso e reconfortante."
                ,"fast_6",6,7,50,5));

        recyclerViewFood=findViewById(R.id.view1);
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterFoodList=new FoodListAdapter(items);
        recyclerViewFood.setAdapter(adapterFoodList);
    }
}