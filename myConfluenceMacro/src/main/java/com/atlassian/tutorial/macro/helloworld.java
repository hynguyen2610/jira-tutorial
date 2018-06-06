package com.atlassian.tutorial.macro;

import com.atlassian.confluence.content.render.xhtml.ConversionContext;
import com.atlassian.confluence.macro.Macro;
import com.atlassian.confluence.macro.MacroExecutionException;

import java.util.Map;

public class helloworld implements Macro {
	public String execute (Map<String, String> map, String s, ConversionContext conversionContext) throws
		MacroExecutionException {
		if(map.get("Name") != null) {
			return ("<h1>Hello " + map.get("Name") + "!</h1>");
		}
		else
		{
			return "<h1>Hello world</h1";
		}
	}

	public BodyType getBodyType() {
		return BodyType.NONE;
	}

	public OutputType getOutputType() {
		return OutputType.BLOCK;
	}
}