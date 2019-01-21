package com.example.ashwanithakur.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.*;
import java.lang.String;

public class calculator extends AppCompatActivity {

    int count=0;
   String text="",s1,check="+";
   TextView text1,text2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bd,bb,bm,bmi,bdi,bp,be;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        be=findViewById(R.id.be);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bd=findViewById(R.id.bd);
        bdi=findViewById(R.id.bde);
        bb=findViewById(R.id.bb);
        bm=findViewById(R.id.b1m);
        bmi=findViewById(R.id.bmi);
        bp=findViewById(R.id.bp);

        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);



        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;

                if(text==null){

                    text1.setText("0");
                    text=text1.getText().toString();


                }
                else{
                    check="0";
                    text1.setText(text+"0");
                    text=text1.getText().toString();


                }

            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count=0;
                if(text==null){
                    check="1";
                    text1.setText("1");
                    text=text1.getText().toString();


                }
                else{

                    text1.setText(text+"1");
                    text=text1.getText().toString();


                }

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;

                if(text==null){

                    text1.setText("2");
                    text=text1.getText().toString();


                }
                else{
                    check="2";
                    text1.setText(text+"2");
                    text=text1.getText().toString();


                }
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;

                if(text==null){

                    text1.setText("3");
                    text=text1.getText().toString();


                }
                else{
                    check="3";
                    text1.setText(text+"3");
                    text=text1.getText().toString();


                }
            }
        });



        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;

                if(text==null){

                    text1.setText("4");
                    text=text1.getText().toString();


                }
                else{
                    check="4";
                    text1.setText(text+"4");
                    text=text1.getText().toString();


                }
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;


                if(text==null){

                    text1.setText("5");
                    text=text1.getText().toString();


                }
                else{
                    check="5";
                    text1.setText(text+"5");
                    text=text1.getText().toString();


                }
            }
        });



        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;

                if(text==null){

                    text1.setText("6");
                    text=text1.getText().toString();


                }
                else{
                    check="6";
                    text1.setText(text+"6");
                    text=text1.getText().toString();


                }

            }
        });





        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count=0;

                if(text==null){

                    text1.setText("7");
                    text=text1.getText().toString();


                }
                else{
                    check="7";
                    text1.setText(text+"7");
                    text=text1.getText().toString();


                }

            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;

                if(text==null){

                    text1.setText("8");
                    text=text1.getText().toString();


                }
                else{
                    check="8";
                    text1.setText(text+"8");
                    text=text1.getText().toString();


                }
            }
        });



        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;

                if(text==null){

                    text1.setText("9");
                    text=text1.getText().toString();


                }
                else{
                    check="9";
                    text1.setText(text+"9");
                    text=text1.getText().toString();


                }

            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;

                count=0;

                if(text.isEmpty()||((check.equals("*"))|| (check.equals("+"))||(check.equals("-"))||(check.equals("/"))||(check.equals(".")))){

                    //text1.setText(".");
                    text=text1.getText().toString();


                }
                else{
                    check=".";
                    text1.setText(text+".");
                    text=text1.getText().toString();


                }

            }
        });



        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;

                if(text.isEmpty()||((check.equals("*"))|| (check.equals("+"))||(check.equals("-"))||(check.equals("/"))||(check.equals(".")))){

                   // text1.setText("+");
                    text=text1.getText().toString();


                }
                else{
                    check="p";
                    text1.setText(text+"+");
                    text=text1.getText().toString();


                }

            }
        });


        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;

                if(text.isEmpty()||((check.equals("*"))|| (check.equals("+"))||(check.equals("-"))||(check.equals("/"))||(check.equals(".")))){

                  //  text1.setText("-");
                    text=text1.getText().toString();


                }
                else{
                    check="-";
                    text1.setText(text+"-");
                    text=text1.getText().toString();


                }

            }
        });




        bdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;

                if(text.isEmpty()||((check.equals("*"))|| (check.equals("+"))||(check.equals("-"))||(check.equals("/"))||(check.equals(".")))){

                   // text1.setText("/");
                    text=text1.getText().toString();


                }
                else{
                    check="/";
                    text1.setText(text+"/");
                    text=text1.getText().toString();


                }

            }
        });


        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;

                if(text.isEmpty()||((check.equals("*"))|| (check.equals("+"))||(check.equals("-"))||(check.equals("/"))||(check.equals(".")))){

                  //  text1.setText("*");
                    text=text1.getText().toString();


                }
                else{
                    check="*";
                    text1.setText(text+"*");
                    text=text1.getText().toString();


                }

            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(text==null||((check.equals("*"))|| (check.equals("+"))||(check.equals("-"))||(check.equals("/"))||(check.equals(".")))){


                    text=text1.getText().toString();
                    text1.setText(text);



                }
                else{

                     text=text1.getText().toString();
                      evaluate(text);

                }

            }
        });





        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(text==null||count==1){

                    text="";
                    text1.setText(text);
                    text2.setText(text);
                    text=text1.getText().toString();


                }
                else{


                    s1="";
                    for(int i=0;i<text.length()-1;i++){

                        s1=s1+text.charAt(i);

                    }
                    text=s1;

                    text1.setText(text);

                    text=text1.getText().toString();


                }

            }
        });


        bb.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                text="";
                text1.setText(text);
                text2.setText(text);
                text=text1.getText().toString();

                return true;
            }
        });







    }



    public void evaluate(String text){

        Stack<Integer> op  = new Stack<Integer>();
        Stack<Double> val = new Stack<Double>();
        Stack<Integer> optmp  = new Stack<Integer>();
        Stack<Double> valtmp = new Stack<Double>();

        text = "0" + text;
        text = text.replaceAll("-","+-");
        String temp = "";
        for (int i = 0;i < text.length();i++)
        {
            char ch = text.charAt(i);
            if (ch == '-')
                temp = "-" + temp;
            else if (ch != '+' &&  ch != '*' && ch != '/')
                temp = temp + ch;
            else
            {
                val.push(Double.parseDouble(temp));
                op.push((int)ch);
                temp = "";
            }
        }
        val.push(Double.parseDouble(temp));
        /* Create char array of operators as per precedence */
        /* -ve sign is already taken care of while storing */
        char operators[] = {'/','*','+'};
        /* Evaluation of expression */
        for (int i = 0; i < 3; i++)
        {
            boolean it = false;
            while (!op.isEmpty())
            {
                int optr = op.pop();
                double v1 = val.pop();
                double v2 = val.pop();
                if (optr == operators[i])
                {
                    /* if operator matches evaluate and store in temporary stack */
                    if (i == 0)
                    {
                        valtmp.push(v2 / v1);
                        it = true;
                        break;
                    }
                    else if (i == 1)
                    {
                        valtmp.push(v2 * v1);
                        it = true;
                        break;
                    }
                    else if (i == 2)
                    {
                        valtmp.push(v2 + v1);
                        it = true;
                        break;
                    }
                }
                else
                {
                    valtmp.push(v1);
                    val.push(v2);
                    optmp.push(optr);
                }
            }
            /* Push back all elements from temporary stacks to main stacks */
            while (!valtmp.isEmpty())
                val.push(valtmp.pop());
            while (!optmp.isEmpty())
                op.push(optmp.pop());
            /* Iterate again for same operator */
            if (it)
                i--;
        }


        Double result=val.pop();
         text=result.toString();

        text2.setText(text);
        text="";
        text1.setText(text);
         count=1;





    }





















}
