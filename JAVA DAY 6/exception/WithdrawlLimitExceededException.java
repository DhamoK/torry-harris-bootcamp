package com.torryharris.exception;

public class WithdrawlLimitExceededException extends Exception {
    public WithdrawlLimitExceededException(String message) {
        super(message);
    }
}
