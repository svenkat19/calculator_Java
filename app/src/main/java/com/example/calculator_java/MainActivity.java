package com.example.calculator_java;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{


     TextView text;
     int operator;
     double num=0;
     double result=0;
     int decimalOn=0;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         Button button_1;
         Button button_2;
         Button button_3;
         Button button_4;
         Button button_5;
         Button button_6;
         Button button_7;
         Button button_8;
         Button button_9;
         Button button_0;
         Button button_plus;
         Button button_minus;
         Button button_multiply;
         Button button_divide;
         Button button_clear;
         Button button_equals;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        button_1=findViewById(R.id.button_1);
        button_2=findViewById(R.id.button_2);
        button_3=findViewById(R.id.button_3);
        button_4=findViewById(R.id.button_4);
        button_5=findViewById(R.id.button_5);
        button_6=findViewById(R.id.button_6);
        button_7=findViewById(R.id.button_7);
        button_8=findViewById(R.id.button_8);
        button_9=findViewById(R.id.button_9);
        button_0=findViewById(R.id.button_0);
        button_clear=findViewById(R.id.button_clear);
        button_plus=findViewById(R.id.button_plus);
        button_minus=findViewById(R.id.button_minus);
        button_divide=findViewById(R.id.button_divide);
        button_multiply=findViewById(R.id.button_multiply);
        button_equals=findViewById(R.id.button_equals);
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("0");
                result=0;
                num=0;
            }
        }) ;
        button_0.setOnClickListener(new View.OnClickListener() {
                                        @SuppressLint("SetTextI18n")
                                        @Override
                                        public void onClick(View v) {
                                            num = num * 10;
                                            num+=0;
                                            text.setText(text.getText()+String.valueOf(num));
                                        }
                                    });
        button_1.setOnClickListener((View v)->{


                    num=num*10;
                    num+=1;

            String s=String.valueOf(num);
            text.setText(s);
                }

        );
        button_2.setOnClickListener((View v)->{

                    num=num*10;
                    num+=2;
                    text.setText(String.valueOf(num));
                }
        );
        button_3.setOnClickListener((View v)->{

                    num=num*10;
                    num+=3;
                    text.setText(String.valueOf(num));
                }
        );
        button_4.setOnClickListener((View v)->{

                    num=num*10;
                    num+=4;
                    text.setText(String.valueOf(num));
                }
        );
        button_5.setOnClickListener((View v)->{

                    num=num*10;
                    num+=5;
                    text.setText(String.valueOf(num));
                }
        );
        button_6.setOnClickListener((View v)->{

                    num=num*10;
                    num+=6;
                    text.setText(String.valueOf(num));
                }
        );
        button_7.setOnClickListener((View v)->{

                    num=num*10;
                    num+=7;
                    text.setText(String.valueOf(num));
                }
        );
        button_8.setOnClickListener((View v)->{

                    num=num*10;
                    num+=8;
                    text.setText(String.valueOf(num));
                }
        );
        button_9.setOnClickListener((View v)->{

                    num=num*10;
                    num+=9;
                    text.setText(String.valueOf(num));
                }
        );
        button_plus.setOnClickListener((View v)->
        {
            result+=num;
            String a=String.valueOf(result);
            num=0;
            text.setText(a+"+");
            operator=1;
        });
        button_minus.setOnClickListener((View v)->
        {
            result+=num;
            String a=String.valueOf(result);
            num=0;
            text.setText(a+"-");
            operator=2;
        });
        button_multiply.setOnClickListener((View v)->
        {
            result+=num;
            String a=String.valueOf(result);
            num=0;
            text.setText(a+"*");
            operator=3;
        });
        button_divide.setOnClickListener((View v)->
        {
            result+=num;
            String a=String.valueOf(result);
            num=0;
            text.setText(a+"/");
            operator=4;
        });

        button_equals.setOnClickListener((View v)->
        {
            if(operator==1){
                    result+=num;
                    String x=String.valueOf(result);
                    num=0;
                    text.setText(x);
                    operator=0;}
            else if(operator==2){
                result-=num;
                String x=String.valueOf(result);
                num=0;
                text.setText(x);
                operator=0;
            }
            else if(operator==3)
            {
                result*=num;
                String x=String.valueOf(result);
                num=0;
                text.setText(x);
                operator=0;
            }
            else if(operator==4)
            {
                result/=num;
                String x=String.valueOf(result);
                num=0;
                text.setText(x);
                operator=0;
            }
        });
    }
}