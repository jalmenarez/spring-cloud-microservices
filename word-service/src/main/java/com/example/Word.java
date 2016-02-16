package com.example;

public class Word {
	
	private String word;

	@Override
	public String toString() {
		return "Word [word=" + word + "]";
	}

	public Word(String word) {
		super();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}
