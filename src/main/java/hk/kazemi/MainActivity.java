package hk.kazemi;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.List;

import Data.car;
import Data.carData;


public class MainActivity extends Activity {

    private static  final String LOGTAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<car> cars=new carData().getCars();
       LinearLayout layout=(LinearLayout) findViewById(R.id.layout);
        for (final car car:cars)
        {

            Button button=new Button(this);
            button.setText(car.carName);
            layout.addView(button);
            button.setOnClickListener(new  View.OnClickListener()
            {
               @Override
                public void onClick(View v)
               {
                 Intent intent =new Intent(MainActivity.this,detailactivity.class);
                   intent.putExtra("car name",car.carName);
                   intent.putExtra("image resource",car.imageresource);
                   intent.putExtra("instrctions",car.instructions);
                   startActivity(intent);
               }

            });
//Some Changes
        }



        Log.d(LOGTAG, "onCreate");

//        Button button2= (Button) findViewById(R.id.button2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,detailactivity.class);
//                startActivity(intent);
//            }
//        });
//
//        Button button3= (Button) findViewById(R.id.button3);
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String webpage ="http://enroll.azad.ac.ir/index.html";
//                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
//                startActivity(intent);
//
//            }
//        });
//
//        Button button4= (Button) findViewById(R.id.button4);
//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent();
//                intent.setAction(Intent.ACTION_SEND);
//                intent.putExtra(Intent.EXTRA_TEXT,"Hello from kazeminia");
//                intent.setType("Text/plain");
//                startActivity(intent);
//            }
//        });

        Toast.makeText(this,"Activity created", Toast.LENGTH_LONG).show();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent=null;
        switch (item.getItemId())
        {
            case R.id.action_activity_two:
                intent=new Intent(MainActivity.this,detailactivity.class);
                startActivity(intent);
                break;

            case R.id.action_external_url:
                String webpage ="http://enroll.azad.ac.ir/index.html";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
                startActivity(intent);

                break;

            case R.id.action_send_message:
                intent=new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,"Hello from kazeminia");
                intent.setType("text/plain");
                startActivity(intent);
                break;

            default:
                break;

        }
        return  super.onOptionsItemSelected(item);
    }



    public void gotoActivity(View v)
    {
        Intent intent = new Intent(this,detailactivity.class);
         startActivity(intent);
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOGTAG,"onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOGTAG,"onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOGTAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOGTAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOGTAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOGTAG,"onRestart");

    }
   public  void implicitViewURL (View v)
   {
       String webpage ="http://enroll.azad.ac.ir/index.html";
       Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
       startActivity(intent);
   }

    public  void implicitSendText (View v)
    {
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT,"Hello from kazeminia");
        intent.setType("text/plain");
        startActivity(intent);

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(this,"Landscape!",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"portrait",Toast.LENGTH_LONG).show();
        }
    }

}

