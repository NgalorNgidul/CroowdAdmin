package com.croowd.ui.client.investlist;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisActivity;

import com.croowd.ui.client.json.InvestPlanJso;
import com.google.gwt.user.client.ui.Widget;

public interface IInvestList {

	public void setActivity(Activity activity);

	public Widget getWidget();

	public void clearResultData();

	public void addResultData(InvestPlanJso data);

	public void noResultData();

	// public void editProspect(ProspectJso data);

	public void backToList();

	// public ProspectJso getData();

	public abstract class Activity extends SIMbiosisActivity {
		public abstract void onBack();

		public abstract void onSave();

	}
}
