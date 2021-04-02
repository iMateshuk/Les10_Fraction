package by.htp.les10.start;

import by.htp.les10.entity.Fraction;
import by.htp.les10.logic.FractionLogic;
import by.htp.les10.presentation.FractionView;

public class Main {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 4);
		
		Fraction f3;
		
		FractionLogic logic = new FractionLogic();
		
		f3 = logic.sum(f1, f2);
		
		FractionView view = new FractionView();
		logic.reduction(f3);
		
		view.printSum(f1, f2, f3);

	}

}
