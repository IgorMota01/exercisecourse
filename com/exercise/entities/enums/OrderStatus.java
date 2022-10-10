package com.exercise.entities.enums;

public enum OrderStatus {
    PAGAMENTO_PENDENTE,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE;

    public static OrderStatus getByStatus(String status) {
        OrderStatus result = null;
        for (OrderStatus item : OrderStatus.values()) {
          if (item.equals(result)) {
            result = item;
          }
        }
        return result;
      }
}
