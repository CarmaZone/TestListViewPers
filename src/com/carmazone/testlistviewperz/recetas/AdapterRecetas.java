
package com.carmazone.testlistviewperz.recetas;

import java.util.List;

import com.carmazone.testlistviewperz.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterRecetas extends BaseAdapter {

    protected Activity activity;
    protected List<Receta> recetas;

    public AdapterRecetas(Activity activity, List<Receta> recetas) {
        super();
        this.activity = activity;
        this.recetas = recetas;
    }

    @Override
    public int getCount() {
        return recetas.size();
    }

    @Override
    public Object getItem(int position) {
        return recetas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.itemlista, null);

        }

        Receta rec = recetas.get(position);

        ImageView iv_receta = (ImageView) v.findViewById(R.id.iv_foto_receta);
        iv_receta.setImageDrawable(rec.getFoto());

        TextView tv_nombre_receta = (TextView) v
                .findViewById(R.id.tv_nombre_receta);
        tv_nombre_receta.setText(rec.getNombre());

        TextView tv_pueblo = (TextView) v.findViewById(R.id.tv_pueblo_receta);
        tv_pueblo.setText(rec.getPueblo());

        return v;
    }

}
