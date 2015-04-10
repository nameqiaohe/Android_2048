package com.qiaohe.game2048_03;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView scoreShow;
	private static MainActivity mainActivity = null;
	
	public MainActivity() {
		mainActivity = this;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		scoreShow = (TextView) findViewById(R.id.showId);
		
	}

	public static MainActivity getMainActivity() {
		return mainActivity;
	}
	
	private int score = 0;
	public void clearScore() {
		score = 0;
		showScore();
	}
	
	public void showScore() {
		scoreShow.setText(score+"");
	}
	
	public void addScore(int s) {
		score += s;
		showScore();
	}
	
}
