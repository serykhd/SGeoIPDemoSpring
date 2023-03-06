package ru.serykhd.geoipdemospring.exception;

import lombok.NonNull;
import lombok.experimental.StandardException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
@StandardException
public class InvalidAddressException extends ru.serykhd.common.net.address.exception.InvalidAddressException {

}
