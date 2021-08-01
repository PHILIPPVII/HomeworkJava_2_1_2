public class Two {
    public static void main(String[] args) {
        int addMoney = 1100;
        int bonus;
        int balance = 100 + addMoney;
        if (addMoney > 1000)
        {
            bonus = addMoney / 100;
            System.out.println("Поздравляем вам начислены бонусы в размере:" + bonus + "балл");
            System.out.println("Ваш итоговый баланс равен:" + balance);
        }
        else {
            System.out.println("Пополнен баланс на сумму:" + addMoney + "рублей");
            System.out.println("Ваш итоговый баланс равен:" + balance);
        }
    }
}

