package com.example.ejercicioclase26_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvEtiquetaSuperior, tvEtiquetaInferior;
    ImageView ivImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvEtiquetaSuperior = (TextView)findViewById(R.id.tvSuperior);
        tvEtiquetaInferior = (TextView)findViewById(R.id.tvInferior);
        /*
        ivImagen = (ImageView)findViewById(R.id.ImageviewCheck);

        //Evento click para la imagen
        ivImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEtiquetaInferior.setText("Has pulsado el botón");

            }
        });
*/
        //Editar en un TextView
        tvEtiquetaSuperior.setText("Hola Mundo");
        String textoRecogido = tvEtiquetaSuperior.getText().toString();

        tvEtiquetaInferior.setText(textoRecogido);


    }//FIN OnCreate

    public void escribirTexView(View view){
        tvEtiquetaInferior.setText("Has pulsado el botón");
    }



}//Fin MainActivity
