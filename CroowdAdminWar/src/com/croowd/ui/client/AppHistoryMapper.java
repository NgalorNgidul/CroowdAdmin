package com.croowd.ui.client;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisHistoryMapper;

import com.croowd.ui.client.place.MemberList;
import com.croowd.ui.client.place.ProspectList;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ ProspectList.Tokenizer.class, MemberList.Tokenizer.class })
public interface AppHistoryMapper extends SIMbiosisHistoryMapper {

}
