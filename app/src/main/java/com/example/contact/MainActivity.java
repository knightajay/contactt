package com.example.contact;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Contact[] contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create contacts array using a loop
        contacts = new Contact[10];
        for (int i = 0; i < 10; i++) {
            contacts[i] = new Contact(i + 1, "355465276", "AJay");
        }

        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
    }
}
