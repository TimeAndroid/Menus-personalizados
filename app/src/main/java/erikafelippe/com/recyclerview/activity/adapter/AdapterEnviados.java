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

public class AdapterEnviados extends RecyclerView.Adapter<AdapterEnviados.MyViewHolder> {


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itens_enviados, parent, false);
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

        ImageView itensEnviados;
        TextView rastreamento;
        TextView data;
        TextView descricao;


        @SuppressLint("ResourceType")
        public MyViewHolder(View itemView) {
            super(itemView);

            itensEnviados = itemView.findViewById(R.drawable.icon_enviados);
            rastreamento = itemView.findViewById(R.id.rastreamento);
            data = itemView.findViewById(R.id.data);
            descricao = itemView.findViewById(R.id.descricao);
        }
    }
}