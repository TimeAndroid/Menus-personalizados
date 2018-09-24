package erikafelippe.com.recyclerview.activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import erikafelippe.com.recyclerview.R;
import erikafelippe.com.recyclerview.activity.adapter.AdapterEntregues;
import erikafelippe.com.recyclerview.activity.adapter.AdapterEnviados;
import erikafelippe.com.recyclerview.activity.adapter.AdapterPendentes;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerEnviados);

        //configurar adapter
        AdapterEnviados adapterEnviados = new AdapterEnviados();
        AdapterPendentes adapterPendentes = new AdapterPendentes();
        AdapterEntregues adapterEntregues = new AdapterEntregues();


        //configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true); //otimiza o recycler com tamanho fixo
        recyclerView.setAdapter(adapterPendentes);



    }
}
