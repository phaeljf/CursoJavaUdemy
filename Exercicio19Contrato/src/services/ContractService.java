package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ContractService {

    private final OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.onlinePaymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months) {

        double amountPerMonths = contract.getTotalValue()/months;

        for (int i = 1; i <= months; i++) {

            Double dueInterest = onlinePaymentService.interest(amountPerMonths,i);
            Double dueFee = onlinePaymentService.paymentFee(dueInterest + amountPerMonths);

            contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), amountPerMonths+dueInterest+dueFee));

        }
    }

/*
    //o professsor fez
        public void processContract(Contract contract, Integer months) {

        double basicQuota = contract.getTotalValue() / months;
        List<Installment> installments = contract.getInstallments();


        for (int i = 1; i <= months; i++) {

            LocalDate dueDate = contract.getDate().plusMonths(i);

            Double interest = onlinePaymentService.interest(basicQuota,i);
            Double fee = onlinePaymentService.paymentFee(interest + basicQuota);
            double quota = basicQuota + interest + fee;

            contract.getInstalments().add(new Installments(dueDate, quota);

        }
    }

*/
}
