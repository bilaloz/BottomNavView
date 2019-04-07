package gelecegiyazanlar.com.gyk401.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import gelecegiyazanlar.com.gyk401.R;
import gelecegiyazanlar.com.gyk401.models.ModelDiyet;

public class DetayActivity extends AppCompatActivity {

    TextView txtAdi,txtKalori;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);
        txtAdi = findViewById(R.id.aciklama);
        txtKalori = findViewById(R.id.kalori);
        image = findViewById(R.id.resim);

        if (getIntent().getExtras()!=null){
            txtAdi.setText(getIntent().getExtras().getString("adi"));
            txtKalori.setText(String.valueOf(getIntent().getExtras().getInt("kalori")));
            image.setImageResource(getIntent().getIntExtra("resim",0));
        }

    }

}
