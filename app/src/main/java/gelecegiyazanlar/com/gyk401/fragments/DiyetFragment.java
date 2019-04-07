package gelecegiyazanlar.com.gyk401.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import gelecegiyazanlar.com.gyk401.activities.DetayActivity;
import gelecegiyazanlar.com.gyk401.adapters.AdapterDiyet;
import gelecegiyazanlar.com.gyk401.models.ModelDiyet;
import gelecegiyazanlar.com.gyk401.R;

public class DiyetFragment extends Fragment {
    List<ModelDiyet> diyetListem = new ArrayList<>();
    ListView listView;
    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.diyet_fragment,container,false);

        listView = view.findViewById(R.id.listDiyet);

        diyetListem.add(new ModelDiyet("AburCubur",5000,R.drawable.ic_assignment_ind_black_24dp));
        diyetListem.add(new ModelDiyet("MAntı",5000,R.drawable.ic_assignment_ind_black_24dp));
        diyetListem.add(new ModelDiyet("Pİlav",5000,R.drawable.ic_assignment_ind_black_24dp));
        diyetListem.add(new ModelDiyet("KEbab",5000,R.drawable.ic_assignment_ind_black_24dp));
        diyetListem.add(new ModelDiyet("LAhmacun",5000,R.drawable.ic_assignment_ind_black_24dp));

        AdapterDiyet adapterDiyet = new AdapterDiyet(inflater,diyetListem);

        listView.setAdapter(adapterDiyet);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), ""+
                        diyetListem.get(position).getDiyetAdi()+"Tıkladınız", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), DetayActivity.class);
                i.putExtra("adi",diyetListem.get(position).getDiyetAdi());
                i.putExtra("resim",diyetListem.get(position).getResimId());
                i.putExtra("kalori",diyetListem.get(position).getDiyetKalori());
                startActivity(i);
            }
        });





        return view;
    }
}
