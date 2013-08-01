/**
 * 
 */
package org.ey.wx.honeybee.message.response;

import java.util.List;

import org.ey.wx.honeybee.entity.Article;

/**
 * News Message
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class NewsMessage extends ResponseMessage {
	private int numOfArticle; //number of article, maximum is 10
	
	private List<Article> articles; //multiple articles, the first item is big image by default

	public int getNumOfArticle() {
		return numOfArticle;
	}

	public void setNumOfArticle(int numOfArticle) {
		this.numOfArticle = numOfArticle;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
}
