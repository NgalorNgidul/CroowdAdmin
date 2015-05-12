package com.croowd.ui.client;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisHistoryMapper;

import com.croowd.ui.client.places.InvestList;
import com.croowd.ui.client.places.MemberList;
import com.croowd.ui.client.places.ProspectList;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ ProspectList.Tokenizer.class, MemberList.Tokenizer.class,
		InvestList.Tokenizer.class })
public interface AppHistoryMapper extends SIMbiosisHistoryMapper {

}
