package erikafelippe.com.recyclerview.activity.adapter;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import erikafelippe.com.recyclerview.R;

public class AdapterPendentes extends RecyclerView.Adapter<AdapterPendentes.MyViewHolder> {


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itens_pendentes, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.rastreamento.setText("codigo");
        holder.data.setText("data");
        holder.descricao.setText("descricao");
    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView itensPendentes;
        TextView rastreamento;
        TextView data;
        TextView descricao;


        @SuppressLint("ResourceType")
        public MyViewHolder(View itemView) {
            super(itemView);

            itensPendentes = itemView.findViewById(R.drawable.icon_pendentes);
            rastreamento = itemView.findViewById(R.id.rastreamento);
            data = itemView.findViewById(R.id.data);
            descricao = itemView.findViewById(R.id.descricao);
        }
    }
}