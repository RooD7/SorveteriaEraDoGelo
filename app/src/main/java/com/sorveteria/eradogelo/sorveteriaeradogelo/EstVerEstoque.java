package com.sorveteria.eradogelo.sorveteriaeradogelo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by rood on 06/01/17.
 */
public class EstVerEstoque extends AppCompatActivity implements AdapterView.OnItemClickListener {

    protected static final String TAG = "livro";
    private ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.est_ver_estoque);

        ActionBar actionBar = getSupportActionBar();

        // Adiciona o botão "up navigation"
        actionBar.setDisplayHomeAsUpEnabled(true);

        // ListView
        listView = (ListView) findViewById(R.id.listViewEstoque);
        listView.setAdapter(new SimplesAdapter(this));
        listView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Infla o menu com os botoes da action bar
        getMenuInflater().inflate(R.menu.menu_ver_estoque, menu);

        //SearchView
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(onSearch());

        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    private SearchView.OnQueryTextListener onSearch() {
        return new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //Usuario fez a busca
                toast("Buscar o texto: "+ query);
                return false;
            }
            @Override
            public boolean onQueryTextChange(String nextText) {
                //Mudou o texto digitado
                return false;
            }
        };
    }

    /*
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();
            if(id == android.R.id.home) {
                //O metodo finish() vai encerrar essa activity
                finish();
                return true;
            } else if (id == R.id.action_search) {
                toast("Clicou no Search!");
                return true;
            } else if (id == R.id.action_refresh) {
                toast("Clicou no Refresh!");
                return true;
            } else if (id == R.id.action_settings) {
                toast("Clicou no Settings!");
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
    */

    //ListView
    public void onItemClick(AdapterView<?> parent, View view, int idx, long id) {
        String s = (String) parent.getAdapter().getItem(idx); // Objeto selecionado, que neste caso era de um array de strings
        Toast.makeText(this, "Texto selecionado: " + s + ", posição: " + idx, Toast.LENGTH_SHORT).show();
    }

    private void toast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
