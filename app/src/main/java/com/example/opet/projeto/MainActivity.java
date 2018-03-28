package com.example.opet.projeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;
import android.app.DatePickerDialog;
import android.graphics.Color;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        private EditText editNome;
        private final TextView textInicioInput;
        private final TextView textEntregaInput;
        private CheckBox checkFinalizadoInput;
        private TextView textNome;
        private TextView textInicio;
        private TextView textEntrega;
        private CheckBox checkFinalizado;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            editNome = findViewById(R.id.editNomeProjeto);
            textInicioInput = findViewById(R.id.textInicioProjetoInput);
            textEntregaInput = findViewById(R.id.textEntregaProjetoInput);
            checkFinalizadoInput = findViewById(R.id.checkFinalizadoInput);
            textNome = findViewById(R.id.textNomeProjeto);
            textInicio = findViewById(R.id.textInicioProjeto);
            textEntrega = findViewById(R.id.textEntregaProjeto);
            checkFinalizado = findViewById(R.id.checkProjetoFinalizado);


            final Calendar inicio = Calendar.getInstance();

            final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear,
                                      int dayOfMonth) {
                    inicio.set(Calendar.YEAR,year);
                    inicio.set(Calendar.MONTH,monthOfYear);
                    inicio.set(Calendar.DAY_OF_MONTH,dayOfMonth);

                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

                    textInicioInput.setText(format.format(inicio.getTime()));


                }
            };

            textInicioInput.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new DatePickerDialog(MainActivity.this,date,inicio
                            .get(Calendar.YEAR),inicio
                            .get(Calendar.MONTH),inicio
                            .get(Calendar.DAY_OF_MONTH)).show();
                }
            });
        }

    final Calendar entrega = Calendar.getInstance();

    final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            entrega.set(Calendar.YEAR,year);
            entrega.set(Calendar.MONTH,monthOfYear);
            entrega.set(Calendar.DAY_OF_MONTH,dayOfMonth);

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

            textEntregaInput.setText(format.format(entrega.getTime()));


        }
    };

        textEntregaInput.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            new DatePickerDialog(MainActivity.this,date,entrega
                    .get(Calendar.YEAR),entrega
                    .get(Calendar.MONTH),entrega
                    .get(Calendar.DAY_OF_MONTH)).show();
        }
    });
}}

    public void salvar(View v){
        Projeto projeto = new Projeto();

        String nomeProjeto = editNome.getText().toString();
        String vencimentoProduto = textVencimentoInput.getText().toString();
        String vencimentoProduto = textVencimentoInput.getText().toString();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            produto.setVencimento(format.parse(vencimentoProduto));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        produto.setNome(nomeProduto);

        Calendar vencimentoCalendar = Calendar.getInstance();
        vencimentoCalendar.setTime(produto.getVencimento());
        Calendar alerta = Calendar.getInstance();
        alerta.add(Calendar.DATE,10);

        if(alerta.after(vencimentoCalendar))
            textVencimento.setTextColor(Color.RED);
        else
            textVencimento.setTextColor(Color.GREEN);

        textVencimento.setText(vencimentoProduto);
        textNome.setText(nomeProduto);

        String data = editNome.getText().toString();
        if(checkNews.isChecked()){
            data += "\nAssinado!";
        }else
        {
            data += "\nNão Assinado!";
        }
}
