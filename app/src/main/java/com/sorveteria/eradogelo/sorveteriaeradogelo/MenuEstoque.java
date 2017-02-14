package com.sorveteria.eradogelo.sorveteriaeradogelo;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by rood on 04/01/17.
 */
public class MenuEstoque extends AppCompatActivity {

    private Button btAddProduto, btVerEstoque, btReporEstoque, btBaixarEstoque, btDelProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_estoque);

        btAddProduto = (Button)findViewById(R.id.btAddProd);
        btAddProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), EstAddProduto.class);
                startActivity( i );
            }
        });

        btVerEstoque = (Button)findViewById(R.id.btVerEst);
        btVerEstoque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), EstVerEstoque.class);
                startActivity( i );
            }
        });

        btReporEstoque = (Button)findViewById(R.id.btReporEst);
        btReporEstoque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), EstReporEstoque.class);
                startActivity( i );
            }
        });

        btBaixarEstoque = (Button)findViewById(R.id.btBaixarEst);
        btBaixarEstoque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), EstBaixarEstoque.class);
                startActivity( i );
            }
        });

        btDelProduto = (Button)findViewById(R.id.btDelProd);
        btDelProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), EstDelProduto.class);
                startActivity( i );
            }
        });

        // Adiciona o botão "up navigation"
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
