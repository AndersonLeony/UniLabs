package br.unifor.dispmoveis.uniforlabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button blD = (Button) findViewById(R.id.btnBlocoD);
        blD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, new BlocoD_salasFragment())
                        .commit();
            }
        });
        final Button blM = (Button) findViewById(R.id.btnBlocoM);
        blM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, new BlocoM_salasFragment())
                        .commit();
            }
        });
    }
}
