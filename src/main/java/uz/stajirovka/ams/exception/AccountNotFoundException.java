package uz.stajirovka.ams.exception;

import org.springframework.http.HttpStatus;

public class AccountNotFoundException extends BussinesException {
    public AccountNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
