package com.book.bookapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.book.bookapplication.repository.UserRepository;


@Service
public class UserService {
@Autowired
UserRepository userRepo;


}
