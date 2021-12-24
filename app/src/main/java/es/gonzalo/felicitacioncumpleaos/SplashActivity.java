package es.gonzalo.felicitacioncumpleaos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        //FUENTE
        Typeface fuenteCumple = Typeface.createFromAsset(getAssets(),"timetoparty.ttf");
        TextView txtSplash = (TextView) findViewById(R.id.titSplash);
        txtSplash.setTypeface(fuenteCumple);

        //ANIMACION
        Animation traslacion = AnimationUtils.loadAnimation(this,R.anim.text_splash_anim);
        txtSplash.startAnimation(traslacion);

        //CUANDO LA ANIMACION TERMINE, CAMBIO DE ACTIVIDAD
        traslacion.setAnimationListener(this);

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }
    ////////////////////////////////////////////////////////
    @Override
    public void onAnimationEnd(Animation animation) {
        //CREAMOS UN CAMINO PARA EL CAMBIO DE VISTA/ACTIVIDAD
        Intent camino = new Intent(SplashActivity.this,MainActivity.class);
        startActivity(camino); //ASIGNAMOS LA RUTA PARA EL CAMBIO DE VISTA/ACTIVIDAD
        finish(); //TERMINA EL SPLASH
    }
    ////////////////////////////////////////////////////////
    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}