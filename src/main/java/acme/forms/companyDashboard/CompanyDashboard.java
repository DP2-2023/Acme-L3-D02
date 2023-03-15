
package acme.forms.companyDashboard;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Integer						totalNumberOfPracticumPerMonth;
	Double						averageNumberOfPeriodLengthPerSession;
	Double						deviationNumberOfPeriodLengthPerSession;
	Double						minimumNumberOfPeriodLengthPerSession;
	Double						maximumNumberOfPeriodLengthPerSession;
	Double						averageNumberOfPeriodLengthPerPractica;
	Double						deviationNumberOfPeriodLengthPerPractica;
	Double						minimumNumberOfPeriodLengthPerPractica;
	Double						maximumNumberOfPeriodLengthPerPractica;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
