package com.commentapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.commentapp.dao.CommentsRepository;
import com.commentapp.model.Comment;

@RestController
public class CommentAppController {

	@Autowired
	private CommentsRepository commentsRepository;

	@PostMapping("/saveComment")
	public Comment saveComment(@Valid @RequestBody Comment comment) {
		return commentsRepository.save(comment);
	}

	@GetMapping("/getComments")
	public List<Comment> getComments() {
		return commentsRepository.findAll();
	}

}
