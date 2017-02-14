package com.sorveteria.eradogelo.sorveteriaeradogelo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by rood on 04/01/17.
 */
public class EstAddProduto extends AppCompatActivity {

    private Button btAdd, btCanc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.est_add_produto);

        btAdd = (Button)findViewById(R.id.btAdd);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(this, "Produto Adicionado! Sucesso.", Toast.LENGTH_LONG).show();
            }
        });

        btCanc = (Button)findViewById(R.id.btCancel);
        btCanc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        /*
        public void onRadioButtonClicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.radio_pirates:
                    if (checked)
                        // Pirates are the best
                        break;
                case R.id.radio_ninjas:
                    if (checked)
                        // Ninjas rule
                        break;
            }
        }
        */

        // Adiciona o botão "up navigation"
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
