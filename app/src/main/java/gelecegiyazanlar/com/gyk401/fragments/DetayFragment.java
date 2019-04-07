package gelecegiyazanlar.com.gyk401.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gelecegiyazanlar.com.gyk401.R;

public class DetayFragment extends Fragment {

    private static View view;

    public static View newInstance() {
        DetayFragment fragment = new DetayFragment();

        return view;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.detay,container,false);
        return view;
    }
}
