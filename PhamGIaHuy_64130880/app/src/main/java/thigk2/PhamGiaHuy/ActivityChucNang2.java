package thigk2.PhamGiaHuy;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityChucNang2 extends AppCompatActivity {

    EditText edtTien;
    TextView txtKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.linearLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edtTien = findViewById(R.id.edtTien);
        txtKQ = findViewById(R.id.txtKQ);
    }

    public void doiTien(View view) {
        String tienNhap = edtTien.getText().toString();

        if (!tienNhap.isEmpty()) {
            double vnd = Double.parseDouble(tienNhap);
            double usd = vnd / 25000;
            txtKQ.setText("USD: " + usd);
        } else {
            txtKQ.setText("Vui lòng nhập tiền");
        }
    }
}