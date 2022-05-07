package com.example.oneto999;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clk(View view)
    {
        int n,m=0,k=0;
        String S="";
        EditText ed=findViewById(R.id.txt);
        n=Integer.parseInt(ed.getText().toString());
        TextView tx=findViewById(R.id.Res);

        if(n<101) {
            m=n%10;
            k=n/10;



            if(k==2)
            {
                S="Twenty";
            }
            else if(k==3)
            {
                S="Thirty";
            }
            else if(k==4)
            {
                S="Fourty";
            }
            else if(k==5)
            {
                S="Fifty";
            }
            else if(k==6)
            {
                S="Sixty";
            }
            else if(k==7)
            {
                S="Seventy";
            }
            else if(k==8)
            {
                S="Eighty";
            }
            else if(k==9)
            {
                S="Ninty";
            }
            while(n>0) {
                if(n==10) {
                    tx.setText("Ten");
                    break;
                }
                else if(n==11) {
                    tx.setText("Eleven");
                    break;
                }
                else if(n==12) {
                    tx.setText("Twelve");
                    break;
                }
                else if(n==13) {
                    tx.setText("Thirteen");
                    break;
                }
                else if(n==14) {
                    tx.setText("Fourteen");
                    break;
                }
                else if(n==15) {
                    tx.setText("Fifteen");
                    break;
                }
                else if(n==16) {
                    tx.setText("Sixteen");
                    break;
                }
                else if(n==17) {
                    tx.setText("Seventeen");
                    break;
                }
                else if(n==18) {
                    tx.setText("Eighteen");
                    break;
                }
                else if(n==19) {
                    tx.setText("Ninteen");
                    break;
                }
                else if(n==20) {
                    tx.setText("Twenty");
                    break;
                }
                else if(n==30) {
                    tx.setText("Thirty");
                    break;
                }
                else if(n==40) {
                    tx.setText("Fourty");
                    break;
                }
                else if(n==50) {
                    tx.setText("Fifty");
                    break;
                }
                else if(n==60) {
                    tx.setText("Sixty");
                    break;
                }
                else if(n==70) {
                    tx.setText("Seventy");
                    break;
                }
                else if(n==80) {
                    tx.setText("Eighty");
                    break;
                }
                else if(n==90) {
                    tx.setText("Ninty");
                    break;
                }
                else if(n==100){
                    tx.setText("Hundred");
                    break;
                }
                {
                    if(m==1) {
                        tx.setText(S+" one");
                        break;
                    }
                    else if(m==2) {
                        tx.setText(S+" two");
                        break;
                    }
                    else if(m==3) {
                        tx.setText(S+" three");
                        break;
                    }
                    else if(m==4) {
                        tx.setText(S+" four");
                        break;
                    }
                    else if(m==5) {
                        tx.setText(S+" five");
                        break;
                    }
                    else if(m==6) {
                        tx.setText(S+" six");
                        break;
                    }
                    else if(m==7) {
                        tx.setText(S+" seven");
                        break;
                    }
                    else if(m==8) {
                        tx.setText(S+" eight");
                        break;
                    }
                    else if(m==9) {
                        tx.setText(S+" nine");
                        break;
                    }
                }
            }
        }





        if(n>101) {
            int x,y,l,b;
            m=n%100;		// 256
            k=m%10;			// y-I x-II k-III
            x=m/10;
            b=m/10;
            l=b;
            y=n/100;
            String s2="hundred and",S1="",S3="",S4="";

            switch(n) {
                case 101:
                {
                    tx.setText("one"+s2+"one");
                    break;
                }
                case 102:
                {
//		Res.setText("one"+s2+"two");
                    break;
                }
                case 103:
                {
//		Res.setText("one"+s2+"three");
                    break;
                }
                case 104:
                {
//		Res.setText("one"+s2+"four");
                    break;
                }
                case 105:
                {
//		Res.setText("one"+s2+"five");
                    break;
                }
                case 106:
                {
//		Res.setText("one"+s2+"six");
                    break;
                }
                case 107:
                {
//		Res.setText("one"+s2+"seven");
                    break;
                }
                case 108:
                {
//		Res.setText("one"+s2+"eigth");
                    break;
                }
                case 109:
                {
                    //	Res.setText("one"+s2+"nine");
                    break;
                }
            }


            if(y==1) {
                S="one";

            }
            else if(y==2) {
                S="two";

            }
            else if(y==3) {
                S="three";

            }
            else if(y==4) {
                S="four";

            }
            else if(y==5 ) {
                S="five";

            }
            else if(y==6) {
                S="six";

            }
            else if(y==7) {
                S="seven";

            }
            else if(y==8 ) {
                S="eight";

            }
            else if(y==9) {
                S="nine";

            }




            while(x!=0 && x!=1) {
                if(x==2) {
                    S3="Twenty";
                    break;
                }
                else if(x==3) {
                    S3="Thirty";
                    break;
                }
                else if(x==4) {
                    S3="Fourty";
                    break;
                }
                else if(x==5) {
                    S3="Fifty";
                    break;
                }
                else if(x==6) {
                    S3="Sixty";
                    break;
                }
                else if(x==7) {
                    S3="Seventy";
                    break;
                }
                else if(x==8) {
                    S3="Eighty";
                    break;
                }
                else if(x==9) {
                    S3="Ninty";
                    break;
                }
            }


            if(k!=0 && x!=0 && x!=1) {
                if(k==1) {
                    S1="one";

                }
                else if(k==2) {
                    S1="two";

                }
                else if(k==3) {
                    S1="three";

                }
                else if(k==4) {
                    S1="four";

                }
                else if(k==5 ) {
                    S1="five";

                }
                else if(k==6) {
                    S1="six";

                }
                else if(k==7) {
                    S1="seven";

                }
                else if(k==8 ) {
                    S1="eight";

                }
                else if(k==9) {
                    S1="nine";

                }
            }



            if(x==0 || x==1) {
                if(x==1 && k==0) {
                    S4="Ten";

                }
                else if(x==1 && k==1) {
                    S4="Eleven";

                }
                else if(x==1 && k==2) {
                    S4="Twelve";

                }
                else if(x==1 && k==3) {
                    S4="Thirteen";

                }
                else if(x==1 && k==4) {
                    S4="Fourteen";

                }
                else if(x==1 && k==5) {
                    S4="Fifteen";

                }
                else if(x==1 && k==6) {
                    S4="Sixteen";

                }
                else if(x==1 && k==7) {
                    S4="Seventeen";

                }
                else if(x==1 && k==8) {
                    S4="Eighteen";

                }
                else if(x==1 && k==9) {
                    S4="Ninteen";

                }
                else
                {
                    if(k==1) {
                        S1="one";

                    }
                    else if(k==2) {
                        S1="two";

                    }
                    else if(k==3) {
                        S1="three";

                    }
                    else if(k==4) {
                        S1="four";

                    }
                    else if(k==5 ) {
                        S1="five";

                    }
                    else if(k==6) {
                        S1="six";

                    }
                    else if(k==7) {
                        S1="seven";

                    }
                    else if(k==8 ) {
                        S1="eight";

                    }
                    else if(k==9) {
                        S1="nine";

                    }
                }


            }


            tx.setText(S+" "+s2+" "+S3+" "+S1+""+S4);



        }}

}
