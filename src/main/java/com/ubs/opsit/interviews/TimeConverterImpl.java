package com.ubs.opsit.interviews;

import com.ubs.opsit.utility.TimeConverterUtil;

public class TimeConverterImpl implements TimeConverter {

	@Override
	public String convertTime(String aTime) {
		String str[] = aTime.split(":");
		int seconds = Integer.parseInt(str[2]);
		int minutes = Integer.parseInt(str[1]);
		int hours = Integer.parseInt(str[0]);
		StringBuffer finalOutput = new StringBuffer("");
		finalOutput.append(TimeConverterUtil.getSymbolsForSeconds(seconds));
		finalOutput.append(TimeConverterUtil.getSymbolsForHours(hours));
		finalOutput.append(TimeConverterUtil.getSymbolsForMinutes(minutes));
		return finalOutput.toString();
	}

}
