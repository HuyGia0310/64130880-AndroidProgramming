package ntu.huy.baith5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;


public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }

    void TimDieuKhien() {
        EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        EditText editTextKQ = findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);

    }

    public void XuLyCong(View v) {
        //tìm edtSo1 va So2
        //lấy dữ liệu từ 2 dkhien đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //tính toán
        float Tong = soA + soB;
        //hiện kq
        //chuẩn bị dữ liệu xuất biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //gán kq lên dk
        editTextKQ.setText(chuoiKQ);
    }

    public void XuLyTru(View v) {
        //tìm edtSo1 va So2
        //lấy dữ liệu từ 2 dkhien đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //tính toán
        float Hieu = soA - soB;
        //hiện kq
        //chuẩn bị dữ liệu xuất biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Hieu);
        //gán kq lên dk
        editTextKQ.setText(chuoiKQ);
    }

    public void XuLyNhan(View v) {
        //tìm edtSo1 va So2

        //lấy dữ liệu từ 2 dkhien đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //tính toán
        float Tich = soA * soB;
        //hiện kq

        //chuẩn bị dữ liệu xuất biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tich);
        //gán kq lên dk
        editTextKQ.setText(chuoiKQ);
    }

    public void XuLyChia(View v) {
//tìm edtSo1 va So2

        //lấy dữ liệu từ 2 dkhien đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //tính toán
        float Thuong = soA + soB;
        //hiện kq
        //chuẩn bị dữ liệu xuất biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Thuong);
        //gán kq lên dk
        editTextKQ.setText(chuoiKQ);
    }
}