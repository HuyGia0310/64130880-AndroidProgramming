package com.example.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
//dây là bộ lắng nghe và xử ly sk click lên nút tính tổng
    public void XuLyCong(View view){
        //tìm,tham chiếu đến dữ liệu trên tệp XML
        EditText editTextsoA = findViewById(R.id.edtA);
        EditText editTextsoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
//lấy dữ liệu về ô điều khiển số a
        String strA= editTextsoA.getText().toString();
//lấy dữ liệu về ô điều khiển số b
        String strB= editTextsoB.getText().toString();

//chuyền dl sang dạng số
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
//tính toán theo yc
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong);
//hiện ra mh
        editTextKetQua.setText(strTong);

    }
}