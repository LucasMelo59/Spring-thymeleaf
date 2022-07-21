package br.com.lucas.exception;

import org.springframework.web.server.ResponseStatusException;

public class UserException extends RuntimeException {

    private String erro_Message;
    private ResponseStatusException statusException;

    public UserException(String erro_Message, ResponseStatusException statusException) {
        super(erro_Message);
        this.statusException = statusException;
    }


}
