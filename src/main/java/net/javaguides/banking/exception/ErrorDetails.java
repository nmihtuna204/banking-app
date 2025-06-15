package net.javaguides.banking.exception;
 import java.time.LocalDateTime;

public record ErrorDetails (LocalDateTime timestamp,
                            String message,
                            String details,
                            String errorCode) {
    // No additional methods or fields needed, as this is a simple record for error details
}
