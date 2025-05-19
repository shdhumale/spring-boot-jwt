# spring-boot-jwt
This Sprintboot project is used to create JWT token from the given request parameter

Project Overview

This project demonstrates how to create a JWT token from a given request parameter in a Spring Boot application. 

Key Components

pom.xml: This file manages project dependencies. It includes Spring Boot Starter Web, Spring Boot Starter Security, and the jjwt library for JWT handling. 

SpringBootHelloWorldApplication.java: This is the main Spring Boot application class. 

config/: This directory contains configuration classes:

JwtAuthenticationEntryPoint.java: Handles unauthorized requests. It returns a 401 Unauthorized error. 

JwtRequestFilter.java: This filter intercepts incoming requests, extracts the JWT, validates it, and sets the authentication context. 

JwtTokenUtil.java: Provides utility methods for generating, validating, and extracting information from JWTs. 

WebSecurityConfig.java: Configures Spring Security, including authentication, authorization, and the JWT filter. 

controller/: Contains controllers:

HelloWorldController.java: A simple controller with a "/hello" endpoint that returns "Hello World". 

JwtAuthenticationController.java: Handles user authentication and generates the JWT. 

model/: Defines data models:

JwtRequest.java: Represents the authentication request with username, game ID, session ID, user ID, and score. 

JwtResponse.java: Represents the authentication response, which includes the JWT. 

MyUserDetails.java: A custom UserDetails class to hold user-specific data. 

service/: Contains service classes:

JwtUserDetailsService.java: A basic implementation of UserDetailsService (from Spring Security) for retrieving user details. 

MyJwtUserDetailsService.java: A custom service to load user details. 

resources/application.properties: Configuration properties, including the JWT secret key. 

Workflow

Authentication:
The client sends a request to the /authenticate endpoint with username, gameid, sid, userid, and score. 

The JwtAuthenticationController receives this request and uses the JwtTokenUtil to generate a JWT. 

The generated JWT is returned to the client in the response. 

Authorization:

When the client accesses other protected resources, it includes the JWT in the Authorization header (as "Bearer &lt;token>"). 

The JwtRequestFilter intercepts the request, extracts the JWT, and validates it using JwtTokenUtil. 

If the JWT is valid, the filter sets the authentication context, allowing the request to proceed to the intended resource. 

If the JWT is invalid or missing, the JwtAuthenticationEntryPoint returns an error
