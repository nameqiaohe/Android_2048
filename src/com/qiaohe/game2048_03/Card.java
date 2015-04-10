package com.qiaohe.game2048_03;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {

	private int num = 0;
	private TextView number;

	public Card(Context context) {
		super(context);
		number = new TextView(getContext());
		number.setGravity(Gravity.CENTER);
		number.setBackgroundColor(0x33ffffff);
		number.setTextSize(25);

		LayoutParams lp = new LayoutParams(-1, -1);
		lp.setMargins(10, 10, 0, 0);
		addView(number, lp);

		setNum(0);
	}

	public void setNum(int num) {
		this.num = num;
		if (num == 0)
			number.setText("");
		else
			number.setText(num + "");
	}

	public int getNum() {
		return num;
	}

	public boolean equals(Card c) {
		return getNum() == c.getNum();
	}
}
