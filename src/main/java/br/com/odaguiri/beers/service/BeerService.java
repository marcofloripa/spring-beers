package br.com.odaguiri.beers.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.odaguiri.beers.entity.Beer;

@Component
public class BeerService {

	private static List<Beer> beers;
	{
		beers = new ArrayList<Beer>();
		beers.add(new Beer(1, "Caium", "Pilsen", "Colorado"));
		beers.add(new Beer(2, "Appia", "Trigo", "Colorado"));
		beers.add(new Beer(3, "Indica", "IPA", "Colorado"));
	}
	
	public List<Beer> list() {
		return beers;
	}
}
