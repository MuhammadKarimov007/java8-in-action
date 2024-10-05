package chapter5.in_action;

import domain.Trader;
import domain.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Solutions {
    public static void main(String[] args) {
        List<Transaction> transactions = Transaction.getTransactions();

//        Challenge 1
        List<Transaction> sol1 = transactions.stream()
                .filter(t -> t.year() == 2011)
                .sorted(Comparator.comparing(Transaction::value))
                .toList();
        System.out.println(sol1);

//        Challenge 2
        List<String> sol2 = transactions.stream()
                .map(Transaction::trader)
                .map(Trader::city)
                .distinct()
                .toList();
        System.out.println(sol2);

//        Challenge 3
        List<String> sol3 = transactions.stream()
                .map(Transaction::trader)
                .filter(trader -> trader.city().equals("Cambridge"))
                .map(Trader::name)
                .distinct()
                .sorted()
                .toList();
        System.out.println(sol3);

//        Challenge 4
        String sol4 = transactions.stream()
                .map(Transaction::trader)
                .map(Trader::name)
                .sorted()
                .reduce("", (a, b) -> a+b+" ");
        System.out.println(sol4);

//        Challenge 5
        boolean sol5 = transactions.stream()
                .map(Transaction::trader)
                .anyMatch(trader -> trader.city().equals("Milan"));
        System.out.println(sol5);

//        Challenge 6
        List<Integer> sol6 = transactions.stream()
                .filter(transaction -> transaction.trader().city().equals("Cambridge"))
                .map(Transaction::value)
                .toList();
        sol6.forEach(System.out::println);

//        Challenge 7
        Optional<Integer> sol7 = transactions.stream()
                .map(Transaction::value)
                .reduce(Integer::max);
        sol7.ifPresent(System.out::println);

//        Challenge 8
        Optional<Transaction> sol8 = transactions.stream()
                .min(Comparator.comparing(Transaction::value));
        sol8.ifPresent(System.out::println);
    }
}
