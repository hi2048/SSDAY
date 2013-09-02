package net.ssday.entity;

// default package
// Generated 2011-11-15 13:13:18 by Hibernate Tools 3.4.0.CR1

/**
 * Article generated by hbm2java
 */
public class Article implements java.io.Serializable {

	private Integer id;
	private String title;
	private String author;
	private String time;
	private Integer type;
	private String content;
	private String info;
	private String keywords;
	private String[] paragraphs;

	public Article() {
	}

	public Article(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public Article(String title, String author, String time, Integer type,
			String content, String info, String keys) {
		this.title = title;
		this.author = author;
		this.time = time;
		this.type = type;
		this.content = content;
		this.info = info;
		this.keywords = keys;
	}

	public String[] getParagraphs() {
		return paragraphs;
	}

	public void setParagraphs(String[] paragraphs) {
		this.paragraphs = paragraphs;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keys) {
		this.keywords = keys;
	}

}