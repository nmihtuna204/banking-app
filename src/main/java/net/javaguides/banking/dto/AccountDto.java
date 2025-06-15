package net.javaguides.banking.dto;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
//public class AccountDto {
//    private Long Id;
//    private String accountHolderName;
//    private double balance;

public record AccountDto(
    Long id,
    String accountHolderName,
    double balance
) {
    // No additional methods or fields needed, as this is a simple DTO
}
