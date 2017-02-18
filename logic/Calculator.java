package logic;

import entities.Item;

public class Calculator {
	
	private Item bolts;
	private Item nuts;
	
	public Calculator(Item[] items) {
		this.bolts = items[0];
		this.nuts = items[1];
	}
	
	private Item determineUnusedItems() { //����������, ����� ��� ������� ������� ��� ����
		if (bolts.calculateRemainingAmount()>nuts.calculateRemainingAmount()) {
			return bolts;
		} else {
			return nuts;
		}
	}
	
	private int calculateUnpairedAmount() { //�������, ������� �������� ������� ��� ���� 
		return Math.abs(bolts.calculateRemainingAmount()-nuts.calculateRemainingAmount());
	}
	
	private int getCostOfUnpaired() { //���������� ��������� �������, ���������� ��� ���� (�����������)
		if (determineUnusedItems().equals(bolts)) {
			return calculateUnpairedAmount()*bolts.getCostOfOne();
		} else {
			return calculateUnpairedAmount()*nuts.getCostOfOne();
		}
	}
	
	public int calculateSumLost() { //���������� ��������� ���������
		return getCostOfUnpaired()+bolts.calculateCostOfLost()+nuts.calculateCostOfLost();
	}

}
