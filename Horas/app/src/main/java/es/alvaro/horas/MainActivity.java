package es.alvaro.horas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Date fecha= new Date();
        TextView lblDateShow=findViewById(R.id.LblDateShow);
        String strDateFormat = "dd/MM/YYYY";
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
        lblDateShow.setText(objSDF.format(fecha));
        TextView date= findViewById(R.id.lblDate);
        date.setTextSize(20);
        TextView lblTimeShow=findViewById(R.id.LblTimeShow);
        TextView time=findViewById(R.id.lblTime);
        time.setTextSize(20);
        String strDateFormat2 = "HH:mm";
        SimpleDateFormat objSDF2 = new SimpleDateFormat(strDateFormat2);
        lblTimeShow.setText(objSDF2.format(fecha));
        lblDateShow.setTextSize(20);
        lblTimeShow.setTextSize(20);

    }
}
