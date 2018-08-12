package com.ubs.opsit.utility;

import org.apache.commons.lang.StringUtils;

public class TimeConverterUtil {

	public static String getSymbolsForSeconds(int seconds) {
		return (seconds % 2 == 0 ? Constants.Y_WITH_NEXTLINE : Constants.O_WITH_NEXTLINE);
	}
	public static String getSymbolsForHours(int hours) {
		int secondLineHours = hours % 5;
		int firstLineHours = hours/5;
		String hourStr = "";
		String secondLineHourStr = "";
		for(int i=0; i<firstLineHours; i++){
			hourStr += Constants.R;
		}
		hourStr = StringUtils.rightPad(hourStr, 4, Constants.O) + Constants.NEXT_LINE;
		for(int i=0; i<secondLineHours; i++){
			secondLineHourStr += Constants.R;
		}
		secondLineHourStr = StringUtils.rightPad(secondLineHourStr, 4, Constants.O) + Constants.NEXT_LINE;
		return hourStr+secondLineHourStr;
	}
	public static Object getSymbolsForMinutes(int minutes) {
		int secondLineMinutes = minutes % 5;
		int firstLineMinutes = minutes/5;
		String minuteStr = "";
		String secondLineMinuteStr = "";
		for(int i=1; i<=firstLineMinutes; i++){
			if(i != 0 && i % 3 == 0){
				minuteStr += Constants.R;
			} else {
				minuteStr += Constants.Y;
			}
		}
		minuteStr = StringUtils.rightPad(minuteStr, 11, Constants.O) + Constants.NEXT_LINE;
		for(int i=0; i<secondLineMinutes; i++){
			secondLineMinuteStr += Constants.Y;
		}
		secondLineMinuteStr = StringUtils.rightPad(secondLineMinuteStr, 4, Constants.O);
		return minuteStr+secondLineMinuteStr;

	}
}
