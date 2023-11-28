package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecipesActivity extends AppCompatActivity {

    RecyclerView idRecyclerViewRecipes;
    List<Filmes> listaFilmesRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipes_layout);

        idRecyclerViewRecipes = findViewById(R.id.idRecyclerViewRecipes);

        listaFilmesRecipes = new ArrayList<>();

        listaFilmesRecipes.add(new Filmes("Jogos vorazes", "Ação", "Filme de ação", "4,5", R.drawable.jogos_vorazes));
        listaFilmesRecipes.add(new Filmes("Batman", "Ação", "Filme de ação", "4,5", R.drawable.batman));
        listaFilmesRecipes.add(new Filmes("Como eu era", "Ação", "Filme de ação", "4,5", R.drawable.como_eu_era));
        listaFilmesRecipes.add(new Filmes("Fora do mapa", "Ação", "Filme de ação", "4,5", R.drawable.fora_do_mapa));
        listaFilmesRecipes.add(new Filmes("John Wick", "Ação", "Filme de ação", "4,5", R.drawable.john_wick));
        listaFilmesRecipes.add(new Filmes("Luta pela fé", "Ação", "Filme de ação", "4,5", R.drawable.luta_pela_fe));
        listaFilmesRecipes.add(new Filmes("Missão sobrevivência", "Ação", "Filme de ação", "4,5", R.drawable.missao_sobrevivencia));
        listaFilmesRecipes.add(new Filmes("Pinóquio", "Ação", "Filme de ação", "4,5", R.drawable.pinoquio));
        listaFilmesRecipes.add(new Filmes("Homem aranha", "Ação", "Filme de ação", "4,5", R.drawable.spider_man));
        listaFilmesRecipes.add(new Filmes("Esquema de risco", "Ação", "Filme de ação", "4,5", R.drawable.esquema_risco));

        AdapterRecipe adapterRecipe = new AdapterRecipe(getApplicationContext(), listaFilmesRecipes);

        idRecyclerViewRecipes.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, true));

        idRecyclerViewRecipes.setHasFixedSize(true);

        idRecyclerViewRecipes.setAdapter(adapterRecipe);

    }
}