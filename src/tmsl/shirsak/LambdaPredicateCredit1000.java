package tmsl.shirsak;
/*You have a list of Transaction objects, and each Transaction has certain properties, such as type
(e.g., “Credit” or “Debit”) and amount (a numerical value representing the transaction amount).

Goal

    •  You need to filter this list of transactions based on two criteria:
        1. The transaction is of type “Credit”.
        2. The transaction amount is greater than $1,000.
    •  You will use two predicates to represent these criteria. A Predicate is a functional interface in Java
        that represents a boolean-valued function of one argument. In this case, the argument will be a Transaction
        object.
    •  After defining these two predicates, you need to combine them to filter out transactions that satisfy
    either of the two conditions. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

class Transaction {
    private String type;
    private int amount;

    public Transaction(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return type + " " + amount;
    }
}

class RecordTransactions {
    List<String> recordType = new ArrayList<>();
    List<Integer> recordAmount = new ArrayList<>();

    public void recordTransaction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of transactions: ");
        int getNumberOfTransactions = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < getNumberOfTransactions; i++) {
            System.out.println("Enter the type of transaction: ");
            recordType.add(sc.nextLine());
            System.out.println("Enter the amount of transaction: ");
            recordAmount.add(sc.nextInt());
            if (i != getNumberOfTransactions - 1) {
                sc.nextLine();
            }
        }
    }

    public List<Transaction> createTransaction() {
        List<Transaction> transactions = new ArrayList<>();
        for (int i = 0; i < recordType.size(); i++) {
            transactions.add(new Transaction(recordType.get(i), recordAmount.get(i)));
        }
        return transactions;
    }
}

class FilterTransactions {
    RecordTransactions recordTransactions = new RecordTransactions();

    public void print() {
        recordTransactions.recordTransaction();
        List<Transaction> transactions = recordTransactions.createTransaction();
        filterTransactions(transactions);
    }

    public void filterTransactions(List<Transaction> transactions) {
        Predicate<String> checkCredit = str -> str.equalsIgnoreCase("Credit");
        Predicate<Integer> checkGreaterThan1000 = amt -> amt > 1000;

        List<Transaction> filteredList = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (checkCredit.test(transaction.getType()) || checkGreaterThan1000.test(transaction.getAmount())) {
                filteredList.add(transaction);
            }
        }
        System.out.println(filteredList);
    }


}

public class LambdaPredicateCredit1000 {
    public static void main(String[] args) {
        new FilterTransactions().print();
    }
}
