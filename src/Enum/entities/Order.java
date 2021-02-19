package Enum.entities;

import Enum.entities.enums.OrderStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public static OrderStatus updateStatus(String s) {
        return OrderStatus.valueOf(s);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("id=").append(id);
        sb.append(", moment=").append(moment);
        sb.append(", status=").append(status);
        sb.append('}' + "\n");
        return sb.toString();
    }
}
