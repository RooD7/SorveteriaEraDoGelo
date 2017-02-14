package com.sorveteria.eradogelo.sorveteriaeradogelo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by rood on 06/01/17.
 */
public class EstDelProduto extends AppCompatActivity {

    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.est_del_produto);

        // Adiciona o botão "up navigation"
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
