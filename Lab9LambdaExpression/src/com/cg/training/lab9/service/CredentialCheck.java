package com.cg.training.lab9.service;

@FunctionalInterface
public interface CredentialCheck {
	Boolean test(String userid,String password);
}
