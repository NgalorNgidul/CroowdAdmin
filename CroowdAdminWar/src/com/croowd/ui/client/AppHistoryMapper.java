package com.croowd.ui.client;


import org.simbiosis.ui.gwt.client.mvp.SIMbiosisHistoryMapper;

import com.croowd.ui.client.place.ApproveProject;
import com.croowd.ui.client.place.Project;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ Project.Tokenizer.class, ApproveProject.Tokenizer.class })
public interface AppHistoryMapper extends SIMbiosisHistoryMapper {

}
