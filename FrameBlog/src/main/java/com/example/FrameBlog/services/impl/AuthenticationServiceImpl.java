package com.example.FrameBlog.services.impl;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.example.FrameBlog.models.User;
import com.example.FrameBlog.repositories.UserRepository;
import com.example.FrameBlog.request.AuthRequest;

@Service
public class AuthenticationServiceImpl {

	 @Autowired
	 private UserRepository userRepository;
	 
	 public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException{
		 return userRepository.findByUserName(login);
	 }
	    
	 public String getToken(AuthRequest auth){
		 User user = userRepository.findByUserName(auth.getUsername());
		 return generateToken(user);
	 }
	 
	 public  String generateToken(User user) {
		 try {
			 Algorithm algorithm = Algorithm.HMAC256("my-secret");
			 return JWT.create()
					 .withIssuer("FrameBlog")
	                 .withSubject(user.getUsername())
	                 .withExpiresAt(getExpirationDate())
	                 .sign(algorithm);
	        } catch (JWTCreationException exception) {
	            throw new RuntimeException("Fail to generate token" + exception.getMessage());
	        }
	    }
	 
	    public String validateJwtToken(String token) {
	        try {
	            Algorithm algorithm = Algorithm.HMAC256("my-secret");
	            return JWT.require(algorithm)
	                    .withIssuer("FrameBlog")
	                    .build()
	                    .verify(token)
	                    .getSubject();
	        } catch (JWTVerificationException exception) {
	            return "";
	        }
	    }
	    
	    private Instant getExpirationDate() {
	        return LocalDateTime.now()
	                .plusHours(8)
	                .toInstant(ZoneOffset.of("+01:00"));
	    }

}
