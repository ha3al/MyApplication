package com.example.ha3alkaya.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnNokta,btnEsit,btnTopla,btnFark,
        btnCarp,btnBol,btnSil,btnKok,btnMod,btnTemizle;

    EditText edtislem,edtSonuc;

    double gecicideger = 0 ;
    double sonuc=0;

    String islem,newText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);

        btnNokta = (Button) findViewById(R.id.btnNokta);
        btnEsit = (Button) findViewById(R.id.btnEsit);
        btnFark = (Button) findViewById(R.id.btnFark);
        btnCarp = (Button) findViewById(R.id.btnCarp);
        btnBol = (Button) findViewById(R.id.btnBol);
        btnSil = (Button) findViewById(R.id.btnSil);
        btnKok = (Button) findViewById(R.id.btnKok);
        btnMod = (Button) findViewById(R.id.btnMod);
        btnTemizle = (Button) findViewById(R.id.btnTemizle);
        btnTopla = (Button) findViewById(R.id.btnTopla);

        edtislem = (EditText) findViewById(R.id.edtislem);
        edtSonuc = (EditText) findViewById(R.id.edtSonuc);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);

        btnNokta.setOnClickListener(this);
        btnEsit.setOnClickListener(this);
        btnFark.setOnClickListener(this);
        btnBol.setOnClickListener(this);
        btnCarp.setOnClickListener(this);
        btnTopla.setOnClickListener(this);
        btnTemizle.setOnClickListener(this);
        btnKok.setOnClickListener(this);
        btnSil.setOnClickListener(this);
        btnMod.setOnClickListener(this);
    }

        public void onClick(View bak) {
            int boyut = edtislem.getText().length();
            int _id = bak.getId();

            try {
                if (boyut < 11) {
                    if (_id == R.id.btn0)
                        edtislem.setText(edtislem.getText() + "0");
                    if (_id == R.id.btn1)
                        edtislem.setText(edtislem.getText() + "1");
                    if (_id == R.id.btn2)
                        edtislem.setText(edtislem.getText() + "2");
                    if (_id == R.id.btn3)
                        edtislem.setText(edtislem.getText() + "3");
                    if (_id == R.id.btn4)
                        edtislem.setText(edtislem.getText() + "4");
                    if (_id == R.id.btn5)
                        edtislem.setText(edtislem.getText() + "5");
                    if (_id == R.id.btn6)
                        edtislem.setText(edtislem.getText() + "6");
                    if (_id == R.id.btn7)
                        edtislem.setText(edtislem.getText() + "7");
                    if (_id == R.id.btn8)
                        edtislem.setText(edtislem.getText() + "8");
                    if (_id == R.id.btn9)
                        edtislem.setText(edtislem.getText() + "9");

                    if (_id == R.id.btnTopla) {

                        gecicideger = Double.parseDouble(edtislem.getText().toString());

                        edtSonuc.setText(edtislem.getText().toString()+"+");
                        edtislem.setText("");

                        islem = "+";

                    }

                    if (_id == R.id.btnFark) {

                        if(edtislem.getText().toString().equals("")) {
                            newText = (String) edtislem.getText().toString() + "-";
                            edtislem.setText(newText);
                        }
                        else {

                            gecicideger = Double.parseDouble(edtislem.getText().toString());

                            edtSonuc.setText(edtislem.getText().toString() + "-");
                            edtislem.setText("");

                            islem = "-";
                        }

                    }

                    if (_id == R.id.btnCarp) {

                        gecicideger = Double.parseDouble(edtislem.getText().toString());

                        edtSonuc.setText(edtislem.getText().toString()+"x");
                        edtislem.setText("");

                        islem = "x";

                    }

                    if (_id == R.id.btnBol) {

                        gecicideger = Double.parseDouble(edtislem.getText().toString());

                        edtSonuc.setText(edtislem.getText().toString()+"/");
                        edtislem.setText("");

                        islem = "/";

                    }

                    if (_id == R.id.btnKok) {
                        gecicideger = Double.parseDouble(edtislem.getText().toString());

                        edtSonuc.setText("√"+edtislem.getText().toString());
                        edtislem.setText("");

                        islem = "√";

                        if(gecicideger>0) {

                            sonuc = Math.sqrt(gecicideger);

                            sonuc = Double.parseDouble(new DecimalFormat("##.##").format(sonuc));
                            edtSonuc.setText(edtSonuc.getText().toString() + edtislem.getText().toString() + "= " + Double.toString(sonuc));
                            edtislem.setText(Double.toString(sonuc));
                        }

                        else
                            edtSonuc.setText("Reel sayılarda çalışıyoruz!");


                    }

                    if (_id == R.id.btnMod) {
                        gecicideger = Double.parseDouble(edtislem.getText().toString());

                        edtSonuc.setText(edtislem.getText().toString()+"%");
                        edtislem.setText("");

                        islem = "%";


                    }

                    if (_id == R.id.btnNokta) {
                        if(!edtislem.getText().toString().contains(".")) {
                            newText = (String) edtislem.getText().toString() + ".";

                            edtislem.setText(newText);
                        }
                    }

                    if (_id == R.id.btnEsit) {

                        if(islem.equals("/")) {

                            double num = Double.parseDouble(edtislem.getText().toString());
                            if(num != 0) {

                                sonuc = gecicideger / num;
                                sonuc = Double.parseDouble(new DecimalFormat("##.##").format(sonuc));

                                edtSonuc.setText(edtSonuc.getText().toString()+edtislem.getText().toString()+"= "+Double.toString(sonuc));
                                edtislem.setText(Double.toString(sonuc));

                            }

                            else {
                                edtSonuc.setText("0'a bölüm yapılamaz!");
                                edtislem.setText("");
                            }

                        }

                        else if (islem.equals("%")) {

                            double num = Double.parseDouble(edtislem.getText().toString());
                            if(num != 0) {
                                sonuc = gecicideger % num;

                                sonuc = Double.parseDouble(new DecimalFormat("##.##").format(sonuc));

                                edtSonuc.setText(edtSonuc.getText().toString() + edtislem.getText().toString() + "= " + Double.toString(sonuc));
                                edtislem.setText(Double.toString(sonuc));
                            }

                            else {
                                edtSonuc.setText("0'a göre mod alınamaz!");
                                edtislem.setText("");
                            }

                        }

                        else {
                            if (islem.equals("+")) {

                                sonuc = gecicideger + Double.parseDouble(edtislem.getText().toString());

                            }

                            if (islem.equals("-")) {

                                sonuc = gecicideger - Double.parseDouble(edtislem.getText().toString());


                            }

                            if (islem.equals("x")) {

                                sonuc = gecicideger * Double.parseDouble(edtislem.getText().toString());


                            }

                            sonuc = Double.parseDouble(new DecimalFormat("##.##").format(sonuc));
                            edtSonuc.setText(edtSonuc.getText().toString() + edtislem.getText().toString() + "= " + Double.toString(sonuc));
                            edtislem.setText(Double.toString(sonuc));
                        }

                    }

                    if (_id == R.id.btnSil) {
                        newText = (String) edtislem.getText().toString();

                        if (newText.length() > 0) {
                            String Text = newText.substring(0, newText.length() - 1);
                            edtislem.setText(Text);
                        }

                    }

                    if (_id == R.id.btnTemizle) {
                        gecicideger = 0;
                        edtislem.setText("");
                        edtSonuc.setText("");

                    }

                }
                else {
                    edtislem.setText("Maksimum 10 basamaklı sayı girilebilir!!");
                    edtSonuc.setText(" :/ ");
                }
            }
            catch (Exception e)
            {

            }
        }

    }

