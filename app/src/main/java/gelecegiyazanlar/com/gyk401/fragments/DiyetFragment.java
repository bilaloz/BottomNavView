package gelecegiyazanlar.com.gyk401.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import gelecegiyazanlar.com.gyk401.AdapterDiyet;
import gelecegiyazanlar.com.gyk401.ModelDiyet;
import gelecegiyazanlar.com.gyk401.R;

public class DiyetFragment extends Fragment {
    List<ModelDiyet> diyetListem = new ArrayList<>();
    ListView listView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.diyet_fragment,container,false);

        listView = view.findViewById(R.id.listDiyet);

        diyetListem.add(new ModelDiyet("AburCubur",5000,R.drawable.ic_assignment_ind_black_24dp));
        diyetListem.add(new ModelDiyet("AburCubur",5000,R.drawable.ic_assignment_ind_black_24dp));
        diyetListem.add(new ModelDiyet("AburCubur",5000,R.drawable.ic_assignment_ind_black_24dp));
        diyetListem.add(new ModelDiyet("AburCubur",5000,R.drawable.ic_assignment_ind_black_24dp));
        diyetListem.add(new ModelDiyet("AburCubur",5000,R.drawable.ic_assignment_ind_black_24dp));

        AdapterDiyet adapterDiyet = new AdapterDiyet(inflater,diyetListem);

        listView.setAdapter(adapterDiyet);





        return view;
    }
}
