package com.fakhrinf.pokedex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.fakhrinf.pokedex.adapter.ListPokemonAdapter;
import com.fakhrinf.pokedex.model.Pokemon;
import com.fakhrinf.pokedex.model.PokemonData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_pokemon;
    private ArrayList<Pokemon> listPokemon = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_pokemon = findViewById(R.id.rv_pokemon);
        rv_pokemon.setHasFixedSize(true);

        listPokemon.addAll(PokemonData.getPokemon());
        showPokemonList();
    }

    private void showPokemonList() {
        rv_pokemon.setLayoutManager(new LinearLayoutManager(this));
        ListPokemonAdapter adapter = new ListPokemonAdapter(listPokemon);
        rv_pokemon.setAdapter(adapter);
    }
}
