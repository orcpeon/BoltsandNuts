package entities;

import fileutils.InputReader;

public class ItemCreator {
	
	private InputReader inputReader;
	
	public ItemCreator(InputReader inputReader) {
		this.inputReader = inputReader;
	}
	
	public Item[] createItems() { //возвращает массив двумя Item-объектами 
		Item bolts = new Item(inputReader.convertStrings()[0], inputReader.convertStrings()[1], inputReader.convertStrings()[2]);
		Item nuts = new Item(inputReader.convertStrings()[3], inputReader.convertStrings()[4], inputReader.convertStrings()[5]);
		
		Item[] items = new Item[2];
		
		items[0] = bolts;
		items[1] = nuts;
		
		return items;
	}

}
