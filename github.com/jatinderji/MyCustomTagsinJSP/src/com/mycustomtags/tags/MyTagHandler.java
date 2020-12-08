package com.mycustomtags.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport{
	
	private int number;
	
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public int doStartTag() throws JspException {

		JspWriter out = pageContext.getOut();
		
		try {
			out.print("<hr>");
			for(int i=1;i<=10;i++)
				out.print(number+" x "+i+" = "+(number*i)+"<br>");
			out.print("<hr>");
		}
		catch (IOException e) {
			e.getMessage();
		}

		return SKIP_BODY;
	}

}
