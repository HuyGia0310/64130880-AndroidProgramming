package thigk2.PhamGiaHuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityChucNang3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView listView = findViewById(R.id.listView);

        ArrayAdapter<String> dsCaKhuc =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        dsCaKhuc.add("Tiến Quân Ca");
        dsCaKhuc.add("Như Có Bác Hồ Trong Ngày Vui Đại Thắng");
        dsCaKhuc.add("Cô Gái Mở Đường");
        dsCaKhuc.add("Đất Nước Trọn Niềm Vui");
        dsCaKhuc.add("Trường Sơn Đông Trường Sơn Tây");
        dsCaKhuc.add("Bài Ca Hy Vọng");
        dsCaKhuc.add("Chiếc Gậy Trường Sơn");
        dsCaKhuc.add("Mùa Xuân Trên Thành Phố Hồ Chí Minh");
        dsCaKhuc.add("Hành Khúc Ngày Và Đêm");
        dsCaKhuc.add("Phạm Gia Huy");

        listView.setAdapter(dsCaKhuc);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                startActivity(
                        new Intent(ActivityChucNang3.this, Item3Activity.class)
                                .putExtra("ten_bai_hat",
                                        dsCaKhuc.getItem(position))
                );
            }
        });
    }
}
