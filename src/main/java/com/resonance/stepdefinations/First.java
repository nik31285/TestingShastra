package com.resonance.stepdefinations;

import com.resonance.keywords.UIkeywords;

public class First {
	public void m1() {
		UIkeywords keyword=new UIkeywords();
		keyword.openBrowser("chrome");
		keyword.launchURL("https://testingshastra.com/");
		
	}
}
