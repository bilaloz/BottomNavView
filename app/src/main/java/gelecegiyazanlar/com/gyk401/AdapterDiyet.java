package gelecegiyazanlar.com.gyk401;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class AdapterDiyet extends BaseAdapter {
    LayoutInflater context;
    List<ModelDiyet>diyetList=new ArrayList<>();


    public AdapterDiyet(LayoutInflater context, List<ModelDiyet> diyetList) {
        this.context = context;
        this.diyetList = diyetList;
    }

    @Override
    public int getCount() {
        return diyetList.size();
    }

    @Override
    public Object getItem(int position) {
        return diyetList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = context.inflate(R.layout.item_row,parent,false);

        TextView aciklama = view.findViewById(R.id.diyetAciklama);
        TextView kalori = view.findViewById(R.id.diyetKalori);
        ImageView diyetResim = view.findViewById(R.id.diyetResim);


        aciklama.setText(diyetList.get(position).getDiyetAdi());
        kalori.setText(diyetList.get(position).getDiyetKalori());
        diyetResim.setImageResource(diyetList.get(position).getResimId());



        return view;
    }
}
