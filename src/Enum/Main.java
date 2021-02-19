package Enum;

import Enum.entities.Order;
import Enum.entities.enums.OrderStatus;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1, new Date(),OrderStatus.PENDENTE);
        System.out.print(order1);

        Order order2 = new Order(2, new Date(), Order.updateStatus("PAGO"));
        System.out.println(order2);

    }
}
