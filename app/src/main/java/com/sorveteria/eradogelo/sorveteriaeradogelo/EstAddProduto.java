package com.sorveteria.eradogelo.sorveteriaeradogelo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by rood on 04/01/17.
 */
public class EstAddProduto extends AppCompatActivity {

    private static final String TAG = "AddProduto";
    private Button btAdd, btCanc;
    private String[] stringCateg = new String[] { "Embalagem", "Pó sabor", "Polpa de frutas",
        "Outros"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.est_add_produto);

        btAdd = (Button)findViewById(R.id.btAdd);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // AlertDialog para adicionar produto
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                // builder.setIcon(); -- para adicionar um icone
                builder.setTitle(R.string.alerDialTitleAddProd);
                builder.setMessage(R.string.alerDialMsgAddProd);
                builder.setPositiveButton(R.string.alerDialConfSim, new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int which) {
                       Toast.makeText(getBaseContext(), R.string.toastAddProd, Toast.LENGTH_LONG).show();
                       return;
                   }
                });
                builder.setNegativeButton(R.string.alerDialConfNao, new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int nao) {
                       Toast.makeText(getBaseContext(), R.string.toastCancel, Toast.LENGTH_LONG).show();
                       return;
                   }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        btCanc = (Button)findViewById(R.id.btCancel);
        btCanc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //  Radio Group
        final RadioGroup radioMedida = (RadioGroup)findViewById(R.id.radio_Medida);
        radioMedida.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioMedida, int checkedId) {
                boolean grama = R.id.radio_MedidaG == checkedId;
                boolean kiloG = R.id.radio_MedidaKg == checkedId;
                if (grama) {
                    Log.i(TAG,"Marcou radio GRAMAS: " + checkedId);
                } else if (kiloG) {
                    Log.i(TAG,"Marcou radio KG: " + checkedId);
                }
            }
        });

        //Spinner Categoria
        final Spinner spinCategoria = (Spinner) findViewById(R.id.spCategProd);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, stringCateg);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinCategoria.setAdapter(adapter);

        // Adiciona o botão "up navigation"
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
