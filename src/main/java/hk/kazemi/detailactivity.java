package hk.kazemi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dell on 7/2/2015.
 */public class detailactivity extends Activity


 {

    @Override
   protected void onCreate(Bundle savedInstancestate)
    {

        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_detail);

        getActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent=getIntent();
        String carName =intent.getStringExtra("car name");
        int imageresource =intent.getIntExtra("imageresource",0);
        String instructions =intent.getStringExtra("instructions");

        TextView tv =(TextView) findViewById(R.id.textView);
        tv.setText(carName);
        tv =(TextView)findViewById(R.id.textView2);
        tv.setText(instructions);
        ImageView image =(ImageView) findViewById(R.id.imageView);
        image.setImageResource(imageresource);

    }

     @Override

         public boolean onOptionsItemSelected(MenuItem item)
         {
             if (item.getItemId()== android.R.id.home)
             {
                 finish();
             }
             return super.onOptionsItemSelected(item);

         }

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         MenuItem item=menu.add(R.string.external_url);
         item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
         {
             @Override
             public boolean onMenuItemClick(MenuItem item) {
                 String webpage ="http://enroll.azad.ac.ir/index.html";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
                 startActivity(intent);
                 return false;
             }
         });
         return super.onCreateOptionsMenu(menu);
     }



 }
