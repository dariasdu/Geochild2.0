package com.tonikamitv.loginregister;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class Inicio extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //quitar baraa de notificaciones


        setContentView(R.layout.activity_main);


        //Vamos a declarar un nuevo thread
        Thread timer = new Thread(){
            //El nuevo Thread exige el metodo run
            public void run(){
                try{
                    sleep(5000);
                }catch(InterruptedException e){
                    //Si no puedo ejecutar el sleep muestro el error
                    e.printStackTrace();
                }finally{
                    //Llamo a la nueva actividad
                    //startActivity recibe por parametro un objeto del tipo Intent
                    //El Intent recibibe por parametro el NAME de la actividad que vamos a invocar
                    //Es el mismo que colocamos en el manifiesto
                    Intent actividaPrincipal = new Intent("ar.gerardoperrucci.pantalladeinicio.PRINCIPAL");
                    startActivity(actividaPrincipal);
                }
            }
        };
        //ejecuto el thread
        timer.start();
    }

}