package controller;

import view.OrderView;

public class OrderController extends Controller {

	OrderView orderView = new OrderView();

	@Override
	public void runController() {
		int keuze = 1;
		PrintControl.newView = true;
		do{
			if (PrintControl.newView == true){
				orderView.ClearTerminal();
				orderView.PrintMenuHeader();
				orderView.PrintMenuOptions();
				PrintControl.newView = false;
			}
			
		keuze = orderView.RequestMenuOption();
		switch (keuze) {
			case 1: 
			case 9: keuze = 0; PrintControl.newView = true; break;
			default:orderView.InvalidInput(); break;
				}
			}
		while(keuze != 0);
		}

}