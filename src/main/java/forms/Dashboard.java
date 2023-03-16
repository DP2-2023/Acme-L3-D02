package forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Dashboard extends AbstractForm{
	
	protected static final long serialVersionUID = 1L;
	
	Integer	totalNumberOfPrincipalsWithEachRole;
	Double	ratioOfPeepsWithBothAnEmailAddressAndALink;
	Double	ratiosOfCriticalAndNonCriticalBulletins;
	Double	averageOfTheBudgetInTheOffersGroupedByCurrency;
	Double	minimunOfTheBudgetInTheOffersGroupedByCurrency;
	Double	maxumumOfTheBudgetInTheOffersGroupedByCurrency;
	Double	standardDesviationOfTheBudgetInTheOffersGroupedByCurrency;
	Double	averageOfTheNumberOfNotesPostedOverTheLast10Weeks;
	Double	minimumOfTheNumberOfNotesPostedOverTheLast10Weeks;
	Double	maximumOfTheNumberOfNotesPostedOverTheLast10Weeks;
	Double	standardDesviationOfTheNumberOfNotesPostedOverTheLast10Weeks;


}
