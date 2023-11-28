package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterRecipe extends RecyclerView.Adapter<AdapterRecipe.ViewHolder> {
    private Context mContext;
    private List<Filmes> lstFilmes;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.modelo_recipes, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtModeloRecipe.setText(lstFilmes.get(position).getTitulo());
        holder.imgModeloRecipe.setImageResource(lstFilmes.get(position).getImgFilmes());

    }

    @Override
    public int getItemCount() {
        return lstFilmes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgModeloRecipe;
        TextView txtModeloRecipe;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgModeloRecipe = itemView.findViewById(R.id.imgModeloRecipe);
            txtModeloRecipe = itemView.findViewById(R.id.txtModeloRecipe);
        }
    }
}
