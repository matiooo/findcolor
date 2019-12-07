package ir.hhadanooo.getcolor1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Bitmap mBitmap;
    @SuppressLint("WrongThread")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv = findViewById(R.id.tv);
        //int w = 300, h = 300;

        final Bitmap bitmap = BitmapFactory.decodeResource(getResources() , R.drawable.hhdanooo , null);
        //Bitmap.Config conf = Bitmap.Config.ARGB_8888; // see other conf types
        //Bitmap bmp = Bitmap.createBitmap(w, h, conf); // this creates a MUTABLE bitmap
        mBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        //Bitmap myBitmap = Bitmap.createScaledBitmap(mBitmap,200,300,false);








        //tv.setText("red : " + Color.red(mBitmap.getPixel(9,12)) + "\n");
        //tv.append("green : " + Color.green(mBitmap.getPixel(9,12)) + "\n");
        //tv.append("blue : " + Color.blue(mBitmap.getPixel(9,12)) + "\n");

        tv.setText("width : " + mBitmap.getWidth() + "\n");
        tv.append("height : " + mBitmap.getHeight() + "\n");


        /*String file_path = Environment.getExternalStorageDirectory().getAbsolutePath() +
                "/raminhacker";
        File dir = new File(file_path);
        if(!dir.exists())
            dir.mkdirs();
        File file = new File(dir, "hhdanooo"+ ".png");
        FileOutputStream fOut = null;
        try {
            fOut = new FileOutputStream(file);
            myBitmap.compress(Bitmap.CompressFormat.PNG, 100, fOut);
            fOut.flush();
            fOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

         */





    }
    public int pxToDp(int px) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return Math.round(px / (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }
}
