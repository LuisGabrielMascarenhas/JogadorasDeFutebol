package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context mContexto;
    private List<Jogadoras> lstJogadoras;

    public MyAdapter(Context mContexto, List<Jogadoras> lstJogadoras) {
        this.mContexto = mContexto;
        this.lstJogadoras = lstJogadoras;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_jogadora,parent,false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nomeJogadoras;
        ImageView imgJogadoras;
        CardView idCardJogadoras;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            nomeJogadoras = itemView.findViewById(R.id.nomeJogadoras);
            imgJogadoras = itemView.findViewById(R.id.imgJogadoras);
            idCardJogadoras = itemView.findViewById(R.id.idcardJogadoras);
        }
    }
}
