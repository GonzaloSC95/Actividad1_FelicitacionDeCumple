package es.gonzalo.felicitacioncumpleaos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ASIGNAR FUENTE A UN TEXTVIEW
        Typeface miFuente = Typeface.createFromAsset(getAssets(),"Beauty and the Beast Sample.ttf");
        TextView titulo = (TextView) findViewById(R.id.titulo_felicidades);
        titulo.setTypeface(miFuente);

        //ASIGNAR ANIMACION DE ROTACION A UN TEXTVIEW
        Animation animacionR= AnimationUtils.loadAnimation(this,R.anim.rotacion);
        titulo.startAnimation(animacionR);

        //ASIGNAR ANIMACION DE ESCALA A UN TEXTVIEW
        TextView nombre = (TextView) findViewById(R.id.nombre);
        Animation animacionS= AnimationUtils.loadAnimation(this,R.anim.escala);
        nombre.startAnimation(animacionS);

        //ASIGNAR ANIMACION DE TRASLACION A UN TEXTVIEW
        TextView deParte = (TextView) findViewById(R.id.deParte);
        Animation animacionT= AnimationUtils.loadAnimation(this,R.anim.traslacion);
        deParte.startAnimation(animacionT);

        //ASIGNAR ANIMACION DE TRASPARENCIA A UNA IMAGEVIEW
        ImageView img = (ImageView) findViewById(R.id.imgCumple);
        Animation animacionTS= AnimationUtils.loadAnimation(this,R.anim.trasnparencia);
        img.startAnimation(animacionTS);

        //CREAR REPRODUCTOR DE SONIDO
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.happy_birthday);
        mediaPlayer.start();
    }
}