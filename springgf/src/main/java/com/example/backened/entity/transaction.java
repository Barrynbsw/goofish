package com.example.backened.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class transaction {
    int productID;
    int transactionID;
    int sellerID;
    int buyerID;
}