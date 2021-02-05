package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button one,two,three,four,five,six,seven,eight,nine,zero,equal,clear,plus,sub,div,prod,back,dot;
    private TextView answer,text;
    private String s="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dot=(Button) findViewById(R.id.dot);
        one=(Button) findViewById(R.id.one);
        two=(Button) findViewById(R.id.two);
        three=(Button) findViewById(R.id.three);
        four=(Button) findViewById(R.id.four);
        five=(Button) findViewById(R.id.five);
        six=(Button) findViewById(R.id.six);
        seven=(Button) findViewById(R.id.seven);
        eight=(Button) findViewById(R.id.eight);
        nine=(Button) findViewById(R.id.nine);
        zero=(Button) findViewById(R.id.zero);
        plus=(Button) findViewById(R.id.plus);
        sub=(Button) findViewById(R.id.sub);
        div=(Button) findViewById(R.id.div);
        prod=(Button) findViewById(R.id.prod);
        clear=(Button) findViewById(R.id.clear);
        equal=(Button) findViewById(R.id.equal);
        answer=(TextView) findViewById(R.id.answer);
        text=(TextView) findViewById(R.id.text);
        back=(Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.length()==0){

                }
                else{
                    s=s.substring(0,s.length()-1);
                    text.setText(s);
                    answer.setText("");
                }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"1";
                text.setText(s);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"2";
                text.setText(s);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"3";
                text.setText(s);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"4";
                text.setText(s);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"5";
                text.setText(s);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"6";
                text.setText(s);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"7";
                text.setText(s);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"8";
                text.setText(s);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"9";
                text.setText(s);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"0";
                text.setText(s);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="";
                text.setText(s);
                answer.setText("");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"+";
                text.setText(s);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+".";
                text.setText(s);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"-";
                text.setText(s);
            }
        });
        prod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"X";
                text.setText(s);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+"/";
                text.setText(s);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x=0;
                if(s.length()==0||s.charAt(0)=='X'||s.charAt(0)=='+'||s.charAt(0)=='-'||s.charAt(0)=='/'||
                        s.charAt(s.length()-1)=='+'||s.charAt(s.length()-1)=='-'||s.charAt(s.length()-1)=='X'||s.charAt(s.length()-1)=='/'){
                    answer.setText("Error");
                }
                else{
                    int y=0,i;
                    double z=0;
                    String r="";
                    String w="";
                    String c="";
                    for( i=0;i<s.length();i++){
                        if(s.charAt(i)=='X'||s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='/'){
                            c=c+s.charAt(i);
                            break;
                        }
                        else{
                            r=r+s.charAt(i);
                        }
                    }
                    i++;
                    for(;i<s.length();i++){
                        if(s.charAt(i)=='X'||s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='/'){
                            if(w.length()==0){
                                y=1;
                                break;
                            }
                            if(c.equals("X")){
                                z=(Double.valueOf(r))*(Double.valueOf(w));
                            }
                            else if(c.equals("-")){
                                z=(Double.valueOf(r))-(Double.valueOf(w));
                            }
                            else if(c.equals("/")){
                                z=(Double.valueOf(r))/(Double.valueOf(w));
                            }
                            else{
                                z=(Double.valueOf(r))+(Double.valueOf(w));
                            }
                            c="";
                            c=c+s.charAt(i);
                            r=String.valueOf(z);
                            w="";
                        }
                        else{
                            w=w+s.charAt(i);
                        }
                    }
                    if(y==1){
                        answer.setText("Error");
                    }
                    else {
                        if(c.equals("X")){
                     //       Toast.makeText(MainActivity.this, Integer.valueOf(r)+".."+Integer.valueOf(w)+"..*", Toast.LENGTH_SHORT).show();
                            z=((Double.valueOf(r))*(Double.valueOf(w)));
                        }
                        else if(c.equals("-")){
                            z=(Double.valueOf(r))-(Double.valueOf(w));
                        }
                        else if(c.equals("/")){
                            z=(Double.valueOf(r))/(Double.valueOf(w));
                        }
                        else{
                            z=(Double.valueOf(r))+(Double.valueOf(w));
                        }
                        answer.setText(String.format("%.3f", z)+"");
                    }

                }
            }
        });
    }
}