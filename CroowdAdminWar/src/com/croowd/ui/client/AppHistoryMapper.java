package com.croowd.ui.client;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisHistoryMapper;

import com.croowd.ui.client.place.Approval;
import com.croowd.ui.client.place.Project;
import com.croowd.ui.client.place.ProspectList;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ ProspectList.Tokenizer.class, Project.Tokenizer.class,
		Approval.Tokenizer.class })
public interface AppHistoryMapper extends SIMbiosisHistoryMapper {

}
