package com.example.hospitalsmp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.content.Intent;
import android.os.Bundle;

import com.example.hospitalsmp.actividades.LoginEnfermeroActivity;
import com.example.hospitalsmp.actividades.LoginFarmaceuticoActivity;
import com.example.hospitalsmp.actividades.LoginMedicoActivity;
import com.example.hospitalsmp.actividades.LoginPacienteActivity;
import com.example.hospitalsmp.fragments.InicioFragment;
import com.example.hospitalsmp.interfaces.IComunicaFragments;

public class MainActivity extends AppCompatActivity implements IComunicaFragments {

    Fragment fragmentInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentInicio = new InicioFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments,fragmentInicio).commit();

    }


    @Override
    public void iniciarPaciente() {
        Intent Ipaciente = new Intent(this, LoginPacienteActivity.class);
        startActivity(Ipaciente);
    }

    @Override
    public void iniciarEnfermero() {
        Intent Ipaciente = new Intent(this, LoginEnfermeroActivity.class);
        startActivity(Ipaciente);

    }

    @Override
    public void iniciarMedico() {
        Intent Ipaciente = new Intent(this, LoginMedicoActivity.class);
        startActivity(Ipaciente);

    }

    @Override
    public void iniciarFarmaceutico() {
        Intent Ipaciente = new Intent(this, LoginFarmaceuticoActivity.class);
        startActivity(Ipaciente);

    }
}