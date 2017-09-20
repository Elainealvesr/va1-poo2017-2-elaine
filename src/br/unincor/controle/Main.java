package br.unincor.controle;


import java.util.ArrayList;
import java.util.List;
import br.unincor.exception.EvolucaoException;
import br.unincor.model.Pokemon;
import br.unincor.view.Usuario;

public class Main {

	public static void main(String[] args) {
			Usuario u = new Usuario();
			Operacoes o = new Operacoes();
			List<Pokemon> listaPokemons = new ArrayList<Pokemon>();
			
			Long qtdPokemon = u.recebeLong("Entre com a qtd de  pokemons: ");
			
			for(int i = 0; i < qtdPokemon; i++){
				Pokemon p = new Pokemon(
					u.recebeTexto("Nome do Pokemon: "),
					u.recebeTexto("Tipo do Pokemon: "),
					u.recebeDouble("Peso do Pokemon: "),
					u.recebeDouble("Altura do Pokemon: ")
				);
				
				listaPokemons.add(p);
			}
			
			for(int i = 0; i < listaPokemons.size(); i++){
				try{
					o.evoluir(listaPokemons.get(i));
				}catch(EvolucaoException ee){
					u.exibeMsgErro(ee.getMessage());
				}
			}
			
			u.exibeMsg("Maior CP " + o.maiorCp(listaPokemons).verDados());
			u.exibeMsg("Menor CP " + o.menorCp(listaPokemons).verDados());
		}

		
	}


