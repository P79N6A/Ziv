package data.view.homework.model;

import java.util.List;

public class CourseGctAnswer {
	
	private String name;
	private int count;
	private List<String> answers;
	private CourseGctAnswerAnalyzer courseGctAnswerAnalyzer;
	
	public CourseGctAnswer() {
		courseGctAnswerAnalyzer = new CourseGctAnswerAnalyzer(this);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "SingleGctAnswer [name=" + name + ", count=" + count
				+ ", answers=" + answers + "]";
	}

	public CourseGctAnswerAnalyzer getAnalyzer() {
		return courseGctAnswerAnalyzer;
	}

	public void setAnalyzer(CourseGctAnswerAnalyzer analyzer) {
		this.courseGctAnswerAnalyzer = analyzer;
	}

}
