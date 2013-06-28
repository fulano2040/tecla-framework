package com.android.tecla.addon;

import com.android.inputmethod.keyboard.KeyboardView;

public interface IMEAdapter2 {

	public void scanDown();
	public void scanLeft();
	public void scanRight();
	public void scanUp();
	
	public void scanNext();
	public void scanPrevious();
	
	public boolean setKeyboardView(KeyboardView kbv);
	
}
