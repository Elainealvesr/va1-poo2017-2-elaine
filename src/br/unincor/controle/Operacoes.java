package br.unincor.controle;

import java.util.List;

import br.unincor.exception.EvolucaoException;
import br.unincor.model.Pokemon;

public class Operacoes {
	
	/**
	 * Fazer com que este método não retorne nada e
	 * lance a 'EvolucaoException' quando o pokemon
	 * não estiver com CP para evoluir. Sempre
	 * que o pokemon não estiver com no mínimo de CP
	 * lance a 'EvolucaoException'. Se estiver com pelo
	 * menos o mínimo de CP, setar 1 no CP deste pokemon.
	 */
	public void evoluir(Pokemon p) throws EvolucaoException{
		if(p.getCp() >= 20){
			p.setCp(p.getCp() + 10);
		}
		else
			throw new EvolucaoException(p);
	}
	
	public Pokemon maiorCp(List<Pokemon> listaPokemons) {
		Pokemon pokemonMaiorCp = listaPokemons.get(0);
		
		for (Pokemon pokemon : listaPokemons) {
			if(pokemon.getCp() > pokemonMaiorCp.getCp())
				pokemonMaiorCp = pokemon;
		}
		return pokemonMaiorCp;
	}
	
	public Pokemon menorCp(List<Pokemon> listaPokemons) {
		Pokemon pokemonMenorCp = listaPokemons.get(0);
		
		for (Pokemon pokemon : listaPokemons) {
			if(pokemon.getCp() < pokemonMenorCp.getCp())
				pokemonMenorCp = pokemon;
		}
		return pokemonMenorCp;
	}

}

