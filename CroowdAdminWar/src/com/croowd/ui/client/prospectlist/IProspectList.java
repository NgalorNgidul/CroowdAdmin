package com.croowd.ui.client.prospectlist;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisActivity;

import com.croowd.ui.client.json.ProspectJso;
import com.google.gwt.user.client.ui.Widget;

public interface IProspectList {

	public void setActivity(Activity activity);

	public Widget getWidget();

	public void addData(ProspectJso data);
	
	public void reviewProspect(ProspectJso data);
	
	public void backToList();

	public abstract class Activity extends SIMbiosisActivity {
		public abstract void onBack();
		public abstract void onApprove();
		public abstract void onReject();
	}
}
