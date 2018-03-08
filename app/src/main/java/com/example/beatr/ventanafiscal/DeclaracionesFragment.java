package com.example.beatr.ventanafiscal;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeclaracionesFragment extends Fragment {

    private TextView titulo;
    private TextView opinion;
    private TextView impuestos;
    private TextView link;
    private Button button;
    private Button button2;
    private Context thiscontext;
    private Context context;
    private TextView caso;

    public DeclaracionesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Getting application context
        thiscontext = getActivity().getApplicationContext();
        context=getActivity();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_declaraciones, container, false);
    }

    final SpannableStringBuilder declaraciones_titulo = new SpannableStringBuilder("" +
            " Guía de declaración de impuestos");

    final SpannableStringBuilder declaraciones_cumplimiento = new SpannableStringBuilder("\n" +
            "1. ¿Sabes que es la opinión de cumplimiento? " + "\n\n"+
            "Reporte emitido por el" +
            " SAT,  la opinión puede ser POSITIVA o NEGATIVA, si es NEGATIVA " +
            "el reporte te indicara qué declaraciones están pendientes de presentar.");

    final SpannableStringBuilder lin = new SpannableStringBuilder("" +
            "Si deseas obtener tu opinión de cumplimiento, necesitas tu RFC con homoclave" +
            "y contraseña e ingresar al sitio \n https://www.siat.sat.gob.mx/PTSC/index.jsp?opcion=9");

    final SpannableStringBuilder cas = new SpannableStringBuilder("" +
            "RIF (régimen de incorporación fiscal) \n " +
            "- Los requisitos para estar en esta opción son:\n" +
            "- Debes ser persona física.\n" +
            "- Tus ingresos no pueden ser más de 2,000,000.00 al año.\n" +
            "- No debes ser socio o accionista de alguna persona moral.\n" +
            "- No debes estar o haber estado en Actividades empresariales o profesionales.\n" +
            "- No debes requerir título profesional para desempeñar tu trabajo.\n" +
            "- Tus declaraciones las presentas Bimestralmente\n" +
            "- El Comprobante fiscal por tus ventas lo debes elaborar tu.");

    final SpannableStringBuilder cas2 = new SpannableStringBuilder("" +
            "Arrendamiento  \n " +
            "- Tus ingresos los obtienes por la renta de un bien inmueble.\n" +
            "- Tus declaraciones las presentas mensualmente\n" +
            "- El Comprobante fiscal por tus ventas lo debes elaborar tu.");

    final SpannableStringBuilder cas3 = new SpannableStringBuilder("" +
            "Salarios \n " +
            "- Tus ingresos los obtienes por trabajar en forma subordinada  para alguna empresa o persona física,  \n" +
            "- Estar dado de alta en el Instituto Mexicano del Seguro Social o ISSSTE\n" +
            "- El comprobante fiscal  lo tiene que elaborar la empresa.\n" +
            "- No estás obligado a presentar declaración  mensual por este régimen.\n");

    final SpannableStringBuilder cas4 = new SpannableStringBuilder("" +
            "Asimilados a salarios  \n " +
            "- Tus ingresos los obtuviste previamente bajo el régimen de actividades empresariales y profesionales una empresa, no fueron en forma subordinada, representaron más del 50%  durante el primer dentro de la empresa, y que hayas presentado un escrito a esta empresa para solicitar el pago así de impuestos. \n" +
            "- No cobras IVA, ni te retienen IVA, solo te retienen Impuesto sobre la Renta\n" +
            "- El comprobante fiscal  lo tiene que elaborar la empresa\n" +
            "- No estás obligado a presentar declaración  mensual por este régimen.\n");

    final SpannableStringBuilder cas5 = new SpannableStringBuilder("" +
            "Actividades empresariales y profesionales  \n " +
            "- El comprobante fiscal  lo tienes que elaborar tu.\n" +
            "- Debes cobrar IVA, la empresa te retiene IVA y Te retiene Impuesto sobre la renta.\n" +
            "- Estás obligado a presentar declaración  mensual por este régimen.\n");

    final SpannableStringBuilder declaraciones_impuestos = new SpannableStringBuilder("\n" +
            "2. Si deseas saber qué formas existen para pagar tus impuestos, escoge una opción. \n  Soy:");


    final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD);

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {


        caso=(TextView) view.findViewById(R.id.caso);

        button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {


            public void onClick(final View view){
                PopupMenu popupMenu = new PopupMenu(context, button);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getTitle().toString()){
                            case "RIF":
                                cas.setSpan(bss, 0, 37, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
                                caso.setText(cas);
                                break;
                            case "Arrendamiento":
                                cas2.setSpan(bss,0,14, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
                                caso.setText(cas2);
                                break;
                            case "Salarios":
                                cas3.setSpan(bss,0,8, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
                                caso.setText(cas3);
                                break;
                            case "Asimilados a salarios":
                                cas4.setSpan(bss,0,21,Spannable.SPAN_INCLUSIVE_INCLUSIVE);
                                caso.setText(cas4);
                                break;
                            case "Actividades empresariales y profesionales":
                                cas5.setSpan(bss,0,41,Spannable.SPAN_INCLUSIVE_INCLUSIVE);
                                caso.setText(cas5);
                                break;
                            case "Selecciona una opción...":
                                caso.setText("Selecciona una opción");
                                break;
                        }
                        return true;
                    }
                });

                popupMenu.show();
            }

        });

        button2 = (Button) view.findViewById(R.id.button2);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view){

                PopupMenu popupMenu = new PopupMenu(context, button2);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu2, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        Toast.makeText(context, "" + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });

                popupMenu.show();
            }
        });

        titulo=(TextView) view.findViewById(R.id.titulo);
        declaraciones_titulo.setSpan(bss, 0, 33, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        declaraciones_titulo.setSpan(new RelativeSizeSpan(2f), 0,33, 0);
        titulo.setText(declaraciones_titulo);

        opinion=(TextView) view.findViewById(R.id.opinion);
        declaraciones_cumplimiento.setSpan(bss, 0,45, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        opinion.setText(declaraciones_cumplimiento);

        impuestos=(TextView) view.findViewById(R.id.impuestos);
        impuestos.setText(declaraciones_impuestos);

        link=(TextView)view.findViewById(R.id.link);
        link.setText(lin);
    }

}
