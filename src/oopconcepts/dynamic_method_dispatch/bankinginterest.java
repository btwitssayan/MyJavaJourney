class Bank {
    float getInterest() {
        return 0.0f;
    }
}

class SBI extends Bank {
    float getInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getInterest() {
        return 9.7f;
    }
}

public class BankingInterest {
    public static void main(String[] args) {
        Bank B;
        B = new SBI();
        float Interest1 = B.getInterest();
        System.out.println(Interest1);

        B = new ICICI();
        float Interest2 = B.getInterest();
        System.out.println(Interest2);

        B = new AXIS();
        float Interest3 = B.getInterest();
        System.out.println(Interest3);

    }
}
