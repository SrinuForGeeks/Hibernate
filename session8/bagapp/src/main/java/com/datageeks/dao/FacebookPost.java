package com.datageeks.dao;

import java.io.Serializable;
import java.util.List;

public class FacebookPost implements Serializable {

	private Integer postId = null;
	private String postName = null;
	private String postedBy = null;
	private List<String> comments = null;

	public FacebookPost() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacebookPost(Integer postId, String postName, String postedBy) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.postedBy = postedBy;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

}
