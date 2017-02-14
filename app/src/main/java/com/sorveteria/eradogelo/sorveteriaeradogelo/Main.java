package com.sorveteria.eradogelo.sorveteriaeradogelo;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Main extends AppCompatActivity {

    private Button btEstoque, btPedido, btFornecedor,btSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btEstoque = (Button)findViewById(R.id.btEstoque);
        btEstoque.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), MenuEstoque.class);
                startActivity( i );
            }
        });

        btPedido = (Button)findViewById(R.id.btPedido);
        btPedido.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), MenuPedido.class);
                startActivity( i );
            }
        });

        btFornecedor = (Button)findViewById(R.id.btFornecedor);
        btFornecedor.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), MenuFornecedor.class);
                startActivity( i );
            }
        });

        btSair = (Button)findViewById(R.id.btSair);
        btSair.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
