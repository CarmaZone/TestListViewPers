
package com.carmazone.testlistviewperz;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.carmazone.testlistviewperz.recetas.AdapterRecetas;
import com.carmazone.testlistviewperz.recetas.Receta;

public class MainActivity extends ActionBarActivity {

    private Receta rec;
    private List<Receta> listRecet;
    private ListView lv_lista_recetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Crear datos de ejemplo
        listRecet = new ArrayList<Receta>();

        rec = new Receta(getResources().getDrawable(R.drawable.ic_launcher),
                "Receta 1", "Pueblo 1", "Ingredientes receta 1");
        listRecet.add(rec);
        rec = new Receta(getResources().getDrawable(R.drawable.ic_launcher),
                "Receta 2", "Pueblo 2", "Ingredientes receta 2");
        listRecet.add(rec);
        rec = new Receta(getResources().getDrawable(R.drawable.ic_launcher),
                "Receta 3", "Pueblo 3", "Ingredientes receta 3");
        listRecet.add(rec);

        lv_lista_recetas = (ListView) findViewById(R.id.lv_recetas);

        AdapterRecetas adapter = new AdapterRecetas(this, listRecet);
        lv_lista_recetas.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
