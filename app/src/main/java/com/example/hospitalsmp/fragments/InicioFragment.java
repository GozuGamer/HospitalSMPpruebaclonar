package com.example.hospitalsmp.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hospitalsmp.R;
import com.example.hospitalsmp.interfaces.IComunicaFragments;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InicioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InicioFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View vista;
    Activity actividad;
    CardView cardPaciente,cardEnfermero,cardFarmaceutico,cardMedico;
    IComunicaFragments interfaceComunicaFragments;

    public InicioFragment() {
        // Required empty public constructor
    }



    public static InicioFragment newInstance(String param1, String param2) {
        InicioFragment fragment = new InicioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

           vista = inflater.inflate(R.layout.fragment_inicio, container, false);

           cardPaciente = vista.findViewById(R.id.cardPaciente);
        cardMedico = vista.findViewById(R.id.cardMedico);
        cardEnfermero = vista.findViewById(R.id.cardEnfermero);
        cardFarmaceutico = vista.findViewById(R.id.cardFarmaceutico);

        EventosMenu();

        return vista;
    }

    private void EventosMenu() {

        cardPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interfaceComunicaFragments.iniciarPaciente();
            }
        });

        cardMedico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interfaceComunicaFragments.iniciarMedico();
            }
        });

        cardFarmaceutico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interfaceComunicaFragments.iniciarFarmaceutico();
            }
        });

        cardEnfermero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interfaceComunicaFragments.iniciarEnfermero();
            }
        });



    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof Activity) {
            this.actividad=(Activity) context;
            interfaceComunicaFragments= (IComunicaFragments) this.actividad;
        }
    }
}