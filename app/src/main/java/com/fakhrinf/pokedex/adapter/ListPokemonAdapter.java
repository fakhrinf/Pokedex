package com.fakhrinf.pokedex.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.fakhrinf.pokedex.R;
import com.fakhrinf.pokedex.model.Pokemon;

import java.util.ArrayList;

public class ListPokemonAdapter extends RecyclerView.Adapter<ListPokemonAdapter.ListViewHolder> {

    private ArrayList<Pokemon> listPokemon;

    public ListPokemonAdapter(ArrayList<Pokemon> list) {
        this.listPokemon = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_item_list, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Pokemon pokemon = listPokemon.get(position);
        holder.tvName.setText(pokemon.getName().replaceFirst("[a-z]{1}", pokemon.getName().substring(0,1).toUpperCase()));
        holder.tvCatch.setText("Catch Rate: " + pokemon.getCatchprobability());
        holder.tvType.setText(pokemon.getType().toUpperCase());
        Glide.with(holder.itemView.getContext()).load(pokemon.getImgdata()).apply(new RequestOptions().override(60,60)).into(holder.imgPokemon);
    }

    @Override
    public int getItemCount() {
        return listPokemon.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvType, tvCatch;
        ImageView imgPokemon;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_namapokemon);
            tvType = itemView.findViewById(R.id.type_pokemon);
            tvCatch = itemView.findViewById(R.id.tv_catchrate);
            imgPokemon = itemView.findViewById(R.id.img_pokemon);
        }
    }
}
