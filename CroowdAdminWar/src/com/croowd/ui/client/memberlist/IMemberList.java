package com.croowd.ui.client.memberlist;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisActivity;

import com.croowd.ui.client.json.MemberJso;
import com.google.gwt.user.client.ui.Widget;

public interface IMemberList {

	public void setActivity(Activity activity);

	public Widget getWidget();

	public void addData(MemberJso data);

	public void viewMember(MemberJso data);

	public void backToList();

	public void reloadList();

	public abstract class Activity extends SIMbiosisActivity {
		public abstract void onBack();

	}
}
