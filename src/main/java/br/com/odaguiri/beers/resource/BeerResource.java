package br.com.odaguiri.beers.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.odaguiri.beers.entity.Beer;
import br.com.odaguiri.beers.service.BeerService;

@RestController
@RequestMapping("/v1/beer")
public class BeerResource {

	@Autowired
	private BeerService beerService;

	@GetMapping
	public ResponseEntity<List<Beer>> list() {
		List<Beer> beers = beerService.list();
		return ResponseEntity.ok().body(beers);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Beer> get(@PathVariable("id") Integer id) {
		Beer beer = null;
		return ResponseEntity.ok().body(beer);
	}
	
}
