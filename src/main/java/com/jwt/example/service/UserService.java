package com.jwt.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jwt.example.models.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();
}
